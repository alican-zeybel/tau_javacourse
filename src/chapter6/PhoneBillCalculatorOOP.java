package chapter6;


public class PhoneBillCalculatorOOP {
    private int phoneID;
    private double baseCost;
    private int phoneNumber;
    private int allowedMinutes;
    private int usedMinutes;

    PhoneBillCalculatorOOP(){
        phoneID = 0;
        baseCost = 0;
        phoneNumber = 0;
        allowedMinutes = 0;
        usedMinutes = 0;
    }
    PhoneBillCalculatorOOP(int phoneID, double baseCost, int phoneNumber, int allowedMinutes, int usedMinutes){
    this.phoneID = phoneID;
    this.baseCost = baseCost;
    this.phoneNumber = phoneNumber;
    this.allowedMinutes = allowedMinutes;
    this.usedMinutes = usedMinutes;
    }


    public int getPhoneID(){
        return phoneID;
    }
    public void setPhoneID(int phoneID){
        this.phoneID = phoneID;
    }
    public double getBaseCost(){
        return baseCost;
    }
    public void setBaseCost(int baseCost){
        this.baseCost = baseCost;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getAllowedMinutes(){
        return allowedMinutes;
    }
    public void setAllowedMinutes(int allowedMinutes){
        this.allowedMinutes = allowedMinutes;
    }
    public int getUsedMinutes(){
        return usedMinutes;
    }
    public void setUsedMinutes(int usedMinutes){
        this.usedMinutes = usedMinutes;
    }


    public int overageCalculator(int usedMinutes, int allowedMinutes){
        int overage;
        if(usedMinutes < allowedMinutes){
            overage = allowedMinutes - usedMinutes;
        }else {
            overage = usedMinutes - allowedMinutes;

        }
        return overage;
    }
    public double TaxCalculator(double baseCost, int overage){
        double tax = (baseCost + (overage * 0.25)) * 0.15;
        return tax;
    }
    public double TotalCalculator(double baseCost , double tax){
        double total = baseCost + tax;
        return total;
    }

}
