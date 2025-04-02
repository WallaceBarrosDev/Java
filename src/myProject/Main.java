package myProject;

import myProject.myClasses.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Wallace", 22, 2300.0, 2640.20, 2400.30);
        employee.myInformation();
    }
}