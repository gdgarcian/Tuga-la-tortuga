package tortuga;

//ThreadEx3.java

import ch.aplu.turtle.*;
import java.awt.Color;

public class ThreadEx3 extends TurtleFrame
{
    public void simular(){
        Turtle hilo1 = new Turtle(this);
        Turtle hilo2 = new Turtle(this, Color.red);
        Turtle hilo3 = new Turtle(this, Color.green);
        Turtle hilo4 = new Turtle(this, Color.black);
        Turtle hilo5 = new Turtle(this, Color.cyan);
                
        hilo1.setPos(-8, 150);
        hilo2.setPos(-68, -35);
        hilo3.setPos(-37, -110);
        hilo4.setPos(-50, 100);
        hilo5.setPos(59, 57);
        hilo1.setPenColor(Color.red);
        hilo2.setPenColor(Color.green);
        hilo4.setPenColor(Color.black);
        hilo3.setColor(Color.yellow);
        hilo5.setColor(Color.pink);
        
        new Antena(hilo1).start();
        new Body(hilo2).start();
        new Legs(hilo3).start();
        new Head(hilo4).start(); 
        new Arms(hilo5).start();
    }


public static void main(String[] args)
{
   ThreadEx3 tablero =  new ThreadEx3();
   tablero.simular();
}
}