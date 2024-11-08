package LoanFile;

public class Loaner {

    public static Loan personalLoan(double amt,float tp){
        var ploan = new PersonalLoan(amt, tp);
        ploan.setPrinciple(amt);
        ploan.setTimeperiod(tp);
        return ploan;
    } 

    public static Loan homeLoan(double amt,float tp){
        var hloan = new HomeLoan(amt, tp);
        hloan.setPrinciple(amt);
        hloan.setTimeperiod(tp);
        return hloan;
    } 

    public static double getEmI(Loan l) throws Throwable{
        if(l instanceof HomeLoan){
            return l.getPrincilpe() * (1 + l.getRate() * l.getTimeperiod()/100) / (12 * l.getTimeperiod());
        }else if(l instanceof PersonalLoan){
            return l.getPrincilpe() * (1 + l.getRate() * l.getTimeperiod()/100) / (12 * l.getTimeperiod());
        }else{
            throw new Exception();
        }
}
    
}
