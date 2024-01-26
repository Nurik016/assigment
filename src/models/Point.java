package models;

public class Point {
    private double x;
    private double y;
    private static int nextId = 1;
    private int id;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        this.id = nextId++;
    }

    public double getDistance(Point dest) {
        return Math.hypot(dest.x - this.x, dest.y - this.y);
    }

    @Override
    public String toString() {
        return String.format("Point(ID: %d, X: %.2f, Y: %.2f)", id, x, y);
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public int getId() { return id; }
}
