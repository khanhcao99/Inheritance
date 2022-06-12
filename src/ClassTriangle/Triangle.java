package ClassTriangle;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle() {

    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(String color, Boolean filled, double a, double b, double c) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        return Math.sqrt(getPerimeter()*(getPerimeter()-a)*(getPerimeter()-b)*(getPerimeter()-c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a= " + a +
                ", b= " + b +
                ", c= " + c +
                ", primeter= " + getPerimeter() + "M" +
                ", area= " + getArea() + "M2" +
                super.toString()+
                '}';
    }
}
