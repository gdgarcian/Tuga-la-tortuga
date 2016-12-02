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
public class Body extends Thread{
  private Turtle turtle;

  Body(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run()
 {
     cuerpo(turtle);
     boton(turtle);
     mancuernas(turtle);
 }

 private void cuerpo(Turtle t)
 {
     for (int i = 0; i < 4; i++){
     t.forward(125);
     t.right(90);
     }
 }
 
 private void boton(Turtle t){
     t.forward(40);
     t.penUp();
     t.right(90);
     t.forward(22);
     t.penDown();
     for(int i = 0; i < 360; i+=5){
              turtle.forward(0.6);
              turtle.right(5);       
     }
     for(int i = 0; i<4 ; i++){
         t.penUp();
     t.forward(20);
     t.penDown();
     for(int j = 0; j < 360; j+=5){
              turtle.forward(0.6);
              turtle.right(5);       
     }
     }
     
     
 }
 
 private void mancuernas(Turtle t){
     t.penUp();
     t.left(90);
     t.forward(40);
     t.penDown();
       turtle.right(30);
       turtle.forward(15);
       turtle.right(120);
       turtle.forward(15);
       turtle.right(120);
       turtle.forward(15);
       t.penUp();
       t.forward(20);
       t.penDown();
       turtle.right(30);
       turtle.forward(15);
       turtle.right(120);
       turtle.forward(15);
       turtle.right(120);
       turtle.forward(15);
       t.penUp();
       t.right(90);
       t.forward(30);
       t.penDown();
       turtle.right(30);
       turtle.forward(15);
       turtle.right(120);
       turtle.forward(15);
       turtle.right(120);
       turtle.forward(15);
       t.penUp();
       t.right(90);
       t.forward(30);
       t.penDown();
       turtle.right(30);
       turtle.forward(15);
       turtle.right(120);
       turtle.forward(15);
       turtle.right(120);
       turtle.forward(15);
       t.penUp();
       t.forward(500);
     
      
     
 }
 
}
