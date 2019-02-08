package pl.sda.javastart.Homework.Figure_Ex39;

import java.util.ArrayList;
import java.util.List;

public class Square extends Figure {
    private Point p;
    private Double side;

    public Square(Point p, Double side) {
        this.p = p;
        this.side = side;
    }
    @Override
    public Double getArea() {
        return side * side;
    }
    @Override
    public Double getCircuit() {
        return 4 * side;
    }
    @Override
    public List<Point> getEdges() {
        List<Point> resultList = new ArrayList<>();
        Point p1 = new Point(p.getX(), p.getY() + side);
        Point p2 = new Point(p.getX() + side, p.getY());
        Point p3 = new Point(p.getX() + side, p.getY() + side);
        resultList.add(p);
        resultList.add(p1);
        resultList.add(p2);
        resultList.add(p3);
        return resultList;
    }
    @Override
    public String toString() {
        return "Kwadrat o wymiarach: długość boku = " + side + ", powierzchni = " + getArea()
                + ", obwodzie = " + getCircuit() + " i współrzędnych = " + getEdges();
    }
}
