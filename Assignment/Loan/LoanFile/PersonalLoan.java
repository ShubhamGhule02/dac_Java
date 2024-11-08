package LoanFile;
public class PersonalLoan extends Loan implements Taxable{
    
    public PersonalLoan(double amount, float timeperiod){
        
        super(amount, timeperiod);
    }

    @Override
    public float getRate() {
        return amount>500000?0.16f:0.15f;
    }    

    @Override
    public double getTax() {
        return 0.10;
    }
  

}