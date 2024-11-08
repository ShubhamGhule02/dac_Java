package LoanFile;
public class HomeLoan extends Loan implements Discountable{

    public HomeLoan(double amount, float timeperiod){
        
        super(amount, timeperiod);
    }

    @Override
    public float getRate() {
        return amount >2000000?0.11f:0.10f;
    }

    @Override
    public double getDiscount() {
        return 0.05;
    }
} 

