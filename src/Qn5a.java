import java.util.Scanner;
public class Qn5a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        System.out.println("Enter the number of col");
        int rows = sc.nextInt();
        int column = sc.nextInt();
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <= column; j++)
                if((i==1 || i==column) || (j==1 || j==column))
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();

        }
    }
}