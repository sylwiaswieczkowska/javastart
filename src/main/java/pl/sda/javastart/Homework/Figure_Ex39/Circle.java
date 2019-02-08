package pl.sda.javastart.Homework.Figure_Ex39;

import java.util.List;

public class Circle extends Figure{
    private Point p;
    private Double r;

    public Circle(Point p, Double r) {
        this.p = p;
        this.r = r;
    }

    @Override
    public Double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public Double getCircuit() {
        return 2 * Math.PI * r;
    }

    @Override
    public List<Point> getEdges() {
        return null;
    }
    @Override
    public String toString() {
        return "Koło o promieniu = " + r + ", powierzchni = " + getArea().floatValue() + ", obwodzie = " + getCircuit().floatValue();
    }
}
