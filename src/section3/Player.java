package section3;

public abstract class Player {
    protected String name;
    protected String teamName;
    protected int noOfMatches;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getNoOfMatches() {
        return noOfMatches;
    }

    public void setNoOfMatches(int noOfMatches) {
        this.noOfMatches = noOfMatches;
    }

    public Player(String name, String teamName, int noOfMatches) {
        super();
        this.name = name;
        this.teamName = teamName;
        this.noOfMatches = noOfMatches;
    }

}
