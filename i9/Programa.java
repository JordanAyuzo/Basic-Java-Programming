import javax.swing.*;
import java.awt.event.*;
public class Programa extends JFrame implements ActionListener{
 
 private JTextField tf1,tf2;
 private JLabel tx1,tx2,tx3;
 private JButton boton1;
 

 public Programa(){
 setLayout(null);

 tx1=new JLabel("valor 1");
 tx1.setBounds(50,5,100,30);
 add(tx1);

 tx2=new JLabel("valor 2");
 tx2.setBounds(50,35,100,30);
 add(tx2);

 tx3=new JLabel("resultado");
 tx3.setBounds(120,80,100,30);
 add(tx3);


 tf1=new JTextField("");
 tf1.setBounds(120,10,150,20);
 add(tf1);

 tf2=new JTextField("");
 tf2.setBounds(120,40,150,20);
 add(tf2);


 boton1=new JButton("sumar");
 boton1.setBounds(10,80,100,30);
 add(boton1);
 boton1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource()==boton1){
   int var1 = 0,var2 = 0,var3 = 0;
  
   var1 = Integer.parseInt(tf1.getText());
   var2 = Integer.parseInt(tf2.getText());  
   var3= var1 + var2;
   
   tx3.setText("resultado: " + var3);
  }
 }
 public static void main(String args[]){
 Programa p1=new Programa();
 p1.setBounds(0,0,300,150);
 p1.setVisible(true);
 p1.setResizable(false);
 p1.setLocationRelativeTo(null); 
 }
}