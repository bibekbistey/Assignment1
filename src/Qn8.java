import java.util.Scanner;
public class Qn8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  weight in kg:");
        int kg=sc.nextInt();
        System.out.println("Enter the height in meter:");
        int m=sc.nextInt();

        int BMI=kg/(m*m);
        System.out.println("The body mass index is  "+BMI);


    }
}
