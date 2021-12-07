import java.util.Scanner;

public class Qn8 {
    static void bmi(float a, float b){
        float Bmi = a/(b*b);
        System.out.println("The BMI is " + Bmi);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        float mass = sc.nextFloat();
        System.out.print("Enter height in meter: ");
        float height = sc.nextFloat();

        bmi(mass,height);

    }
}