package myProject.myClasses;

public class Employee {
    private String name;
    private int age;
    private double[] salarys = new double[3];

    public Employee(String name, int age,double... salarys) {
        this.name = name;
        this.age = age;
        this.salarys = salarys;
    }

    public double computeSalary(){
        double arithmeticMean = 0;

        for (double salary: this.salarys){
            arithmeticMean += salary;
        }

        return  arithmeticMean/3;
    }

    public void myInformation(){
        System.out.println("Olá "+this.name+", você tem "+this.age+", a média do seu salário é: "+computeSalary());
    }
}
