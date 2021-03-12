package VotingProjectPackage;

abstract class Result {
    /*This abstract class is used to print the result for the National, Regional and District classes*/
    National newn;
    Regional regn;
    District distn;
    static String Nationalres(National newn){
        return  newn.tostring();
    }
    static String Regionares(Regional regn){
        return regn.tostring();
    }
    static String Districtres(District distn){
        return distn.tostring();
    }
}
