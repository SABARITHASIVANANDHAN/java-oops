package section4;

import java.util.Scanner;

public class AgeValidator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = s.nextInt();
        try {
            if (age >= 18) {
                System.out.println("welcome to vote");
            } else {
                throw new InvalidAgeException();

            }
        } catch (InvalidAgeException e) {
            System.out.println(e);

        } finally {
            s.close();
        }

    }

}
