import javax.swing.*;
import java.awt.event.*;
public class Programa extends JFrame implements ActionListener{
 
 private JTextField tf1;
 private JScrollPane sp1; 
 private JTextArea ta1;
 private JButton b1,b2;
 String texto=("");
 
 public Programa(){
  setLayout(null);
  tf1= new JTextField();
  tf1.setBounds(10,10,200,30);
  add(tf1);

  b1 = new JButton ("okey");
  b1.setBounds(225,10,90,30);
  add(b1);
  b1.addActionListener(this);

  b2 = new JButton ("cls");
  b2.setBounds(325,10,90,30);
  add(b2);
  b2.addActionListener(this);

  ta1= new JTextArea();
  sp1= new JScrollPane(ta1);
  sp1.setBounds(10,50,400,300);
  add(sp1);
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource()==b1){
   texto += tf1.getText() +"\n";
   ta1.setText(texto);
   tf1.setText("");
  }
  if(e.getSource()==b2){
   texto=("");
   ta1.setText("");
  }
 }
 public static void main(String args[]){
  Programa p1 = new Programa();
  p1.setBounds(0,0,450,400);
  p1.setVisible(true);
  p1.setResizable(false);
  p1.setLocationRelativeTo(null);
 }
}