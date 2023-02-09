package ClassesAndObjects;

public class Rectangle {
   private double length;
    private double width;

    public Rectangle(){
        width=0;
        length=0;
    }
    public Rectangle(double length, double width){
        this.length= length;
        this.width=width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    double calculateArea(){
        double area= length * width;
        return area;
    }
}
