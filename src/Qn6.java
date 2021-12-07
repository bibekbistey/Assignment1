import java.util.Scanner;
public class Qn6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Enter the third number:");
        int c=sc.nextInt();

        if (b>a & c>b)
            System.out.println("It is increasing");
        else if (a>b & b>c)
            System.out.println("It is decreasing");
        else if (a==b || b==c||a==c )
            System.out.println("Two numbers are equal");
        else
            System.out.println("It is neither increasing nor decreasing");
    }
}
