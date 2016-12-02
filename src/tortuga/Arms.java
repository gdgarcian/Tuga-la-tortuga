
package tortuga;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Equipo
 */
public class Arms extends Thread{
  private Turtle turtle;

  Arms(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run()
 {   
     hombro(turtle);
 }

 private void hombro(Turtle t)
 {  
     t.right(90);
     t.forward(20);
     t.right(90);
     t.forward(10);
     t.right(90);
     t.forward(20);
     t.right(180);
     t.forward(20);
     
     for(int i = 0; i < 540; i+=5){
              turtle.forward(0.6);
              turtle.right(5);       
       }
     
     t.left(90);
     t.forward(50);
     t.left(90);
     t.forward(15);
     t.left(90);
     t.forward(50);
     t.left(90);
     t.forward(15);
     t.left(90);
     t.forward(50);
     t.left(90);
     t.forward(15);
     t.penUp();
     t.right(90);
     t.forward(10);
     t.penDown();     
     
     for(int i = 0; i < 540; i+=5){
              turtle.forward(0.6);
              turtle.right(5);       
       }
     
     //Brazo izq.
     
     t.penUp();
     t.forward(85);
     t.left(90);
     t.forward(150);
     
     t.penDown();     
     t.forward(20);
     t.right(90);
     t.forward(10);
     t.right(90);
     t.forward(20);
     t.right(90);
     t.forward(20);
     t.right(90);
     t.forward(20);
     t.penUp();
     t.forward(10);
     t.penDown();
     
     for(int i = 0; i < 180; i+=5){
              turtle.forward(0.6);
              turtle.right(5);       
       }
     
     t.left(90);
     t.forward(50);
     t.left(90);
     t.forward(15);
     t.left(90);
     t.forward(50);
     t.left(90);
     t.forward(15);
     t.left(90);
     t.forward(50);
     t.left(90);
     t.forward(15);
     t.penUp();
     t.right(90);
     t.forward(10);
     t.penDown();     
     
     for(int i = 0; i < 540; i+=5){
              turtle.forward(0.6);
              turtle.right(5);       
       }
     
     t.penDown();
     t.forward(500);
     
     
 }
}
