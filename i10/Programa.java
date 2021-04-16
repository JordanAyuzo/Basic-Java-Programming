import javax.swing.*;
import java.awt.event.*;

public class Programa extends JFrame implements ItemListener{
 
 private JComboBox c1;
 
 public Programa(){
 setLayout(null);
 c1=new JComboBox();
 c1.setBounds(10,10,80,20);
 add(c1);

 c1.addItem("rojo");
 c1.addItem("azul");
 c1.addItem("verde");
 c1.addItem("amarillo");
 c1.addItem("negro");
 c1.addItemListener(this);
 }
 public void itemStateChanged(ItemEvent e){
 if(e.getSource()==c1){
 String selec=c1.getSelectedItem().toString();
 setTitle(selec);
 }
}
 public static void main(String args[]){
 Programa p1=new Programa();
 p1.setBounds(0,0,200,150);
 p1.setVisible(true);
 p1.setResizable(false);
 p1.setLocationRelativeTo(null);
 }
}