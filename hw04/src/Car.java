public class Car {

    public String make;
    public String model;
    public String year;
    public int speed;
    public int distance;

    public double go(int newDistance) {
        distance += newDistance;
        double period = (double )newDistance / speed;
        return period;
    }

    public void accelerate(int newSpeed) {
        speed = newSpeed;
    }

    public void stop() {
        speed = 0;
    }

    public String getInfo() {
        String info = "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at " + speed + " kmph.";
        return info;

    }
    public String calculateHour(double km){

        double kmMinute = speed/60d;
        int totalMinute = (int)Math.round(km/kmMinute);
        int convertToHour = totalMinute/60;
        int minute = totalMinute-convertToHour*60;
        String  time = "arrival time :" + convertToHour + ":" + minute;
        return time;

    }

    public int getSpeed() {
        return speed;
    }
}

