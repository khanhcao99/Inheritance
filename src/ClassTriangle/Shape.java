package ClassTriangle;

public abstract class Shape {
    private String color = "Red";
    private Boolean filled = true;

    public Shape() {

    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public abstract double getPerimeter();
    public abstract double getArea();


    @Override
    public String toString() {
        return ", color= " + color + '\'' +
                ", filled= " + filled ;
    }


}
