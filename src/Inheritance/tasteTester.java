package Inheritance;

public class tasteTester {
    public static void main(String args[]){
        cake cake = new cake("chocolate");
        cake.setPrice(29);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        cake birthdaycake= new cake("test");
        birthdaycake.setPrice(200);
        System.out.print("Flavor of BirthDayCake is: "+ birthdaycake.getFlavor()+ "and it's price is: "+ birthdaycake.getPrice());

        // Wedding Cake

        cake weddingcake= new cake("Straberry");
        weddingcake.setPrice(200);
        System.out.print("Flavor of WeddingCake is: "+ weddingcake.getFlavor()+ "and it's price is: "+ weddingcake.getPrice());


    }
}
