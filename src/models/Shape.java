package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> pointsList = new ArrayList<>();

    public double calculatePerimeter() {
        double perimeter = 0;
        if (pointsList.size() < 2) return 0;
        for (int i = 0; i < pointsList.size(); i++) {
            Point current = pointsList.get(i);
            Point next = pointsList.get((i + 1) % pointsList.size());
            perimeter += current.getDistance(next);
        }
        return perimeter;
    }

    public double getLongest() {
        double maxDistance = 0;
        for (int i = 0; i < pointsList.size(); i++) {
            for (int j = i + 1; j < pointsList.size(); j++) {
                double currentDistance = pointsList.get(i).getDistance(pointsList.get(j));
                if (currentDistance > maxDistance) {
                    maxDistance = currentDistance;
                }
            }
        }
        return maxDistance;
    }

    public void addPoint(Point point) { pointsList.add(point); }
}
