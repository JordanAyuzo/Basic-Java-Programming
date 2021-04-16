import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Programa extends JFrame implements ActionListener{
 
 private JLabel tx1,tx2,tx3;
 private JComboBox c1,c2,c3;
 private JButton b1;
 
 public Programa(){
 setLayout(null);
 setTitle("RGB");
 setIconImage(new ImageIcon(getClass().getResource("paquete/1.png")).getImage());
 
 tx1=new JLabel("ROJO: ");
 tx1.setBounds(10,10,100,10);
 add(tx1);

 c1= new JComboBox();
 c1.setBounds(120,10,50,30);
   for(int i=0;i<=255;i++){
    c1.addItem(String.valueOf(i));
   }
  add(c1);
 
 tx2=new JLabel("VERDE: ");
 tx2.setBounds(10,50,100,10);
 add(tx2);

 c2= new JComboBox();
 c2.setBounds(120,50,50,30);
   for(int i=0;i<=255;i++){
    c2.addItem(String.valueOf(i));
   }
  add(c2);

 tx3=new JLabel("AZUL: ");
 tx3.setBounds(10,90,100,10);
 add(tx3);

 c3= new JComboBox();
 c3.setBounds(120,90,50,30);
   for(int i=0;i<=255;i++){
    c3.addItem(String.valueOf(i));
   }
  add(c3);
 b1= new JButton("Fijar color");
 b1.setBounds(10,130,100,30);
 add(b1);
 b1.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource()==b1){
    String cad1=c1.getSelectedItem().toString();
    String cad2=c2.getSelectedItem().toString();
    String cad3=c3.getSelectedItem().toString();
    int rojo= Integer.parseInt(cad1);
    int verde= Integer.parseInt(cad2);
    int azul= Integer.parseInt(cad3);
    
    Color color1=new Color(rojo,verde,azul);
    b1.setBackground(color1);
  } 
 }
 public static void main(String args[]){
   Programa p1=new Programa();
   p1.setBounds(0,0,190,220);
   p1.setVisible(true);
   p1.setResizable(false);
   p1.setLocationRelativeTo(null);
 }
}