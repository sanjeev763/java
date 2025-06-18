package lambda;

import java.util.Scanner;

public class CalculatorAdv2 {
    public static void main(String[] args) {
        MathOpCalcAdv calculation = CalculatorAdv2::selectOperator;
        System.out.println("Calculation is :: "+getInfo(calculation));
    }
    public static int getInfo(MathOpCalcAdv mo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer :: ");
        int firstInt = Integer.parseInt(sc.next());
        System.out.println("Enter the operator(+,-,*,/) :: ");
        String op = String.valueOf(sc.next());
        System.out.println("Enter the second integer :: ");
        int secondInt = Integer.parseInt(sc.next());
        return mo.operate(firstInt, secondInt, op);
    }
    public static int selectOperator(int a, int b, String op){
        switch (op) {
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;
            }
            case "*" -> {
                return a * b;
            }
            case "/" -> {
                return a / b;
            }
        }
        return Integer.MIN_VALUE;
    }
}
