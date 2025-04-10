package myProject;

import myProject.myClasses.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.plus(10, 20, 20);
        calculator.subtraction(20, 10, 5);
        calculator.division(20, 5);
        calculator.multiplication(10,2);
    }
}