package hospital;

 import hospital.Patient;

public class Patient{

    private int pId;
    private String pName;
    private int bedType;
    private int noOfDays;

    public Patient(int Id,String Name,int bedtype,int noofdays){
        pId = Id;
        pName =Name;
        bedType = bedtype;
        noOfDays = noofdays;
        
    }

    public int getpId(){
        return pId;
    }
    public void setpId(int Id){
        pId=Id;
    }
    public String getpName(){
    return pName;
    }
    public void setpName(String Name){
        pName=Name;
    }
    public int getBedType(){
        return bedType;
    }
    public void setBedType(int bedtype){
        bedType=bedtype;
    }
    public int getNoOfDays(){
        return noOfDays;
    }
    public void setNoOfDays(int noofdays){
        noOfDays=noofdays;
    }

    public double getBillAmount(){
        double billAmount;
        switch(bedType){
                case 1:
                    billAmount = noOfDays * 200;
                    break;
                case 2:
                    billAmount = noOfDays * 300;
                    break;
                case 3:
                    billAmount = noOfDays * 400;
                    break;
                default:
                    billAmount = 0;
                    break;  
    
        }
        return billAmount;
    }
} 