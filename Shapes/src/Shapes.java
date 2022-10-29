public class Shapes {
    void shape() {
        System.out.println("This is a shape");
    }
    public static void main(String[] args){
        Square sq = new Square();
        sq.square();
        sq.rectangle();
    }
}

class Rectangle extends Shapes {
    void rectangle(){
        System.out.println("This is a rectangle");
    }
}
class Circle extends Shapes{
    void circle() {
        System.out.println("This is a circle");
    }
}
class Square extends Rectangle{
    void square() {
        System.out.println("Square is a rectangle");
    }
}