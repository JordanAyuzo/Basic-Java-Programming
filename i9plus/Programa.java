import javax.swing.*;
import java.awt.event.*;
public class Programa extends JFrame implements ActionListener{
 
 private JTextField tf1,tf2;
 private JLabel tx1,tx2,tx3;
 private JButton b1,b2,b3,b4;
 

 public Programa(){
 setLayout(null);

 tx1=new JLabel("valor 1");
 tx1.setBounds(30,10,100,30);
 add(tx1);

 tx2=new JLabel("valor 2");
 tx2.setBounds(30,40,100,30);
 add(tx2);

 tx3=new JLabel("resultado");
 tx3.setBounds(50,60,200,30);
 add(tx3);


 tf1=new JTextField("");
 tf1.setBounds(100,10,150,20);
 add(tf1);

 tf2=new JTextField("");
 tf2.setBounds(100,40,150,20);
 add(tf2);


 b1=new JButton("sumar");
 b1.setBounds(280,10,100,30);
 add(b1);
 b1.addActionListener(this);
 
 b2=new JButton("restar");
 b2.setBounds(280,50,100,30);
 add(b2);
 b2.addActionListener(this);
  
 b3=new JButton("multiplicar");
 b3.setBounds(20,90,100,30);
 add(b3);
 b3.addActionListener(this);

 b4=new JButton("dividir");
 b4.setBounds(180,90,100,30);
 add(b4);
 b4.addActionListener(this);

 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource()==b1){
   Float var1 ,var2 ,var3 ;
   var1 = Float.parseFloat(tf1.getText());
   var2 = Float.parseFloat(tf2.getText());  

   var3= var1 + var2;
   tx3.setText("resultado: " + var3);
  }

 if(e.getSource()==b2){
   Float var1 ,var2 ,var3 ;
   var1 = Float.parseFloat(tf1.getText());
   var2 = Float.parseFloat(tf2.getText()); 

   var3= var1 - var2;  
   tx3.setText("resultado: " + var3);
  }

 if(e.getSource()==b3){
   Float var1 ,var2 ,var3 ;
   var1 = Float.parseFloat(tf1.getText());
   var2 = Float.parseFloat(tf2.getText()); 
  
   var3= var1 * var2;  
   tx3.setText("resultado: " + var3);

  }
 if(e.getSource()==b4){
   Float var1 ,var2 ,var3 ;
   var1 = Float.parseFloat(tf1.getText());
   var2 = Float.parseFloat(tf2.getText()); 
  
   var3= var1 / var2;
   
   tx3.setText("resultado: " + var3);
  }
 }
 public static void main(String args[]){
 Programa p1=new Programa();
 p1.setBounds(0,0,400,180);
 p1.setVisible(true);
 p1.setResizable(false);
 p1.setLocationRelativeTo(null); 
 }
}
