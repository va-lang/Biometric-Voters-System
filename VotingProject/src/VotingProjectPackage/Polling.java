package VotingProjectPackage;

/*We implemented the polling interface in the polling class*/
class Polling implements Implmentable {
    /*We instantiated the party and the pollname */
    private String party;
    private String pollname;

    /* Polling Constructor: We instantiate the pollname and party*/
    Polling(String party,String pollname){
        this.pollname= pollname;
        this.party=party;


    }

    /*Getter: This methods returns the pollname*/
    public String getPollname() {
        return pollname;
    }
    public String getParty() {
        return party;
    }

    /*Setter: This method sets the pollname and polling name*/
    public void setPollname(String pollname) {
        this.pollname = pollname;
    }

    public void setParty(String party) {
        this.party = party;
    }


    /* Partyn(n:1-10)These methods add the number of votes for each candidate in all polling station */
    public int Party1(){
        System.out.println(Voter.votes);
        return ( Voter.votes.get(0));
    }
    public int Party2(){
        return (Voter.votes.get(1));
    }

    public int Party3(){
        return (Voter.votes.get(2));
    }

    public int Party4(){
        return (Voter.votes.get(3));
    }
    public int Party5(){
        return (Voter.votes.get(4));
    }
    public int Party6(){
        return (Voter.votes.get(5));
    }
    public int Party7(){
        return (Voter.votes.get(6));
    }
    public int Party8(){
        return (Voter.votes.get(7));
    }
    public int Party9(){
        return (Voter.votes.get(8));
    }
    public int Party10(){
        return (Voter.votes.get(9));
    }
    public int Party11(){
        return (Voter.votes.get(10));
    }
    public int Party12(){
        return (Voter.votes.get(11));
    }
    /* tostring: Returns the name of the party*/
    public String tostring(){
        return "The party name "+party;
    }


    }

