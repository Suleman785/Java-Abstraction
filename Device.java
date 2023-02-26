abstract class Device {
    protected String name;
    protected String brand;
    protected double price;

    public Device(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }
}


class Television extends Device {
    private int size;

    public Television(String name, String brand, double price, int size) {
        super(name, brand, price);
        this.size = size;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the TV");
    }

    public int getSize() {
        return size;
    }
}


public class Main {
    public static void main(String[] args) {
        Device tv = new Television("Smart TV", "Samsung", 799.99, 55);
        System.out.println("Name: " + tv.getName());
        System.out.println("Brand: " + tv.getBrand()); System.out.println("Price: " + tv.getPrice());
        System.out.println("Size: " + ((Television) tv).getSize() + " inches"); tv.turnOn(); tv.turnOff();
    } }
  