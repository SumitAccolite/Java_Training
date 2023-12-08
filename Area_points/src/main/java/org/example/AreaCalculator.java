package org.example;

import java.util.*;

public class AreaCalculator {
    public static void main(String[] args) {
        // Create points for shapes
        List<Point> points1 = Arrays.asList(new Point(0, 0), new Point(0, 4), new Point(4, 4), new Point(4, 0), new Point(5 , 3));
        List<Point> points2 = Arrays.asList(new Point(5, 0), new Point(5, 4), new Point(9, 4));

        // Create shapes
        Shape shape1 = new Shape(points1);
        Shape shape2 = new Shape(points2);

        // Create a graph
        Graph graph = new Graph();

        // Add shapes to the graph
        graph.addShape(shape1);
        graph.addShape(shape2);

        try {
            // Add non-overlapping relationships
            graph.addNonOverlappingRelationship(shape1, shape2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        // Calculate areas
        double area1 = shape1.calculateArea();
        double area2 = shape2.calculateArea();

        System.out.println("Area of Shape 1: " + area1);
        System.out.println("Area of Shape 2: " + area2);
    }
}
