package quick.keys.utils;

import java.time.LocalDate;
import quick.keys.entities.Car;
import quick.keys.entities.Notification;
import quick.keys.entities.User;
import org.springframework.stereotype.Component;
import quick.keys.services.CarService;
import quick.keys.services.NotificationService;
import quick.keys.services.UserService;

@Component
public class MidnightApplicationRefresh {

	// class attributes :
    final CarService carService;
    final UserService userService;
    final NotificationService notificationService;

    // class constructor :
	public MidnightApplicationRefresh(CarService carService, UserService userService, NotificationService notificationService) {
		this.carService = carService;
		this.userService = userService;
		this.notificationService = notificationService;
	}

	// class methods :
    public void midnightApplicationRefresher() { //Removes overdue reservations and notifications.

        for (Car car : carService.findAll()) {
            if (car.getEndReservationDate() != null) {
                if (car.getEndReservationDate().compareTo(LocalDate.now()) < 0) {
                    if (car.getReservedByUser() != null) {
                        User user = car.getReservedByUser();
                        car.setReservedByUser(null);
                        userService.save(user);
                    }
                    car.setStartReservationDate(null);
                    car.setEndReservationDate(null);
                    car.setReadyForPickup(false);
                    carService.save(car);
                }
            }
        }

        for (Notification notification : notificationService.findAll()) {
            if (notification.getValidUntilDate() != null) {
                if (notification.getValidUntilDate().compareTo(LocalDate.now()) < 0) {
                    notificationService.deleteById(notification.getNotificationId());
                }
            }
        }
    }
}
