import java.util.Scanner;
public class Qn7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first floating point number: ");
        float first = input.nextFloat();
        System.out.print("Input second floating point number: ");
        float second = input.nextFloat();
        input.close();

        if (Math.abs(first - second) <= 0.01) {
            System.out.println("They are same same");
        }
        else {
            System.out.println("They are not same");
        }
    }
}