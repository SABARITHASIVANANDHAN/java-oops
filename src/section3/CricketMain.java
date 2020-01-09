
package section3;

import java.util.Scanner;

public class CricketMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Menu\n1.Cricket Player Details \r\n" + "2.Hockey Player Details ");
        System.out.println("Enter choice");
        Integer choice = s.nextInt();
        s.nextLine();

        if (choice == 1) {
            System.out.println("Enter player name");
            String name = s.nextLine();

            System.out.println("Enter team name");
            String teamName = s.nextLine();

            System.out.println("Enter number of matches played");
            Integer noOfMatches = s.nextInt();
            s.nextLine();
            System.out.println("Enter total runs scored");
            Integer totalRunsScored = s.nextInt();
            System.out.println("Enter total number of wickets taken");
            Integer noOfWicketsTaken = s.nextInt();
            CricketPlayer c = new CricketPlayer(name, teamName, noOfMatches, totalRunsScored,
                    noOfWicketsTaken);
            c.displayPlayerStatistics();

        }
        if (choice == 2) {
            System.out.println("Enter player name");
            String name = s.nextLine();

            System.out.println("Enter team name");
            String teamName = s.nextLine();

            System.out.println("Enter number of matches played");
            Integer noOfMatches = s.nextInt();
            s.nextLine();
            System.out.println("Enter the position");
            String position = s.nextLine();
            System.out.println("Enter total number of goals taken");
            Integer noOfGoals = s.nextInt();
            HockeyPlayer h = new HockeyPlayer(name, teamName, noOfMatches, position, noOfGoals);
            h.displayPlayerStatistics();
            s.close();

        }

    }
}
