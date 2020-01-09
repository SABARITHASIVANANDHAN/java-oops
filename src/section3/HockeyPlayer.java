package section3;

public class HockeyPlayer extends Player implements IPlayerStatistics {
    private String position;
    private int noOfGoals;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNoOfGoals() {
        return noOfGoals;
    }

    public void setNoOfGoals(int noOfGoals) {
        this.noOfGoals = noOfGoals;
    }

    public HockeyPlayer(String name, String teamName, int noOfMatches, String position,
            int noOfGoals) {
        super(name, teamName, noOfMatches);
        this.position = position;
        this.noOfGoals = noOfGoals;
    }

    public HockeyPlayer(String name, String teamName, int noOfMatches) {
        super(name, teamName, noOfMatches);
        // TODO Auto-generated constructor stub
    }

    public void displayPlayerStatistics() {
        System.out.println("Player Details");
        System.out.println("Player name:" + getName());
        System.out.println("Team name:" + getTeamName());
        System.out.println("No.of Matches:" + getNoOfMatches());
        System.out.println("Total Position : :" + getPosition());
        System.out.println("No of goals taken:" + getNoOfGoals());

    }
}
