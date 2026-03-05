abstract class Shape {
    double dim1, dim2;
    Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    abstract void area();
}
class Rectangle extends Shape {
    Rectangle(double l, double b) {
        super(l, b);
    }
    void area() {
        System.out.println("Area of Rectangle: " + (dim1 * dim2));
    }
}
class Triangle extends Shape {
    Triangle(double b, double h) {
        super(b, h);
    }
    void area() {
        System.out.println("Area of Triangle: " + (0.5 * dim1 * dim2));
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Shape r = new Rectangle(10, 5);
        Shape t = new Triangle(8, 6);
        r.area();
        t.area();
    }
}