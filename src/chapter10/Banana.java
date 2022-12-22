package chapter10;

public class Banana extends Fruit{

    public Banana(){
        super(200);
    }
    @Override
    public void makeJuice(){
        Banana bananaCalories = new Banana();
        System.out.println("Juice is made by Banana and Have "+ bananaCalories.getCalories()+" calories.");
    }
}
