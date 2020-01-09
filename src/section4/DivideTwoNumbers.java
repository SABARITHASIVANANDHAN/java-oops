package section4;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c;
        System.out.println("Enter the two numbers\n");
        int a = s.nextInt();
        int b = s.nextInt();
        try {
            if (b == 0) {
                throw new DivideByZeroException();
            } else {
                c = a / b;
                System.out.println("The quotient of" + a + "/" + b + "=" + c);
            }
        } catch (DivideByZeroException exp) {
            System.out.println(exp);
        } finally {
            System.out.println("Inside finally block");
        }
        s.close();
    }

}