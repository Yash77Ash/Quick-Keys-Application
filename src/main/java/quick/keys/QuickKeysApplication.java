package quick.keys;

import quick.keys.entities.Car;
import quick.keys.entities.User;
import quick.keys.services.CarService;
import quick.keys.services.NotificationService;
import quick.keys.services.UserService;
import quick.keys.utils.MidnightApplicationRefresh;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class QuickKeysApplication {

    // class attributes :
    final CarService carService;
    final UserService userService;
    final NotificationService notificationService;
    final BCryptPasswordEncoder pwEncoder;
    final MidnightApplicationRefresh midAppRef;

    // class constructor :
    public QuickKeysApplication(CarService carService, UserService userService, NotificationService notificationService, BCryptPasswordEncoder pwEncoder, MidnightApplicationRefresh midAppRef) {
        this.carService = carService;
        this.userService = userService;
        this.notificationService = notificationService;
        this.pwEncoder = pwEncoder;
        this.midAppRef = midAppRef;
    }

    // class methods :
    public static void main(String[] args) {
        SpringApplication.run(QuickKeysApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {

            User user1 = new User("admin", pwEncoder.encode("admin"), "admin@gmail.com", "admin", "admin", "Ukenown address", "07-62436500", "Pune");
            user1.setRole("ROLE_ADMIN");

            User user2 = new User("adeshmukh", pwEncoder.encode("adeshmukh"), "aarti.deshmukh@gmail.com", "Aarti", "Deshmukh", "chichawad chichawad", "07-98765432", "Nagpur");
            user2.setRole("ROLE_EMPLOYEE");

            User user3 = new User("rjadhav", pwEncoder.encode("rjadhav"), "ramesh.jadhav@gmail.com", "Ramesh", "Jadhav", "Nehru nagar", "0682670018", "Nashik");
            user3.setRole("ROLE_USER");

            User user4 = new User("pshinde", pwEncoder.encode("pshinde"), "pratibha.shinde@gmail.com", "Pratibha", "Shinde", "BJP Chowk", "07-123459", "Kolhapur");
            user4.setRole("ROLE_ADMIN");

            User user5 = new User("mkamble", pwEncoder.encode("mkamble"), "mahesh.kamble@gmail.com", "Mahesh", "Kamble", "Netaji Nagar", "06-12347895", "Aurangabad");

            User user6 = new User("jpawar", pwEncoder.encode("jpawar"), "jyoti.pawar@gmail.com", "Jyoti", "Pawar", "Netaji Nagar", "06-45681329", "Solapur");

            User user7 = new User("sgaikwad", pwEncoder.encode("sgaikwad"), "sunil.gaikwad@gmail.com", "Sunil", "Gaikwad", "Netaji Nagar", "06-4568162", "Satara");

            User user8 = new User("mjoshi", pwEncoder.encode("mjoshi"), "meena.joshi@gmail.com", "Meena", "Joshi", "Shivaji Nagar", "06-12365482", "Amravati");

            User user9 = new User("nmore", pwEncoder.encode("nmore"), "nilesh.more@gmail.com", "Nilesh", "More", "Kranti Chowk", "06-14587892", "Jalgaon");

            User user10 = new User("rkamble", pwEncoder.encode("rkamble"), "rekha.kamble@gmail.com", "Rekha", "Kamble", "Maharashtra", "06-12349875", "Beed");

            User user11 = new User("sghorpade", pwEncoder.encode("sghorpade"), "sheetal.ghorpade@gmail.com", "Sheetal", "Ghorpade", "Maharashtra", "06-78945213", "Latur");

            User user12 = new User("ideshmukh", pwEncoder.encode("ideshmukh"), "ishwar.deshmukh@gmail.com", "Ishwar", "Deshmukh", "Maharashtra", "06-12394567", "Parbhani");


            userService.save(user1);
            userService.save(user2);
            userService.save(user3);
            userService.save(user4);
            userService.save(user5);
            userService.save(user6);
            userService.save(user7);
            userService.save(user8);
            userService.save(user9);
            userService.save(user10);
            userService.save(user11);
            userService.save(user12);

            Car car1 = new Car("Corolla : Toyota", "Suresh Pawar", 2001, 1);
            Car car2 = new Car("308 : Peugeot", "Vijay Kale", 2000, 1);
            Car car3 = new Car("Tucson : Hyundai", "Pratik Jagtap", 2012, 3);
            Car car4 = new Car("Focus : Ford", "Rohit Gokhale", 2007, 2);
            Car car5 = new Car("Astra : Opel", "Snehal Patankar", 2013, 3);
            Car car6 = new Car("CLA : Mercedes", "Amol Kulkarni", 1002, 2);
            Car car7 = new Car("Logan : Dacia", "Nitin Rane", 2002, 2);
            Car car8 = new Car("Clio4 : Renault", "Jayesh Bhosale", 2011, 1);
            Car car9 = new Car("308 : Peugeot", "Priya Sathe", 2009, 1);
            Car car10 = new Car("Golf : VolksWagen", "Kiran Salunkhe", 2015, 3);
            Car car11 = new Car("Fabia : SKoda", "Yogesh Patil", 2005, 1);
            Car car12 = new Car("Uno : Fiat", "Anil Kharat", 2008, 1);
            Car car13 = new Car("Punto : Fiat", "Vaishnavi Shinde", 2000, 2);
            Car car14 = new Car("Kuga : Ford", "Swapnil Jadhav", 2001, 3);
            Car car15 = new Car("ClasseE : Mercedes", "Sangram Desai", 2005, 3);
            Car car16 = new Car("Tiguan : VolksWagen", "Tejas Raut", 2016, 2);
            Car car17 = new Car("Evoque : RangeRover", "Ajinkya Thorat", 2014, 1);
            Car car18 = new Car("Fiesta : Ford", "Nilesh Pansare", 2012, 2);
            Car car19 = new Car("Micra : Nissan", "Omkar Waghmare", 2009, 2);
            Car car20 = new Car("Qashqai : Nissan", "Amit Lokhande", 2016, 3);
            Car car21 = new Car("Megane : Renault", "Komal Khatpe", 2006, 3);
            Car car22 = new Car("Leon : Seat", "Tanmay Satpute", 2015, 1);
            Car car23 = new Car("Picanto : Kia", "Ravindra Gaikwad", 2001, 2);
            Car car24 = new Car("Micra : Nissan", "Ashwini Bendre", 2017, 3);
            Car car25 = new Car("500 : Fiat", "Neeraj Gite", 2016, 1);
            Car car26 = new Car("X5 : BMW", "Umesh Dhole", 2009, 1);
            Car car27 = new Car("Q8 : Audi", "Yogita Nikam", 2011, 1);
            Car car28 = new Car("A4 : Audi", "Sharvari Dhumal", 2010, 2);
            Car car29 = new Car("508 : Peugeot", "Manasi More", 2017, 3);
            Car car30 = new Car("Ibiza : Seat", "Rutuja Pawar", 2013, 1);
            Car car31 = new Car("Corsa : Opel", "Harshal Doke", 2014, 1);
            Car car32 = new Car("C3 : Citroen", "Aakash Karale", 2009, 2);
            Car car33 = new Car("C4 : Citroen", "Shruti Bhoyar", 2020, 3);
            Car car34 = new Car("XC60 : VOLVO", "Nikhil Gharat", 2019, 3);
            Car car35 = new Car("Fiesta : Ford", "Rajesh Bhadane", 2016, 3);


            carService.save(car1);
            carService.save(car2);
            carService.save(car3);
            carService.save(car4);
            carService.save(car5);
            carService.save(car6);
            carService.save(car7);
            carService.save(car8);
            carService.save(car9);
            carService.save(car10);
            carService.save(car11);
            carService.save(car12);
            carService.save(car13);
            carService.save(car14);
            carService.save(car15);
            carService.save(car16);
            carService.save(car17);
            carService.save(car18);
            carService.save(car19);
            carService.save(car20);
            carService.save(car21);
            carService.save(car22);
            carService.save(car23);
            carService.save(car24);
            carService.save(car25);
            carService.save(car26);
            carService.save(car27);
            carService.save(car28);
            carService.save(car29);
            carService.save(car30);
            carService.save(car31);
            carService.save(car32);
            carService.save(car33);
            carService.save(car34);
            carService.save(car35);

            car10.setTheUser(user3);
            car10.setReturnDate(LocalDate.of(2021, 5, 23));

            car34.setTheUser(user12);
            car34.setReturnDate(LocalDate.of(2021, 12, 28));

            car1.setTheUser(user3);
            car1.setReturnDate(LocalDate.of(2021, 5, 05));

            user3.setCars(Arrays.asList(car10, car1));

            carService.save(car1);
            carService.save(car10);
            userService.save(user3);

            midAppRef.midnightApplicationRefresher();
        };
    }
}