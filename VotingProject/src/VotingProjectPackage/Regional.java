package VotingProjectPackage;

import java.util.HashMap;
/* Regional class implements the Implementable interface*/
public class Regional implements Implmentable {

    /*We created a variable name for the region
    * We also created a hash map that creates the regions*/
    private String regionName;
    HashMap<String, District> Dists = new HashMap<>();

    /*Constructor: Assigns region name*/
    Regional(String regionName) {
        this.regionName = regionName;
    }

    /*Setter method: This methods sets the region name */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /*Getter method: This methods returns the region name*/
    public String getRegionName() {
        return regionName;
    }

    /*adddist: This methods add districts to the hass map*/
    public void adddist(District dist) {
        Dists.put(dist.getDistname(), dist);

    }

    /*Partyn(n:1-12): These methods add the number of votes for each candidate in all districts*/
    public int Party1() {
        int count1=0;
        for (District ds : Dists.values()) {
            count1 = count1 + ds.Party1();
        }
        return count1;
    }

    public int Party2() {
        int count2=0;
        for (District ds : Dists.values()) {
            count2 = count2 + ds.Party2();
        }
        return count2;
    }

    public int Party3() {
        int count3=0;
        for (District ds: Dists.values()) {
            count3 = count3 + ds.Party3();
        }
        return count3;
    }

    public int Party4() {
        int count4=0;
        for (District ds : Dists.values()) {
            count4 = count4 + ds.Party4();
        }
        return count4;
    }

    public int Party5() {
        int count5=0;
        for (District ds : Dists.values()) {
            count5 = count5 + ds.Party5();
        }
        return count5;
    }


    public int Party6() {
        int count6=0;
        for (District ds: Dists.values()) {
            count6 = count6 + ds.Party6();
        }
        return count6;
    }

    public int Party7() {
        int count7=0;
        for (District ds: Dists.values()) {
            count7 = count7 + ds.Party7();
        }
        return count7;
    }

    public int Party8() {
        int count8=0;
        for (District ds : Dists.values()) {
            count8 = count8 + ds.Party8();
        }
        return count8;
    }

    public int Party9() {
        int count9=0;
        for (District ds: Dists.values()) {
            count9 = count9 + ds.Party9();
        }
        return count9;
    }

    public int Party10() {
        int count10=0;
        for (District ds : Dists.values()) {
            count10 = count10 + ds.Party10();
        }
        return count10;
    }

    public int Party11() {
        int count11=0;
        for (District ds : Dists.values()) {

            count11 = count11 + ds.Party11();
        }
        return count11;
    }

    public int Party12() {
        int count12=0;
        for (District ds : Dists.values()) {

            count12 = count12 + ds
                    .Party12();
        }
        return count12;
    }
    /*toString: this method returns the sum for each party in all the districts*/
    public String tostring(){
        return " Party1 votes = " +Party1()+" Party2 votes = "+Party2() + " Party3 votes =  "+Party3()+ " Party4 = votes "+Party4()+" Party5 votes = "+Party5()+" Party6 votes = "+Party6()+
                " Party7 votes = "+Party7()+" Party8 votes = "+Party8()+" Party9 votes = "+Party9()+" Party10 votes = "+Party10()+" Party11 votes = "+Party11()+" Party12 votes = "+Party12();
    }

}