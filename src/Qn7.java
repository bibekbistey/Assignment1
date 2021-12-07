import java.util.Scanner;

public class Qn7 {
    static void floating(double a, double b){
        if (Math.abs(a-b) <= 0.01){
            System.out.println("They are same upto two decimal places");
        }
        else{
            System.out.println("They aren't same");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first floating point number: ");
        double first = sc.nextDouble();
        System.out.print("Enter second floating point number: ");
        double second = sc.nextDouble();

        floating(first,second);


    }
}