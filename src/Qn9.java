import java.util.Scanner;
public class Qn9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  length in meter:");
        float meter=sc.nextInt();
        System.out.println("Enter the time in hour:");
        float hr=sc.nextInt();
        System.out.println("Enter the time in hour:");
        int min=sc.nextInt();
        System.out.println("Enter the time in hour:");
        float sec=sc.nextInt();

        float mps=meter/sec;
        float kph=(meter/1000)/hr;
        float mph=(meter/0.1069f)/hr;
        System.out.println("The speed in meter/second is"+mps);
        System.out.println("The speed in kilometer/hour is"+kph);
        System.out.println("The speed in miles/hour is"+mph);


    }
}

