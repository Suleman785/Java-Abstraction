abstract class Animal {
    abstract void makeSound();
}


class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Wooue");
    }
}


class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meaaow");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
