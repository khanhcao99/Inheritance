package Point2D_And_Point3D;

public class TestPoint3d {
    public static void main(String[] args) {
        Point2D[] Array = new Point2D[3];
        Array[0] = new Point3D(3.0f, 4.0f,5.0f);
        Array[1] = new Point2D(2.0f, 3.5f);
        Array[2] = new Point3D(1.4f, 2.8f, 6.8f);

        System.out.println("array after tested: ");
        for (Point2D array : Array){
            System.out.println(array);
        }

    }
}
