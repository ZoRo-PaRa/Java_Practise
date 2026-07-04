class Rectangle {

    private double length;
    private double breadth;

    public void setData(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        double a = length * breadth;
        System.out.println("Area of rectangle: " + String.format("%.2f", a));
    }

    public void per() {
        double p = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle: " + String.format("%.2f", p));
    }
}

class J3 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.setData(12.4, 14.3);
        r1.area();
        r1.per();
        
    }
}