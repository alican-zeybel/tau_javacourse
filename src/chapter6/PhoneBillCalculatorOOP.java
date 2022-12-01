package chapter6;


public class PhoneBillCalculator {
    private int phoneID;
    private double baseCost;
    private int phoneNumber;
    private int allowedMinutes;
    private int usedMinutes;

    PhoneBillCalculator(){
        phoneID = 0;
        baseCost = 0;
        phoneNumber = 0;
        allowedMinutes = 0;
        usedMinutes = 0;
    }

    public void getPhoneID(){
        
    }

    public double overageCalculator(int usedMinutes, int allowedMinutes){
        int overage;
        if(usedMinutes < allowedMinutes){
            overage = allowedMinutes - usedMinutes;
        }else {
            overage = usedMinutes - allowedMinutes;
            return overage;
        }
    }
    public double TaxCalculator(double baseCost, int overage){
        double tax = (baseCost + (overage * 0.25)) * 0.15;
        return tax;
    }
    public double TotalCalculator(double , double tax){
        double totalFee = subTotal+tax;
        System.out.println("Total: "+String.format("%.2f",totalFee));
        return totalFee;
    }
}
