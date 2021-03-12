package VotingProjectPackage;


import java.util.ArrayList;

public class Admin {
    /* We created a static variable of the voter so it values cannot be changed
    * We also created an array list that would store the id of the voters*/
    static Voter v;
    static ArrayList<Integer> idlist;

    /* This methods retuns the arraylist*/
    public static ArrayList getIdlist(){
        return idlist;
    }
    /* This methods add stores all voters id in an array list*/
    public static ArrayList<Integer> voterList(){
    idlist.add(v.getVoteId());
    return idlist;
    }

}


