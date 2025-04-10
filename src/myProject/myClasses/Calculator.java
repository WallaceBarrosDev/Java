package myProject.myClasses;

public class Calculator {
    private double result;

    {
        this.result = 0;
    }

    public void plus(int... numbers){
        for(double number : numbers){
            this.result += number;
        }

        this.toWritch();
    }

    public void subtraction(double... numbers){
        for(double number : numbers){
            if(this.result == 0) {
                this.result = number;
                continue;
            }

            this.result -= number;
        }

        this.toWritch();
    }

    public void division(double... numbers){
        for(double number : numbers){
            if (this.result == 0) {
                this.result = number;
                continue;
            }
            if (number == 0) continue;

            this.result /= number;
        }

        this.toWritch();
    }

    public void multiplication(double... numbres){
        for(double number : numbres){
            if (this.result == 0){
                this.result = number;
                continue;
            }

            this.result *= number;
        }

        this.toWritch();
    }

    private void toWritch(){
        System.out.println(this.result);
        this.result = 0;
    }
}
