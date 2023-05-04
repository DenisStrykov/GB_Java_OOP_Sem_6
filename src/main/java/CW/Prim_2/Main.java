package CW.Prim_2;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Addition addition = new Addition(1.0, 0.0);
        Subtraction subtraction = new Subtraction(0.0, 1.0);

        calculator.calculateCorrect2(addition);
        calculator.calculateCorrect2(subtraction);
        System.out.println(addition.getResult());
        System.out.println(subtraction.getResult());

    }

}
