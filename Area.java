import java.util.Scanner;


//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
public class Area {
    int length;
    int breadth;

    private void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    private void getArea() {
        System.out.println("Area: "+(length*breadth));
    }
    public static void main(String[] args) {
        Area area = new Area();
        area.setDim(10, 10);
        area.getArea();
    }
}
