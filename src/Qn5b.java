import  java.util.Scanner;
public class Qn5b {

    public static void main(String[] args)
    {
        int a;
        int i = 1;
        int j;
        Scanner  sc = new Scanner(System.in);

        System.out.print(" Please Enter any Side of a Square : ");
        a = sc.nextInt();

        while(i <= a)
        {
            j = 1;
            while(j <= a)
            {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.print("\n");
        }
    }
}

