abstract class Vehicle {
    abstract void start();
}


class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the car");
    }
}


class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the motorcycle");
    }
}


public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.start();
        motorcycle.start();
    }
}
