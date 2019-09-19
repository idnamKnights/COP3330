package dimassino_p2;

import java.util.Scanner;

public class Asgn2Prob2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double bmi1 = person(console);
        report(bmi1);
    }

    public static double person(Scanner console) {
        System.out.print("What is your weight (in pounds)? ");
        double weight = console.nextDouble();
        System.out.print("what is your height (in inches)? ");
        double height = console.nextDouble();

        return bmi(height, weight);
    }

    public static double bmi(double height, double weight) {
        return (weight * 703 / height / height);
    }

    public static void report(double bmi) {
        System.out.printf("BMI = %f\n",bmi);
        if (bmi < 18.5) {
            System.out.println("According to your BMI, you're underweight.");
        } else if (bmi < 25) {
            System.out.println("According to your BMI, you're normal.");
        } else if (bmi < 30) {
            System.out.println("According to your BMI, you're overweight.");
        } else {
            System.out.println("According to your BMI, you're obese.");
        }
    }
}