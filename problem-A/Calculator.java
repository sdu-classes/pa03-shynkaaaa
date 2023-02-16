public class Calculator {
    private int a;
    private int b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void Add() {
        if (a >= 0 && b >= 0) {
            System.out.println(a + b);
        }
        else {
            throw new ArithmeticException("Not all numbers are positive.");
        }
    }

    public void Subtract() {
        if (a >= 0 && b >= 0) {
            System.out.println(a - b);
        }
        else {
            throw new ArithmeticException("Not all numbers are positive.");
        }
    }

    public void Multiplication() {
        if (a != 0 && b != 0) {
            System.out.println(a * b);
        }
        else {
            throw new ArithmeticException("There is one or two zeros in input.");
        }
    }

    public void Division() {
        if (a != 0 && b != 0) {
            System.out.println(a * b);
        }
        else {
            throw new ArithmeticException("There is one or two zeros in input.");
        }
    }
}
