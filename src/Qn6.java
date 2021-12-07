import java.util.Scanner;

public class Qn6 {
    static void inc_dec(double first,double second,double third){
        if(first<second && first<third){
            System.out.println("The numbers are in INCREASING order");
        }else if (first>second && first>third){
            System.out.println("The numbers are in DECREASING order");
        }else{
            System.out.println("Neither INCREASING nor DECREASING");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first no : ");
        double first = sc.nextDouble();
        System.out.print("Enter second no : ");
        double second = sc.nextDouble();
        System.out.print("Enter third no : ");
        double third = sc.nextDouble();

        inc_dec(first,second,third);



    }
}