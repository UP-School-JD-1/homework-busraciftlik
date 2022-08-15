public class CarTest {

    public static void main(String[] args) {

        Car car1 = new Car();

        System.out.println("When the car stands still.");
        car1.make = "Mercedes";
        car1.model = "C200";
        car1.year = "2019";
        car1.distance = 0;
        car1.speed = 0;
        String info = car1.getInfo();
        System.out.println(info);

        System.out.println("\nWhen the car moves.");
        car1.accelerate(125);
        car1.go(100);
        car1.go(50);
        System.out.println(car1.getInfo());
        car1.stop();
        System.out.println(car1.getInfo());

        System.out.println();

        Car car2 = new Car();
        car2.make = "BMW";
        car2.model = "i8";
        car2.year = "2017";
        car2.distance = 10_000;
        car2.speed = 160;
        System.out.println(car2.getInfo());

        car2.accelerate(220);
        double timeToGo = car2.go(1000);
        System.out.println("Time to go 1000 km " + timeToGo + " hour.");
        System.out.println(car2.getInfo());

        Car car3 = new Car();
        car3.make="Opel";
        car3.model="Astra";
        car3.year="2020";
        car3.distance=60_000;
        car3.speed=120;
        System.out.println(car3.getInfo());

        car3.accelerate(130);
        System.out.println(car3.getInfo());

        Car car4 = new Car();
        car4.make = "Toyota";
        car4.model = "Corolla";
        car4.year = "2019";
        car4.distance = 70_000;
        car4.speed = 150;
        System.out.println(car4.getInfo());

        car4.accelerate(200);
        System.out.println(car4.getInfo());

//        double car3Hour = 1000d / car3.speed;
//        double car4Hour = 1000.0 / car4.speed;
//        double car3FullHour = Math.floor(car3Hour);
//        double car3minute = car3Hour - car3FullHour ;
//        double minute = 60*car3minute;
//        System.out.println(minute);
//        System.out.println(car3FullHour);
//
//        System.out.println("Hour car3  : " + car3Hour +" Hour car4 : " + car4Hour);
//
//        double kmMinute = car3.speed/60d;
//        int totalMinute =(int) Math.round(1000d / kmMinute);
//        System.out.println(totalMinute);
//        int convertToHour = totalMinute/60;
//        int minutes = totalMinute- convertToHour*60;
//        System.out.println(minutes);
//        System.out.println("car3 Hour : "+convertToHour+":"+minutes);


        System.out.println(car3.calculateHour(1000 ));


    }
}
