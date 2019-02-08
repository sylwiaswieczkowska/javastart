package pl.sda.javastart.Homework.Figure_Ex39;

public class Point {
    private Double x;
    private Double y;

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    public Double getX() {
        return x;
    }
    public Double getY() {
        return y;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("(");
        sb.append("x = ").append(x);
        sb.append(", y = ").append(y);
        sb.append(')');
        return sb.toString();
    }
}
