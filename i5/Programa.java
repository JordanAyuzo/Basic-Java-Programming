import javax.swing.*;
import java.awt.event.*;

public class Programa extends JFrame implements ActionListener{
 
 private JLabel tx1;
 private JButton b1; 
 private JTextField c1;

 public Programa(){
 setLayout(null);
 tx1= new JLabel("usuarió");
 tx1.setBounds(10,10,100,30);
 add(tx1);
 
 c1=new JTextField("vergüenza");
 c1.setBounds(120,17,150,20);
 add(c1);


 b1=new JButton("aceptar");
 b1.setBounds(10,80,100,30);
 add(b1);
 b1.addActionListener(this);
}

public void actionPerformed(ActionEvent e){
 if(e.getSource()==b1){
  String texto=c1.getText();
  setTitle(texto);
}
}
public static void main(String args[]){
 Programa p1= new Programa();
 p1.setBounds(0,0,300,150);
 p1.setVisible(true);
 p1.setResizable(false); 
 p1.setLocationRelativeTo(null);
}
}