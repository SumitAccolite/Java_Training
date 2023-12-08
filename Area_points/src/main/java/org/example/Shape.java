package org.example;

import java.util.List;

class Shape {
    List<Point> points;

    public Shape(List<Point> points) {
        this.points = points;
    }

    // Calculate the area of the shape (assuming it's a polygon)
    public double calculateArea() {
        double area = 0;
        int n = points.size();


        for (int i = 0; i < n; i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % n);
            area += ((current.x * next.y) - (next.x * current.y));
        }

        area = Math.abs(area) / 2.0;
        return area;
    }

    // Check if a point is inside the shape
    public boolean isPointInside(Point p) {
        int n = points.size();
        int count = 0;

        for (int i = 0; i < n; i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % n);

            if ((current.y <= p.y && p.y < next.y || next.y <= p.y && p.y < current.y) &&
                    p.x < (next.x - current.x) * (p.y - current.y) / (next.y - current.y) + current.x) {
                count++;
            }
        }

        boolean b = count % 2 != 0;
        return b;
    }
}

