package pl.sda.javastart.Homework.Figure_Ex39;

public class OOP_4 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(new Point(3.0, 5.0), 8.0, 4.0);
        Square square = new Square(new Point(4.0, 5.0), 4.0);
        Circle circle = new Circle(new Point(4.0, 2.0), 7.0);

        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        System.out.println(circle.toString());
    }
}

