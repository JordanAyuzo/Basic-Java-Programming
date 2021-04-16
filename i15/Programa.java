import javax.swing.*;
import javax.swing.event.*;


public class Programa extends JFrame implements ChangeListener{

  private JRadioButton r1,r2,r3;
  private ButtonGroup bg;

 public Programa (){
  setLayout(null);
  bg= new ButtonGroup();
  r1=new JRadioButton("640*80");
  r1.setBounds(10,20,100,30);
  r1.addChangeListener(this);
  add(r1);
  bg.add(r1);

  r2=new JRadioButton("800*600"); 
  r2.setBounds(10,70,100,30);
  r2.addChangeListener(this);
  add(r2);
  bg.add(r2);

  r3=new JRadioButton("1024*768");
  r3.setBounds(10,120,100,30);
  r3.addChangeListener(this);
  add(r3);
  bg.add(r3);
 }
 public void stateChanged(ChangeEvent e){
  if(r1.isSelected()){
    setSize(640,80);
  }
  if(r2.isSelected()){
    setSize(800,600);
  }
  if(r3.isSelected()){
    setSize(1024,768);
  }
 }
 public static void main(String args[]){
  Programa p1=new Programa();
  p1.setBounds(0,0,300,230);
  p1.setVisible(true);
  p1.setResizable(false);
 }
}