import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;


public class Programa extends JFrame implements ActionListener, ChangeListener{

  private JLabel txt1;
  private JCheckBox selec1;
  private JButton b1;

  public Programa(){
    setLayout(null);
    txt1= new JLabel ("Aceptar Terminos Y Condiciones");
    txt1.setBounds(10,10,400,30);
    add(txt1);
    
    selec1= new JCheckBox("Aceptar");
    selec1.setBounds(10,50,100,30);
    selec1.addChangeListener(this);
    add(selec1);
  
    b1=new JButton("Continuar");
    b1.setBounds(10,100,100,30);
    add(b1);
    b1.addActionListener(this);
    b1.setEnabled(false);
  }
  public void stateChanged(ChangeEvent e){
    if (selec1.isSelected()==true){
       b1.setEnabled(true);
     }else{
          b1.setEnabled(false);        
          }
  }
 public void actionPerformed(ActionEvent e){
   if(e.getSource()==b1){
     System.exit(0);
   }
 }
 public static void main(String args[]){
   Programa p1= new Programa();
   p1.setBounds(0,0,350,200);
   p1.setVisible(true);
   p1.setResizable(false);
   p1.setLocationRelativeTo(null);
 } 
}