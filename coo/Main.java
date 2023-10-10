package coo;
class Car {
    public String make;
    public String model;
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    public void start() {
        System.out.println("Starting the car.");
    }
    public void stop() {
        System.out.println("stoping the car");
    }
}
public class Main{
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        car.start();
        car.stop();
        System.out.println(car);
    }
}

