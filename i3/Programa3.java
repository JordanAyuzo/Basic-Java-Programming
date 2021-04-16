import javax.swing.*;
import java.awt.event.*;
public class Programa3 extends JFrame implements ActionListener {
 
 JButton boton1;
 public Programa3(){
  setLayout(null);
  boton1= new JButton("cerrar");
  boton1.setBounds(300,250,100,30);
  add(boton1);

  boton1.addActionListener(this);
 }
  public void actionPerformed(ActionEvent a){
   if(a.getSource()== boton1){
    System.exit(0);
   }
  }

public static void main(String args[]){
Programa3 Formulario=new Programa3();
  Formulario.setBounds(0,0,500,400);
  Formulario.setVisible(true);
  Formulario.setLocationRelativeTo(null);
  Formulario.setResizable(false);
 
}
}