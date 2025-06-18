package lambda;

public class Calculator {
    public static void main(String[] args) {
        MathOperation addition = Integer::sum;
        System.out.println(addition.operate(5,6));

        MathOperation substraction = (a,b) -> a-b;
        System.out.println(substraction.operate(6,5));

        MathOperation multiplication = (a,b) -> a*b;
        System.out.println(multiplication.operate(5,6));

        MathOperation divison = (a,b) ->b/a;
        System.out.println(divison.operate(2,6));
    }
}
