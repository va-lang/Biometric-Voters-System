package VotingProjectPackage;

import java.util.HashMap;

public class District implements Implmentable {
    private String distname;
    HashMap<String, Polling> pollings = new HashMap<>();

    District(String distname) {
        this.distname = distname;
    }

    public void setDistname(String distname) {
        this.distname = distname;
    }

    public String getDistname() {
        return distname;
    }

    public void adddist(Polling polls) {
        pollings.put(polls.getPollname(), polls);

    }

    public int Party1() {
        int count1=0;
        for (Polling pol : pollings.values()) {
                count1 = count1 + pol.Party1();
        }

        return count1;
    }
    public String tostring(){
        return " Party1 " +Party1()+" Party2  "+Party2() + " Party3  "+Party3()+ " Party4 "+Party4()+" Party5 "+Party5()+" Party6  "+Party6()+
                " Party7 "+Party7()+" Party8 "+Party8()+" Party9 "+Party9()+" Party10 "+Party10()+" Party11 "+Party11()+" Party12 "+Party12();

    }

    public int Party2() {
        int count2=0;
        for (Polling pol : pollings.values()) {
                count2 = count2 + pol.Party2();
        }

        return count2;
    }

    public int Party3() {
        int count3=0;
        for (Polling pol : pollings.values()) {

                count3 = count3 + pol.Party3();
            }

            return count3;

    }

    public int Party4() {
        int count4=0;
        for (Polling pol : pollings.values()) {

                count4 = count4 + pol.Party4();


        }
        return count4;
    }

    public int Party5() {
        int count5=0;
        for (Polling pol : pollings.values()) {

                count5 = count5 + pol.Party5();
            }


        return count5;
    }


    public int Party6() {
        int count6=0;
        for (Polling pol : pollings.values()) {
                count6 = count6 + pol.Party6();         }


        return count6;
    }

    public int Party7() {
        int count7=0;
        for (Polling pol : pollings.values()) {

                count7 = count7 + pol.Party7();
            }


        return count7;
    }

    public int Party8() {
        int count8=0;
        for (Polling pol : pollings.values()) {
            count8 = count8 + pol.Party8();
        }
        return count8;
    }

    public int Party9() {
        int count9=0;
        for (Polling pol : pollings.values()) {
                count9 = count9 + pol.Party9();
            }
        return count9;
    }

    public int Party10() {
        int count10=0;
        for (Polling pol : pollings.values()) {
                count10 = count10 + pol.Party10();
            }
        return count10;
    }

    public int Party11() {
        int count11=0;
        for (Polling pol : pollings.values()) {

                count11 = count11 + pol.Party11();
            }


        return count11;
    }

    public int Party12() {
        int count12=0;
        for (Polling pol : pollings.values()) {

                count12 = count12 + pol.Party12();
            }


        return count12;
    }

}



