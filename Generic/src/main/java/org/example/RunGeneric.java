package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunGeneric {
    public static void main(String[] args) {
        Generic.drawShapes(Arrays.asList(
                new Rectangle(),
                new Circle(),
                new Rectangle(),
                new Triangle()
        ));
    }
}