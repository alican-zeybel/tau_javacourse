package chapter11;

public class Pig extends Animal{


    @Override
    public void makeSound() {
        System.out.println("Noik Noik");
    }

    @Override
    public void eat() {
        System.out.println("Pig is eating apple.");
    }
}
