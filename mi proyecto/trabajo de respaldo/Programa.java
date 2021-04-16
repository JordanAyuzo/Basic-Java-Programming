import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/* HECHO POR JORDAN
   c companyone*/

public class Programa extends JFrame implements ActionListener{
 private JLabel img1,text1,text2,text3;
 private JTextField tf1;
 private JButton b1,b2;
 public static String nombreuno;
 
public Programa(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Bienvenido");
  getContentPane().setBackground(new Color(34,113,179));
  setIconImage(new ImageIcon(getClass().getResource("imagenes/b.png")).getImage());
  
  ImageIcon logo=new ImageIcon("imagenes/a.png");
  img1= new JLabel(logo);
  img1.setBounds(25,15,300,150);
  add(img1);
   
  text1= new JLabel("Sistema De Control Vacacional");
  text1.setBounds(30,180,300,30);
  text1.setFont(new Font("andale mono", 3, 18));
  text1.setForeground(new Color(255,255,255));
  add(text1);

  text2= new JLabel("Ingrese su Nombre: ");
  text2.setBounds(30,230,150,30);
  text2.setFont(new Font("andale mono", 1, 12));
  text2.setForeground(new Color(255,255,255));
  add(text2);  
   
  tf1= new JTextField ();
  tf1.setBounds(30,260,270,30);
  tf1.setBackground(new Color(234,230,202));
  tf1.setFont(new Font("andale mono", 1, 14));
  tf1.setForeground(new Color(30,45,110));
  tf1.setBorder(null);
  add(tf1);

  ImageIcon boton1=new ImageIcon("imagenes/c.png");
  b1= new JButton(boton1);
  b1.setBounds(140,310,65,65);
  b1.setBackground(new Color(34,113,179));
  b1.setBorder(null);
  b1.setFocusable(false);
  b1.setContentAreaFilled(false);
  add(b1);
  b1.addActionListener(this);

  ImageIcon boton2=new ImageIcon("imagenes/d.png");
  b2= new JButton(boton2);
  b2.setBounds(240,0,90,68);
  b2.setBackground(new Color(0,0,0));
  b2.setBorder(null);
  b2.setFocusable(false);
  b2.setContentAreaFilled(false);
  add(b2);
  b2.addActionListener(this);

  text3= new JLabel("©2020 The Cookie Company");
  text3.setBounds(100,380,200,30);
  text3.setFont(new Font("andale mono", 1, 11));
  text3.setForeground(new Color(255,255,255));
  add(text3); 

 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource()==b1){
  nombreuno=tf1.getText().trim();
    if(nombreuno.equals("")){
      JOptionPane.showMessageDialog(null, "debes ingresar tu nombre");
    }
    else{
         Condiciones c1 = new Condiciones();
         c1.setBounds(0,0,610,550);
         c1.setVisible(true);
         c1.setResizable(false);
         c1.setLocationRelativeTo(null);
         this.setVisible(false);
    }
  }
  if(e.getSource()==b2){
   System.exit(0);  
  }
 }
 

 public static void main(String args[]){
  Programa p1 = new Programa();
  p1.setBounds(0,0,350,450);
  p1.setVisible(true);
  p1.setResizable(false);
  p1.setLocationRelativeTo(null);
}
}