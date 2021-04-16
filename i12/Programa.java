import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Programa extends JFrame implements ActionListener{

 private JMenuBar menu;
 private JMenu menu1;
 private JMenuItem item1,item2,item3;

 public Programa(){
  setLayout(null);
  menu=new JMenuBar();
  setJMenuBar(menu);
  
  menu1= new JMenu("Opciones");
  menu.add(menu1);
  
  item1=new JMenuItem("Rojo");
  item1.addActionListener(this);
  menu1.add(item1);

  item2=new JMenuItem("Verde");
  item2.addActionListener(this);
  menu1.add(item2);

  item3=new JMenuItem("Azul");
  item3.addActionListener(this);
  menu1.add(item3);
 }
 
public void actionPerformed(ActionEvent e){
   Container fondo=this.getContentPane();
   
   if(e.getSource()==item1){
     fondo.setBackground(new Color(255,0,0));
   }
   if(e.getSource()==item2){
      fondo.setBackground(new Color(0,255,0));
   }
   if(e.getSource()==item3){
      fondo.setBackground(new Color(0,0,255));
   }
 }

 public static void main(String args[]){
  Programa p1 = new Programa();
  p1.setBounds(0,0,400,300);
  p1.setVisible(true);
  p1.setLocationRelativeTo(null);
 }
}
