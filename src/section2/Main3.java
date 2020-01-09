package section2;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String holderName;
        String cardNumber;
        String expiryDate;
        System.out.println("Select the Card");
        System.out.println("1.Payback Card \n2.Membership Card ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
        case 1:
            System.out.println("Enter the card Details");
            String[] details = sc.nextLine().split("\\|");
            holderName = details[0];
            cardNumber = details[1];
            expiryDate = details[2];
            System.out.println("Enter points in  card");
            Integer pointsEarned = sc.nextInt();
            System.out.println("Enter amount");
            double totalAmount = sc.nextDouble();
            PaybackCard pay = new PaybackCard(holderName, cardNumber, expiryDate, pointsEarned,
                    totalAmount);
            pay.display();
            break;
        case 2:
            System.out.println("Enter the card Details");
            String[] details2 = sc.nextLine().split("\\|");
            holderName = details2[0];
            cardNumber = details2[1];
            expiryDate = details2[2];
            System.out.println("Enter rating in  card");
            Integer rating = sc.nextInt();
            MembershipCard member = new MembershipCard(holderName, cardNumber, expiryDate, rating);
            member.display();
            break;

        }
        sc.close();
    }
}
