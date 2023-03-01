import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rectangles[i] = new Rectangle(length, width);

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(rectangles[i].getLength()+" es "+rectangles[i].getWidth()+" terulet "+rectangles[i].calcArea()+" kerulet "+rectangles[i].calcPerimeter()+"\n");
        }
    }
}