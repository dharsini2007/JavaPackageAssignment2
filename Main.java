import mypackage.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.display();

        System.out.println("Addition: " + c.add(10, 5));
        System.out.println("Subtraction: " + c.subtract(10, 5));
    }
}
