package hospital;


public class InHousePatient extends Patient{ 
    
    double Discount;
    public InHousePatient(int Id, String Name, int bedType, int noofdays) {

        super(Id, Name, bedType, noofdays);
        this.Discount = 5;
    }
  

    @Override
    public double getBillAmount() {
        double billAmount = super.getBillAmount();
        return billAmount - (billAmount * (Discount / 100));
    }
}
