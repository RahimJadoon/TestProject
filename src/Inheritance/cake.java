package Inheritance;
/*
Create a superclass called Cake that has two fields: flavor and price, and a
constructor that accepts the flavor. Getter and setter methods should be created
for the fields.
Create a BirthdayCake class which inherits from Cake and has a field called candles.
Its constructor should set the flavor. Include getter and setter method.
Create a WeddingCake class which inherits from Cake and has a field called tiers. Its
constructor should set the flavor. Include getter and setter method.
Create a TasteTester class to test

 */
public class cake {
    public cake(String flavor){
        this.flavor= flavor;
    }
    private String flavor;
    private int price;
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }




}
