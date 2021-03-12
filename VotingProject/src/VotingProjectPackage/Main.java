package VotingProjectPackage;

public class Main {
    public static void main(String[] args){
        /*Registering the voters and enabling to vote*/

        Voter v1 = new Voter("Bagshaw Kweku", 56, 'M', 212324,"PPP");
        v1.vote(new Candidate("Omieibi Bagshaw", " pdp",4));
        Voter v2 = new Voter(" Kwarase boakye", 66, 'M', 564777,"PPP");
        v2.vote(new Candidate("Omieibi Bagshaw", "pdp", 4));
        System.out.println(v2.votes.toString());
        Voter v3 = new Voter("Kekeli boateng", 66, 'M', 564887,"APC");
        v3.vote(new Candidate("Omieibi Bagshaw", "pdp", 4));
        System.out.println(v3.votes.toString());
        Voter v4 = new Voter("Elijah Boateng", 64, 'M', 564557,"APC");
        v4.vote(new Candidate("Omieibi Bagshaw", "pdp", 4));
        System.out.println(v4.votes.toString());
        Voter v5 = new Voter("Biebele Bagshaw", 66, 'F', 564887,"APC");
        v5.vote(new Candidate("Soso Bagshaw", "npp", 1));
        System.out.println(v5.votes.toString());
        Voter v6 = new Voter("Kelvin Offei", 66, 'M', 564855,"PPP");
        v6.vote(new Candidate("Joseph Mensah", "ppp", 3));
        System.out.println(v6.votes.toString());
        Voter v7 = new Voter("Vanessa Bedzra", 20, 'F', 564455,"PPP");
        v7.vote(new Candidate("Joseph Mensah", "ppp", 3));
        System.out.println(v7.votes.toString());
        Voter v8 = new Voter("Dickson akubie", 69, 'M', 564337,"PCP");
        v8.vote(new Candidate("Emmanuel ainoo", "pcp", 5));
        System.out.println(v8.votes.toString());
        Voter v9 = new Voter("Nana Boakye", 66, 'M', 564667,"PPP");
        v9.vote(new Candidate("Gabriel  owusu", "pdp", 4));
        System.out.println(v9.votes.toString());
        Voter v10 = new Voter("Sylvester kwame", 66, 'M', 564897,"PPP");
        v10.vote(new Candidate("Gabriel  owusu", "ppp", 3));
        System.out.println(v9.votes.toString());


        /*Creating new polling station*/
        Polling p1= new Polling("NPP","Aburi");
        p1.Party1();
        System.out.println( p1.tostring());

        Polling p2= new Polling("APC","Pokuase");
        p2.Party2();
        System.out.println( p2.tostring());

        Polling p3= new Polling("PPP","Abasaman");
        p3.Party3();
        System.out.println( p3.tostring());

        Polling p4= new Polling("PDP","Adenta");
        p4.Party4();
        System.out.println( p4.tostring());

        Polling p5= new Polling("PCP","Adenta");
        System.out.println( p5.tostring());
        p5.Party5();

        Polling p6= new Polling("CPP","Adenta");
        System.out.println( p6.tostring());
        p6.Party6();





        /*Creating districts and adding polling stations to different districts*/
        District d1= new District("Ablokaoma");
        d1.adddist(p1);
        d1.adddist(p2);

        System.out.println( d1.tostring());
        District d2= new District("Ablokaoma");
        d2.adddist(p3);
        d2.adddist(p4);
        d2.adddist(p5);

        System.out.println( d2.tostring());

        District d3= new District("Greater Accra");
        d2.adddist(p6);

        System.out.println( d3.tostring());
        District d4= new District("Tema");

        /*Creating the district and adding the district to regions*/
        Regional r1= new Regional("Eastern Region");
        r1.adddist(d1);
        r1.adddist(d2);

        System.out.println(r1.tostring());
        Regional r2= new Regional("Volta Region");
        r2.adddist(d4);
        r2.adddist(d3);

        System.out.println(r1.tostring());

        /*Creating a nation and adding regions to nations*/
        National n1= new National("Ghana");
        n1.adddist(r1);
        n1.adddist(r2);
        System.out.println(n1.tostring());

        /*Printing the results of the election*/
        Result.Districtres(d2);
        Result.Regionares(r1);
        Result.Nationalres(n1);
}
}

