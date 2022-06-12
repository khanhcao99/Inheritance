package ClassTriangle;

public class TestTriangle {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(3.4, 4.5, 6.5);
        shapes[1] = new Triangle(1.4, 3.5, 7.5);
        shapes[2] = new Triangle(2.4, 2.5, 8.5);

        System.out.println("shapes: ");
        for (Shape shape: shapes){
            System.out.println(shape);
        }
    }
}
