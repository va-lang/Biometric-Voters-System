package VotingProjectPackage;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Voter extends Person{
    /*We created an instance variable of the admin class we also instantiated the pollstat
    * We created an arraylist that stores each candidate according to their index in the array list since wew have 12 political parties
    * We created an arraylist that also take the id of the voters that have voted
    * We created 2 txt file candvote stores the vote for each candidate while voteList stores the id of the voters */

    Admin ad;
    private int voteId;
    private String pollstat;
    static ArrayList<Integer>  votes = new ArrayList<>(Collections.nCopies(12, 0));
    public static ArrayList<Integer> voter= new ArrayList<>();
    static File candVote = new File("Candvote.txt");
    File voterList = new File("votedList.txt");


    /* Constructor for the voter class that extends Person class that adds the voter id*/
    Voter(String name, int age, char gender, int voteId, String pollstat){
        super(name, age,gender);
        this.voteId = voteId;
        this.pollstat= pollstat;

    }
    /* Getter methods: This allows us get the polling station of voter*/
    public String getPollstat() {
        return pollstat;
    }
    /*Setter methods : This allows us set the polling station of the current voter*/

    public void setPollstat(String pollstat) {
        this.pollstat = pollstat;
    }
    /*confirmRegis: this  checks if a voter is regsitered by looping through the arraylist(By finding their id is stored) and returns true if registered */
    public boolean confirmRegis() {
        for (Object i : ad.voterList()){
            if(voteId == (int) i){
                System.out.println("You are registered");
            }
        }
        return true;
    }
    /*retry: This display if you are not registered*/
    public void retry(){
        if(confirmRegis()!= true){
            System.out.println(" You are not registered");
        }
    }
    /*Loginsuc: This methods  prints if your are succesful registered*/
    public void Loginsuc(){
        if(confirmRegis()== true){
           // vote();
        }

    }
    /*Getter method: get the voters id*/
    public int getVoteId() {
        return voteId;
    }
    /*vote: this method check if they current voter has voted before it wont allow the voter to vote again
    * It accepts the Candidate object as a parameter
    * Also when the voter has voted it increases the candidate value by 1
    * It update the current votes with the addvote() method
    * It then write the votes to candvote text file before closing the file then returns the current vote count*/
    public ArrayList vote(Candidate candidate){
        if(this.hasVoted()){
            System.out.println("Cannot Vote Twice!!!");
        }else{
            int candidateIndex = candidate.getPosition()-1;
            votes.set(candidateIndex, votes.get(candidateIndex)+1);
            addVoter(this);
            addvote();

            try {
               FileWriter wr = new FileWriter(candVote);


                    wr.write(String.valueOf(votes) );



                wr.close();



            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return votes;
    }
    /*hasVoted: this method check if the current voter has voted already by checking if their id is in the voter arraylist*/
    private boolean hasVoted(){
       if (voter.contains(this)){
           return true;

       }
        return false;
    }
    /*toString: This methods overrides the tostring of the person class and return the voters id*/
    @Override
    public String toString() {
        return super.toString()+"\nVoterId:"+getVoteId();
    }

    /*addVoter: This methods add the voters id to an arraylist*/
    private ArrayList addVoter(Voter v){

        voter.add(v.getVoteId());
        return voter;
    }

    /*addvote: this methods update the id in the text file */
    private void addvote(){
        try {
            FileWriter vr=new FileWriter(voterList,true);
            if(hasVoted()){
                System.out.println("Already exist");
            }
            else{
                vr.write(String.valueOf(this.voteId)+"\n");
                vr.close();
            }
        }
        catch(IOException e){
            System.out.println("wrong input");

        }
    }





}

