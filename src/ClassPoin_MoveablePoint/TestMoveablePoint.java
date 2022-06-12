package ClassPoin_MoveablePoint;

public class TestMoveablePoint {
    public static void main(String[] args) {
        Point points = new Point(2.3f,4.5f);
        System.out.println("Array after test: " + points.toString());
        points = new MoveablePoint(points.getX(), points.getY(), 4.0f, 2.4f);
        System.out.println(points);
        ((MoveablePoint) points).move();
        System.out.println(points);
    }
}
