class Circle {

    
    private double radius;
    private static final double PI = 3.14;
    public Circle(double radius)  {
        this.radius = radius;
    }

    public void getData() {
        System.out.println("Radius: " + radius);
    }

    public void area() {
        double a = PI * radius * radius;
        System.out.println("Area of Circle: " + String.format("%.2f", a));
    }

    public void cir() {
        double c = 2 * PI * radius;
        System.out.println("Circumference of Circle: " + String.format("%.2f", c));
    }

}


public class J4 {

    public static void main(String[] args) {

        Circle c = new Circle(12.5);
        c.area();
        c.cir();
         
    }
}
