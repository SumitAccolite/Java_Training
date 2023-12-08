package org.example;

import java.util.List;

public class Generic{
   public static void drawShapes(List<? extends Shape> lists){
       for(Shape l:lists){
           l.draw();
       }

   }
}
