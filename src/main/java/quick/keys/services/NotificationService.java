package quick.keys.services;

import java.util.List;
import quick.keys.DAO.NotificationRepository;
import quick.keys.entities.Notification;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    // class attributes :
    final NotificationRepository notificationRepo;

    // class constructor :
    public NotificationService(NotificationRepository notificationRepo) {
        this.notificationRepo = notificationRepo;
    }

    // class methods :
    public void save(Notification notification) {
        notificationRepo.save(notification);
    }

    public void saveById(Long id) {
        Notification notification = notificationRepo.findById(id).get();
        notificationRepo.save(notification);
    }

    public List<Notification> findAll() {
        return (List<Notification>) notificationRepo.findAll();
    }

    public void deleteById(Long id) {
        notificationRepo.deleteById(id);
    }
}
