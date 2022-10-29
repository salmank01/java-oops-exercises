public class Triangle {
    int sideOne = 3;
    int sideTwo = 4;
    int sideThree = 5;
    private void perimeter() {
        System.out.println(sideOne+sideTwo+sideThree);
    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.perimeter();
    }
}
