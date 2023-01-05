package chapter11;

public class Duck extends Animal {

    @Override
    public void makeSound(){
        System.out.println("Vak Vak");
    }
    @Override
    public void eat(){
        System.out.println("Duck is eating bread.");
    }
}
