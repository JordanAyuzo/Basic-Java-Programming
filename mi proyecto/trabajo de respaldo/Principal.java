import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
public class Principal extends JFrame implements ActionListener{

private JMenuBar  barra;
private JMenu  menu1,menu2,menu3,menu1_1,menu1_2,menu1_3;
private JMenuItem  item1,item2,item3,item4,item5,item6,item7;
private JLabel img1,text1,text2,text3,text4,text5,text6,text7,text8;
private JTextField tf1,tf2,tf3;
private JComboBox box1,box2;
private JTextArea area1;
private JScrollPane sp1;
private JButton b1,b2;
String nombretres="";
String departamento,tiempo,nombre,apellidop,apellidom;
 public Principal(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Sistema De Control Vacacional");
  getContentPane().setBackground(new Color(34,113,179));
  setIconImage(new ImageIcon(getClass().getResource("imagenes/b.png")).getImage());
  Programa bienvenida2=new Programa();
  nombretres = bienvenida2.nombreuno;
  
  barra= new JMenuBar();
  barra.setBackground(new Color(10,10,10));
  barra.setBorder(null);
  add(barra);
  setJMenuBar(barra);
  

  menu1=new JMenu("Opciones");
  menu1.setForeground(new Color(255,255,255));
  add(menu1);
  barra.add(menu1);
 
  menu1_2=new JMenu("Color de Fondo");
  menu1.add(menu1_2);

  item1=new JMenuItem("Azul azur");
  menu1_2.add(item1);
  item1.addActionListener(this);

  item2= new JMenuItem("Gris oscuro perlado");
  menu1_2.add(item2);
  item2.addActionListener(this);

  item3= new JMenuItem("Azul zafiro");
  menu1_2.add(item3);
  item3.addActionListener(this);

  item4= new JMenuItem("Predeterminado");
  menu1_2.add(item4);
  item4.addActionListener(this);

  item5= new JMenuItem("Menú principal");
  menu1.add(item5);
  item5.addActionListener(this);

  item6= new JMenuItem("Limpiar");
  menu1.add(item6);
  item6.addActionListener(this);
  
  menu3=new JMenu("Acerca De");
  menu3.setForeground(new Color(255,255,255));
  add(menu3);
  barra.add(menu3);

  item7= new JMenuItem("El creador");
  menu3.add(item7);
  item7.addActionListener(this);
 
  ImageIcon logo=new ImageIcon("imagenes/a.png");
  img1= new JLabel(logo);
  img1.setBounds(0,0,300,150);
  add(img1);
 
  text1= new JLabel("Bienvanido "+ nombretres);
  text1.setBounds(270,50,350,50);
  text1.setFont(new Font("andale mono", 3, 27));
  text1.setForeground(new Color(255,255,255));
  add(text1); 

  text2= new JLabel("Datos del trabajador para el cálculo de vacaciones.");
  text2.setBounds(30,170,530,30);
  text2.setFont(new Font("andale mono", 0, 23));
  text2.setForeground(new Color(255,255,255));
  add(text2); 

  text3= new JLabel("Nombre completo: ");
  text3.setBounds(20,225,150,20);
  text3.setFont(new Font("andale mono", 1, 12));
  text3.setForeground(new Color(255,255,255));
  add(text3);
   
  tf1= new JTextField ();
  tf1.setBounds(20,250,150,25);
  tf1.setBackground(new Color(234,230,202));
  tf1.setFont(new Font("andale mono", 1, 13));
  tf1.setForeground(new Color(30,45,110));
  tf1.setBorder(null);
  add(tf1);  
 
  text4= new JLabel("Apellido paterno: ");
  text4.setBounds(20,300,150,20);
  text4.setFont(new Font("andale mono", 1, 12));
  text4.setForeground(new Color(255,255,255));
  add(text4);

  tf2= new JTextField ();
  tf2.setBounds(20,330,150,25);
  tf2.setBackground(new Color(234,230,202));
  tf2.setFont(new Font("andale mono", 1, 13));
  tf2.setForeground(new Color(30,45,110));
  tf2.setBorder(null);
  add(tf2);

  text5= new JLabel("Apellido materno: ");
  text5.setBounds(20,380,150,20);
  text5.setFont(new Font("andale mono", 1, 12));
  text5.setForeground(new Color(255,255,255));
  add(text5);

  tf3= new JTextField ();
  tf3.setBounds(20,405,150,25);
  tf3.setBackground(new Color(234,230,202));
  tf3.setFont(new Font("andale mono", 1, 13));
  tf3.setForeground(new Color(30,45,110));
  tf3.setBorder(null);
  add(tf3);

  text6= new JLabel("Seleciona un departamento: ");
  text6.setBounds(220,225,200,20);
  text6.setFont(new Font("andale mono", 1, 12));
  text6.setForeground(new Color(255,255,255));
  add(text6);

  box1=new JComboBox();
  box1.setBounds(220,250,200,25);
  box1.setBackground(new Color(234,230,202));
  box1.setForeground(new Color(30,45,110));
  add(box1);

  box1.addItem("");
  box1.addItem("Atención al Cliente.");
  box1.addItem("Departamento de Logistica.");
  box1.addItem("Departamento de Gerencia."); 

  text7= new JLabel("seleciona la antigüedad: ");
  text7.setBounds(220,300,200,20);
  text7.setFont(new Font("andale mono", 1, 12));
  text7.setForeground(new Color(255,255,255));
  add(text7);
  
  box2=new JComboBox();
  box2.setBounds(220,330,200,25);
  box2.setBackground(new Color(234,230,202));
  box2.setForeground(new Color(30,45,110));
  add(box2);
  
  box2.addItem("");
  box2.addItem("1 año de servicio.");
  box2.addItem("2 a 6 años de servicio.");
  box2.addItem("7 o más años de servicio."); 
  
  area1= new JTextArea(" Presione el botón para Calcular");
  area1.setEditable(false);
  area1.setFont(new Font("andale mono", 0,12));
  sp1= new JScrollPane(area1);
  sp1.setBounds(220,370,320,90);
  add(sp1); 
  
  ImageIcon boton=new ImageIcon("imagenes/e.png");
  b1= new JButton(boton);
  b1.setBounds(450,250,90,68);
  b1.setBackground(new Color(0,0,0));
  b1.setBorder(null);
  b1.setFocusable(false);
  b1.setContentAreaFilled(false);
  b1.setVisible(true);
  b1.setEnabled(true);
  add(b1);
  b1.addActionListener(this); 

  ImageIcon boton2=new ImageIcon("imagenes/f.png");
  b2= new JButton(boton2);
  b2.setBounds(450,250,90,68);
  b2.setBackground(new Color(0,0,0));
  b2.setBorder(null);
  b2.setFocusable(false);
  b2.setContentAreaFilled(false);
  b2.setVisible(false);
  b2.setEnabled(false);
  add(b2);
  b2.addActionListener(this); 
 
  text8= new JLabel("Presione el boton verde.");
  text8.setBounds(450,318,300,20);
  text8.setFont(new Font("andale mono", 1, 10));
  text8.setForeground(new Color(255,255,255));
  add(text8);
 }
  public void actionPerformed(ActionEvent e){
  tf1.setBorder(null);  
  tf2.setBorder(null);
  tf3.setBorder(null);
  box1.setBorder(null);
  box2.setBorder(null);
  departamento=box1.getSelectedItem().toString();
  tiempo=box2.getSelectedItem().toString();
  nombre=tf1.getText().toString().trim();
  apellidop=tf2.getText().toString().trim();
  apellidom=tf3.getText().toString().trim();

  if(e.getSource()==item1){
    getContentPane().setBackground(new Color(2,86,105));
  } 
    
  if(e.getSource()==item2){
    getContentPane().setBackground(new Color(130,130,130)); 
  }

  if(e.getSource()==item3){
    getContentPane().setBackground(new Color(29,30,51));
  }
  if(e.getSource()==item4){
    getContentPane().setBackground(new Color(34,113,179));
  }

  if(e.getSource()==item5){
      Programa p1 = new Programa();
      p1.setBounds(0,0,350,450);
      p1.setVisible(true);
      p1.setResizable(false);
      p1.setLocationRelativeTo(null);
      this.setVisible(false);
  }
  if(e.getSource()==item6){
  departamento=("");
  tiempo=("");
  nombre=("");
  apellidop=("");
  apellidom=("");
  tf1.setText("");
  tf2.setText("");
  tf3.setText("");
  area1.setText(" Aquí aparecerá el nuevo resultado");
  box1.setSelectedIndex(0);
  box2.setSelectedIndex(0);
  }

  if(e.getSource()==item7){
  JOptionPane.showMessageDialog(null,"Hecho por: Jordan Ayuzo Pacheco \n"
                               +" Contacto:rgtbliving@gmail.com  "); 
  }
  if(e.getSource()==b1){
    if(tiempo.equals("")||apellidop.equals("")||departamento.equals("")||apellidom.equals("")||nombre.equals("")){
      if(nombre.equals("")){ 
        tf1.setBorder(BorderFactory.createLineBorder(Color.RED, 1)); 
      }  
      if(apellidop.equals("")){
        tf2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));  
      }  
      if(apellidom.equals("")){
        tf3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
      }  
      if(tiempo.equals("")){
        box2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
      }
      if(departamento.equals("")){
         box1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
      }
      JOptionPane.showMessageDialog(null, "debes igresar todos los datos.");    
   }  
   else{
        text8.setVisible(false);
        b1.setVisible(false);
        b1.setEnabled(false);
        b2.setVisible(true);
        b2.setEnabled(true);
        if(departamento.equals("Atención al Cliente.")){
           if (tiempo.equals("1 año de servicio.")){
               area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                            +" eres del area de " + departamento + " y tienes \n"
                            + " "+ tiempo + " Por lo cual los dias de vacaciones\n" 
                            +" son seis dias."); 
           }
           if (tiempo.equals("2 a 6 años de servicio.")){
               area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                            +" eres del area de " + departamento + " y tienes \n"
                            +  " "+ tiempo + " Por lo cual los dias de vacaciones\n"   
                            +" son catorce dias.");
           }
           if (tiempo.equals("7 o más años de servicio.")){
              area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                           +" eres del area de " + departamento + " y tienes \n"
                           + " "+ tiempo + " Por lo cual los dias de vacaciones\n" 
                           +" son veinte dias."); 
           }
        }

        if(departamento.equals("Departamento de Logistica.")){
           if (tiempo.equals("1 año de servicio.")){
               area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                            +" eres del area de " + departamento + " y tienes \n"
                            +  " "+  tiempo + " Por lo cual los dias de vacaciones\n" 
                            +" son siete dias."); 
           }
           if (tiempo.equals("2 a 6 años de servicio.")){
               area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                            +" eres del area de " + departamento + " y tienes \n"
                            +  " "+  tiempo + " Por lo cual los dias de vacaciones\n"   
                            +" son quince dias.");
           }
           if (tiempo.equals("7 o más años de servicio.")){
              area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                           +" eres del area de " + departamento + " y tienes \n"
                           +   " "+ tiempo + " por lo cual los dias de vacaciones\n" 
                           +" son veintidos dias."); 
           }
        }
        if(departamento.equals("Departamento de Gerencia.")){
           if (tiempo.equals("1 año de servicio.")){
               area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                            +" eres del area de " + departamento + " y tienes \n"
                            +  " "+  tiempo + ", por lo cual los dias de vacaciones\n" 
                            +" son diez dias."); 
           }
           if (tiempo.equals("2 a 6 años de servicio.")){
               area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                            +" eres del area de " + departamento + " y tienes \n"
                            +  " "+  tiempo + " Por lo cual los dias de vacaciones\n"   
                            +" son veinte dias.");
           }
           if (tiempo.equals("7 o más años de servicio.")){
              area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                           +" eres del area de " + departamento + " y tienes \n"
                           +   " "+ tiempo + " Por lo cual los dias de vacaciones\n" 
                           +" son treinta dias."); 
           }
        }
    }  
}

   if(e.getSource()==b2){
    if(tiempo.equals("")||apellidop.equals("")||departamento.equals("")||apellidom.equals("")||nombre.equals("")){
      if(nombre.equals("")){ 
        tf1.setBorder(BorderFactory.createLineBorder(Color.RED, 1)); 
      }  
      if(apellidop.equals("")){
        tf2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));  
      }  
      if(apellidom.equals("")){
        tf3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
      }  
      if(tiempo.equals("")){
        box2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
      }
      if(departamento.equals("")){
         box1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
      }
      JOptionPane.showMessageDialog(null, "Debes igresar todos los datos.");    
   }  
   else{
        if(departamento.equals("Atención al Cliente.")){
           if (tiempo.equals("1 año de servicio.")){
               area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                            +" eres del area de " + departamento + " y tienes \n"
                            +  " "+ tiempo + " Por lo cual los dias de vacaciones\n" 
                            +" son seis dias."); 
           }
           if (tiempo.equals("2 a 6 años de servicio.")){
               area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                            +" eres del area de " + departamento + " y tienes \n"
                            +  " "+  tiempo + ", por lo cual los dias de vacaciones\n"   
                            +" son catorce dias.");
           }
           if (tiempo.equals("7 o más años de servicio.")){
              area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                           +" eres del area de " + departamento + " y tienes \n"
                           +   " "+ tiempo + ", por lo cual los dias de vacaciones\n" 
                           +" son veinte dias."); 
           }
        }

        if(departamento.equals("Departamento de Logistica.")){
           if (tiempo.equals("1 año de servicio.")){
               area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                            +" eres del area de " + departamento + " y tienes \n"
                            +   " "+ tiempo + " por lo cual los dias de vacaciones\n" 
                            +" son siete dias."); 
           }
           if (tiempo.equals("2 a 6 años de servicio.")){
               area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                            +" eres del area de " + departamento + " y tienes \n"
                            +  " "+ tiempo + " por lo cual los dias de vacaciones\n"   
                            +" son quince dias.");
           }
           if (tiempo.equals("7 o más años de servicio.")){
              area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                           +" eres del area de " + departamento + " y tienes \n"
                           +  " "+  tiempo + " por lo cual los dias de vacaciones\n" 
                           +" son veintidos dias."); 
           }
        }
        if(departamento.equals("Departamento de Gerencia.")){
           if (tiempo.equals("1 año de servicio.")){
               area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                            +" eres del area de " + departamento + " y tienes \n"
                            +   " "+ tiempo + " Por lo cual los dias de vacaciones\n" 
                            +" son diez dias."); 
           }
           if (tiempo.equals("2 a 6 años de servicio.")){
               area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                            +" eres del area de " + departamento + " y tienes \n"
                            +  " "+ tiempo + " Por lo cual los dias de vacaciones\n"   
                            +" son veinte dias.");
           }
            if (tiempo.equals("7 o más años de servicio.")){
              area1.setText(" Hola" + " " + nombre +" "+apellidop + " " + apellidom + "\n"
                           +" eres del area de " + departamento + " y tienes \n"
                           +  " "+ tiempo + " Por lo cual los dias de vacaciones\n" 
                           +" son treinte dias."); 
           }
        }
   }  
}
}

 public static void main(String args[]){
   Principal prin1=new Principal();
   prin1.setBounds(0,0,630,535);
   prin1.setVisible(true);
   prin1.setResizable(false);
   prin1.setLocationRelativeTo(null);
 } 
}