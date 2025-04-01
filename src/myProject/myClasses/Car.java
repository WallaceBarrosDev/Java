package myProject.myClasses;

public class Car {
    private String name, model;
    private int age;

    public Car(String name, String model, int age){
        this.name = name;
        this.model = model;
        this.age = age;
    }
    public void info(){
        System.out.println("Hi, the name your car is "+this.name+", the model is "+this.model+", and your age is "+age);
    }
}
