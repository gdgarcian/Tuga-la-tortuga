/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tortuga;


import ch.aplu.turtle.Turtle;

/**
 *
 * @author Equipo
 */
public class Antena extends Thread{
  private Turtle turtle;

  Antena(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run()
 {
   //for (int i = 0; i < 4; i++)
     antena(turtle);
 }

 private void antena(Turtle t)
 {
     t.forward(30);
     t.right(90);
     t.penUp();
     t.forward(8);
     t.penDown();
     t.right(90);
     t.forward(30);
     t.right(90);
     t.forward(8);
     t.right(90);
     t.forward(30);
     t.penUp();
     t.left(90);
     t.forward(3);
     t.right(90);
     t.penDown();
     for(int i = 0; i < 360; i+=5){
              turtle.forward(0.6);
              turtle.right(5);       
       }
     t.penUp();
     t.forward(50);
     
 }
}
