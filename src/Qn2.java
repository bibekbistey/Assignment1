import java.util.Scanner;

public class Qn2
{
    public static void main(String args[])
    {
        String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string:");
        a = s.nextLine();
        int c = a.length();
        for(int i = c - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("Palindrome.");
        }
        else
        {
            System.out.println("Non-Palindrome.");
        }
    }
}
