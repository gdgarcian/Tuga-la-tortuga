
package tortuga;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Germán
 */
public class Legs extends Thread{
  private Turtle turtle;

  Legs(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run()
 {
     legs(turtle);
     foot(turtle);
 }

 private void legs(Turtle t)
 {
        turtle.forward(75);
        turtle.right(90);
        turtle.forward(20);
        turtle.right(90);
        turtle.forward(75);
        turtle.right(90);
        turtle.forward(20);
        t.penUp();
        t.left(180);
        t.forward(45);
        t.penDown();
        t.left(90);
        turtle.forward(75);
        turtle.right(90);
        turtle.forward(20);
        turtle.right(90);
        turtle.forward(75);
        turtle.right(90);
        turtle.forward(20);
     
 }
 
 private void foot(Turtle t){
     t.left(90);
     t.forward(15);
     t.left(130);
     t.forward(27);
     t.right(90);
     t.forward(30);
     t.right(130);
     t.forward(40);
     t.right(90);
     t.forward(15);
     t.right(180);
     t.forward(15);
     t.right(90);
     
     //Pie izq
     t.penUp();
     t.forward(30);
     t.penDown();
     t.forward(37);
     t.right(135);
     t.forward(30);
     t.right(90);
     t.forward(30);
     t.left(135);
     t.forward(30);
     t.right(180);
     t.forward(30);
     t.right(90);
     t.forward(15);
     t.penUp();
     t.forward(500);
             
 }
}
