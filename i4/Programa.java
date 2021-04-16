import javax.swing.*;
import java.awt.event.*;


public class Programa extends JFrame implements ActionListener{
 private JButton b1, b2, b3;
 private JLabel tx1;

public Programa(){

 setLayout(null);
 b1 = new JButton ("1");
 b1.setBounds(10,100,90,30);
 add(b1);
 b1.addActionListener(this);

 b2 = new JButton("2");
 b2.setBounds(110,100,90,30);
 add(b2);
 b2.addActionListener(this);

 b3 =new JButton("3");
 b3.setBounds(210,100,90,30);
 add(b3);
 b3.addActionListener(this);

 tx1 = new JLabel("presiona all\u00ed");
 tx1.setBounds(10,10,300,30);
 add(tx1);
}
public void actionPerformed(ActionEvent e){
   if(e.getSource()==b1){
    tx1.setText("has presionado el bot\u00f3n 1");
   }
   if(e.getSource()==b2){
    tx1.setText("has presionado el bot\u00f3n 2");
   }
  if(e.getSource()==b3){
    tx1.setText("has presionado el bot\u00f3n 3");
   }
   
}

public static void main(String args[]){
   Programa p1 = new Programa();
   p1.setBounds(0,0,350,200);
   p1.setVisible(true);
   p1.setResizable(false);
   p1.setLocationRelativeTo(null);
}
}