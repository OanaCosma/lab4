package com.company.lab2.Calculator;

public class Main {

    public static void main(String[] args) {
        printMyName();
        System.out.println("results is:" + sum(10,6));
        System.out.println("results is:" + reduction(7,2));
        System.out.println("results is:" + multiply(3,5));
        System.out.println("results is:" + division(6,3));


        int mult2 = multiply(4,7);
        int result = sum(-6,mult2);
        System.out.println(result);
        System.out.println(4 * 7 + -6);
        printModel1();

        System.out.println("Media numerelor este:" + avarageNumber(6, 7, 8));
        printModel2();

        System.out.println(remainder(9,5));

        System.out.println(FahrenheitToCelsius(125));

    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int reduction(int a, int b) {
        int result = a - b;
        return result;
    }

    public static int multiply(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public static int division(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }

    public static void printMyName() {
        System.out.println("Hello \nOana");
    }

    public static void printModel1() {
        System.out.println("    J   a    v     v  a");
        System.out.println("    J  a a    v   v  a a");
        System.out.println(" J  J aaaaa    V V  aaaaa");
        System.out.println("  JJ a     a    V  a     a");
    }



    public static int avarageNumber (int firstNumber, int secondNumber, int thirdNumber) {
        int result = (firstNumber + secondNumber + thirdNumber) / 3;
        return result;
    }

    public static void printModel2() {
        System.out.println("  +\"\"\"\" +");
        System.out.println(" [|  o   o  |]");
        System.out.println("  |    ^    | ");
        System.out.println("  |  ' _ '  | ");
        System.out.println("  +---------+ ");
    }

    public static double remainder(double a, double b) {
        double result = (a % b);
        return result;
    }

    public static int FahrenheitToCelsius(int Fahrenheit) {
        int celsius = ((Fahrenheit - 32) * 5 / 9);
        return celsius;
    }

    public static double inchToMeters(double inch) {
        double meters = (inch * 0.0254);
        return meters;
    }
}
