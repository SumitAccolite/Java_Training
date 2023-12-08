package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Graph {
    Map<Shape, List<Shape>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    // Add a shape to the graph
    public void addShape(Shape shape) {
        adjacencyList.put(shape, new ArrayList<>());
    }

    // Add a non-overlapping relationship between two shapes
    public void addNonOverlappingRelationship(Shape shape1, Shape shape2) {
        // Check if points of shape1 are inside shape2 or vice versa
        for (Point point : shape1.points) {
            if (shape2.isPointInside(point)) {
                throw new IllegalArgumentException("Shapes overlap or points touch.");
            }
        }

        for (Point point : shape2.points) {
            if (shape1.isPointInside(point)) {
                throw new IllegalArgumentException("Shapes overlap or points touch.");
            }
        }

        // If no overlap, add the non-overlapping relationship
        adjacencyList.get(shape1).add(shape2);
        adjacencyList.get(shape2).add(shape1);
    }
}

