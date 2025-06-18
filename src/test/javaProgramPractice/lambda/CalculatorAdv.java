package lambda;

import java.util.Scanner;

public class CalculatorAdv {
    public static void main(String[] args) {
        MathOperation addition = Integer::sum;
        MathOperation substraction = (a,b) -> a-b;
        MathOperation multiplication = (a,b) -> a*b;
        MathOperation divison = (a,b) -> a/b;

        System.out.println("Addition :: "+calculate(addition));
        System.out.println("Substract :: "+calculate(substraction));
        System.out.println("Division :: "+calculate(divison));
        System.out.println("Multiplication :: "+calculate(multiplication));
    }
    public static int calculate(MathOperation mo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer :: ");
        int firstInt = Integer.parseInt(sc.next());
        System.out.println("Enter the second integer :: ");
        int secondInt = Integer.parseInt(sc.next());
        return mo.operate(firstInt, secondInt);
    }
}
