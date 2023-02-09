package PhoneBillCalculator;

import java.util.Scanner;
/*
So, a phone bill should have an ID, a base class, a number of allotted minutes and a number of minutes used. And then, it should also be able to calculate the overage,
calculate the tax, and calculate the total.

And then, it should also be able to print an itemized bill.

You should also include three constructors

a default one
one that accepts the ID only
one that accepts all fields

Now no matter which of these constructors you use, all fields should be set eventually.

Then you can also create a different class that instantiates the PhoneBill and prints out an itemized bill.
 */
public class PhoneBill {

    private int id;
    private double baseCost;
    private double NoOfAllottedMinutes;
    private double NoOfMinuteUsed;


    public PhoneBill(){
        id=0;
        baseCost = 79.99;
        NoOfAllottedMinutes = 800;
        NoOfMinuteUsed = 800;
    }
    public PhoneBill(int id){
        setId(id);
        this.id = id;
        baseCost = 79.99;
        NoOfAllottedMinutes = 800;
        NoOfMinuteUsed = 800;
    }
    public PhoneBill(int id, double baseCost, double NoOfAllottedMinutes, double NoOfMinuteUsed ){
    setId(id);
    setBaseClass(baseCost);
    setNoOfAllottedMinutes(NoOfAllottedMinutes);
    setNoOfMinuteUsed(NoOfMinuteUsed);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseClass() {
        return baseCost;
    }

    public void setBaseClass(double baseClass) {
        this.baseCost = baseCost;
    }

    public double getNoOfAllottedMinutes() {
        return NoOfAllottedMinutes;
    }

    public void setNoOfAllottedMinutes(double noOfAllottedMinutes) {
        NoOfAllottedMinutes = noOfAllottedMinutes;
    }

    public double getNoOfMinuteUsed() {
        return NoOfMinuteUsed;
    }

    public void setNoOfMinuteUsed(double noOfMinuteUsed) {
        NoOfMinuteUsed = noOfMinuteUsed;
    }

  public double calculateOverage(){

        if (NoOfMinuteUsed<=NoOfAllottedMinutes)
            return 0;

      double overChargeRate=0.25;
      double extraminute= NoOfMinuteUsed-NoOfAllottedMinutes;
      return extraminute*overChargeRate;
  }
  public double calculateTax(){
        double taxrate= 0.25;
        return baseCost+ calculateOverage();
  }

  public double calculateTotal(){
        return baseCost+ calculateOverage()+ calculateTax();
  }

  public void printItemmizedBill(){
        System.out.println("YOur phone Bill details:"+"\n Id:"+id+"BaseCost:"+baseCost+"\n Tax:"+ calculateTax()+"\n Total:"+calculateTotal());
  }

}
