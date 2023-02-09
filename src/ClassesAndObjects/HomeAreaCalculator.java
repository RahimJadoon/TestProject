package ClassesAndObjects;

public class HomeAreaCalculator {
    public static void main(String args[]){
        Rectangle room1 = new Rectangle();
        room1.setLength(20);
        room1.setWidth(10);
        Double Room1Area= room1.calculateArea();
        System.out.println("Area of room1 is: "+ Room1Area);


        Rectangle room2= new Rectangle(20,10);
        double Room2Area=room2.calculateArea();
        System.out.println("Area of room2 is: "+ Room2Area);


    }
}
