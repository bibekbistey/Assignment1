import java.util.*;

public class Qn4 {
    public static void main(String args[]) {
        int a;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with one space gap:");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            a = Integer.parseInt(temp);
            System.out.println(a);
            sum = sum + a;
        }
        System.out.println("sum of the integers is: " + sum);

    }
}
