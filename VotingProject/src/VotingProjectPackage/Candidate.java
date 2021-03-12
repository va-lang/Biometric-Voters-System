package VotingProjectPackage;

public class Candidate {
    private String name;
    private String party;
    private int position;

    Candidate(String name, String party, int position) {
        this.name = name;
        this.party = party;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}

