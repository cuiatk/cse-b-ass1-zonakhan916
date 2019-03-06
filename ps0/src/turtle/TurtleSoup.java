/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package turtle;

import java.util.List;
import java.util.ArrayList;

public class TurtleSoup {

    /**
     * Draw a square.
     * 
     * @param turtle the turtle context
     * @param sideLength length of each side
     */
    public static void drawSquare(Turtle turtle, int sideLength) {
    	 for(int x = 0; x < 4; x++)
    	 {
             turtle.forward(sideLength);
             turtle.turn(90.0);
         }
    	 
    }

    public static void main(String args[]) {
        DrawableTurtle turtle = new DrawableTurtle();

        drawSquare(turtle, 40);

        // draw the window
        
       
        turtle.draw();
        
        
    }

}
