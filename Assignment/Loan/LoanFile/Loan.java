package LoanFile;

public abstract class Loan{

    protected double amount;
    protected float timeperiod;

    public Loan(double amount,float timeperiod){
        this.amount = amount;
        this.timeperiod = timeperiod;
    }

    public double getPrincilpe(){
        return amount;
    }
    public void setPrinciple(double amount){
        this.amount = amount;
    }

    public float getTimeperiod(){
        return timeperiod;
    }
    public void setTimeperiod(float timeperiod){
        this.timeperiod = timeperiod;
    }

    public abstract float getRate();    
}