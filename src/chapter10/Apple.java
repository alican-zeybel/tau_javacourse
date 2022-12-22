package chapter10;

public class Apple extends Fruit{

    public Apple(){
        super(150);
    }

    @Override
    public void makeJuice(){
        Apple appleCalories = new Apple();
        System.out.println("Juice is made by Apple and Have "+ appleCalories.getCalories()+" calories.");
    }
}
