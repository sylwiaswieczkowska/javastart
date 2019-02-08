package pl.sda.javastart.Homework.Figure_Ex39;

import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Figure {
    private Point p;
    private Double width;
    private Double height;

    public Rectangle(Point p, Double width, Double height) {
        this.p = p;
        this.width = width;
        this.height = height;
    }
    @Override
    public Double getArea() {
        return width * height;
    }
    @Override
    public Double getCircuit() {
        return (2 * width) + (2 * height);
    }
    @Override
    public List<Point> getEdges() {
        List<Point> resultList = new ArrayList<>();
        Point p1 = new Point(p.getX(), p.getY() + width);
        Point p2 = new Point(p.getX() + height, p.getY());
        Point p3 = new Point(p.getX() + width, p.getY() + height);
        resultList.add(p);
        resultList.add(p1);
        resultList.add(p2);
        resultList.add(p3);
        return resultList;
    }
    @Override
    public String toString() {
        return "Prostokąt o wymiarach: długość = " + height + ", szerokość = " + width +
                ", powierzchni = " + getArea() + ", obwodzie = " + getCircuit() + " i współrzędnych = " + getEdges().toString();
    }
}
