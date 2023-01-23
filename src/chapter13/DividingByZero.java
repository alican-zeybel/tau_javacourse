package chapter13;

/*
Must handle this exception.
c = 30/0
* */
public class DividingByZero {

    public static void main(String args[]) {

        try {
            int c = 30 / 0;
        }catch (ArithmeticException e){
            System.out.println("Division is fun.");
        }
    }
}