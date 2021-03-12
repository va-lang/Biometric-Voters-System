package VotingProjectPackage;

import java.util.HashMap;

public class National {
    /*We created a nation name
    * We also created a hash map that would add all the regions to nation entity*/
    private String nationalname;
    HashMap<String, Regional> rg= new HashMap<>();

    /*Constructor: this instantiates the nation name */
    National(String regionName) {
        this.nationalname=nationalname;
    }
    /*adddist: This methods add region names to the array list*/
    public void adddist(Regional region) {
        rg.put(region.getRegionName(), region);

    }
    /* Party(n:1-12): this methods adds the number of votess for each party in the regions
    * also returns the number of votes for each party*/
    public int Party1() {
        int count1=0;
        for (Regional reg : rg.values()) {
            count1 = count1 + reg.Party1();
        }
        return count1;
    }

    public int Party2() {
        int count2=0;
        for (Regional reg : rg.values()) {
            count2 = count2 + reg.Party2();
        }
        return count2;
    }

    public int Party3() {
        int count3=0;
        for (Regional reg: rg.values()) {
            count3 = count3 + reg.Party3();
        }
        return count3;
    }

    public int Party4() {
        int count4=0;
        for (Regional reg : rg.values()) {
            count4 = count4 + reg.Party4();
        }
        return count4;
    }

    public int Party5() {
        int count5=0;
        for (Regional reg : rg.values()) {

            count5 = count5 + reg.Party5();
        }
        return count5;
    }

    public int Party6() {
        int count6=0;
        for (Regional reg: rg.values()) {
            count6 = count6 + reg.Party6();         }
        return count6;
    }

    public int Party7() {
        int count7=0;
        for (Regional reg: rg.values()) {

            count7 = count7 + reg.Party7();
        }


        return count7;
    }

    public int Party8() {
        int count8=0;
        for (Regional reg : rg.values()) {
            count8 = count8 + reg.Party8();
        }
        return count8;
    }

    public int Party9() {
        int count9=0;
        for (Regional reg: rg.values()) {
            count9 = count9 + reg.Party9();
        }
        return count9;
    }

    public int Party10() {
        int count10=0;
        for (Regional reg : rg.values()) {
            count10 = count10 + reg.Party10();
        }
        return count10;
    }
    public int Party11() {
        int count11=0;
        for (Regional reg : rg.values()) {

            count11 = count11 + reg.Party11();
        }
        return count11;
    }

    public int Party12() {
        int count12=0;
        for (Regional reg : rg.values()) {

            count12 = count12 + reg.Party12();
        }
        return count12;
    }

    /*tostring: this methods prints the total party result for all regoins*/
    public String tostring(){
        return " Party1 " +Party1()+" Party2  "+Party2() + " Party3  "+Party3()+ " Party4 "+Party4()+" Party5 "+Party5()+" Party6  "+Party6()+
                " Party7 "+Party7()+" Party8 "+Party8()+" Party9 "+Party9()+" Party10 "+Party10()+" Party11 "+Party11()+" Party12 "+Party12();

    }

}

