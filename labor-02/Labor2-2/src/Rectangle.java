public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double calcArea(){
        return (this.length*this.width);
    }
    public double calcPerimeter(){
        return 2*(this.length+this.width);
    }
}
