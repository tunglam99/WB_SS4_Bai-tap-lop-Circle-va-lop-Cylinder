public class Circle {
    private double radius;
    private String color;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    public String toString(){
        return " Circle with Radius = " + getRadius()+" Color " + getColor()+ " Area = " +getArea();
    }
}
