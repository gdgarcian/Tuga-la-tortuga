/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tortuga;

import ch.aplu.turtle.Turtle;
import com.sun.xml.internal.bind.v2.TODO;

/**
 *
 * @author Equipo
 */
public class Head extends Thread{
    private Turtle turtle;

    Head(Turtle turtle)
    {
      this.turtle = turtle;
    }


   public void run()
   {
    // for (int i = 0; i < 4; i++)
       head(turtle);
       neck(turtle);
       mouth(turtle);
       eye(turtle);
   }
    
   private void head(Turtle t)
   {
     turtle.forward(50);
        turtle.right(90);
        turtle.forward(90);
        turtle.right(90);
        turtle.forward(50);
        turtle.right(90);
        turtle.forward(90);

   }
   private void neck(Turtle t){       
       turtle.right(180);
       turtle.forward(20);
       turtle.right(90);
       turtle.forward(10);
       turtle.left(90);
       turtle.forward(50);
       turtle.left(90);
       turtle.forward(10);
   }
   private void mouth(Turtle t){
       t.penUp();
       turtle.forward(20);
       turtle.left(90);
       turtle.forward(10);
       t.penDown();
       turtle.forward(30);
       turtle.left(90);
       turtle.forward(10);
       turtle.left(90);
       turtle.forward(30);
       turtle.left(90);
       turtle.forward(10);
       //Dientes
       turtle.left(90);
       turtle.forward(10);
       turtle.left(90);
       turtle.forward(10);
       turtle.right(90);
       turtle.forward(10);
       turtle.right(90);
       turtle.forward(10);               
   }
   public void eye(Turtle t){
       t.penUp();
       turtle.forward(10);
       t.left(90);
       t.forward(20);
       t.penDown();
       for(int i = 0; i < 360; i+=5){
              turtle.forward(0.6);
              turtle.right(5);       
       }
       t.penUp();
       t.right(180);
       t.forward(45);
       t.left(90);
       t.forward(7);
       t.penDown();
       for(int i = 0; i < 360; i+=5){
              turtle.forward(0.6);
              turtle.right(5);       
       }
       t.penUp();
       //t.forward(5); 
       t.right(90);
       t.forward(5);
       t.penDown();
       for(int i = 0; i < 180; i+=5){
              turtle.forward(0.3);
              turtle.right(5);       
       }
       t.penUp();
       t.forward(50);
       t.penDown();
       for(int i = 0; i < 180; i+=5){
              turtle.forward(0.3);
              turtle.right(5);       
       }
       t.penUp();
       t.forward(500);
   }
}