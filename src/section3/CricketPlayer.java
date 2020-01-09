package section3;

public class CricketPlayer extends Player implements IPlayerStatistics {
    private int totalRunsScored;
    private int noOfWicketsTaken;

    public int getTotalRunsScored() {
        return totalRunsScored;
    }

    public void setTotalRunsScored(int totalRunsScored) {
        this.totalRunsScored = totalRunsScored;
    }

    public int getNoOfWicketsTaken() {
        return noOfWicketsTaken;
    }

    public void setNoOfWicketsTaken(int noOfWicketsTaken) {
        this.noOfWicketsTaken = noOfWicketsTaken;
    }

    public CricketPlayer(String name, String teamName, int noOfMatches, int totalRunsScored,
            int noOfWicketsTaken) {
        super(name, teamName, noOfMatches);
        this.totalRunsScored = totalRunsScored;
        this.noOfWicketsTaken = noOfWicketsTaken;
    }

    public CricketPlayer(String name, String teamName, int noOfMatches) {
        super(name, teamName, noOfMatches);

    }

    public void displayPlayerStatistics() {
        System.out.println("Player Details");
        System.out.println("Player name:" + getName());
        System.out.println("Team name:" + getTeamName());
        System.out.println("No.of Matches:" + getNoOfMatches());
        System.out.println("Total runsscored :" + getTotalRunsScored());
        System.out.println("No of wickets taken:" + getNoOfWicketsTaken());

    }

}
