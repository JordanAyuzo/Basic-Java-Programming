import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
public class Condiciones extends JFrame implements ChangeListener, ActionListener{

 private JLabel img1,text1;
 private JTextArea ter;
 private JCheckBox box1;
 private JButton b1,b2;
 private JScrollPane sp1;
 String nombredos="";
 public Condiciones(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Terminos Y Condiciones");
  setIconImage(new ImageIcon(getClass().getResource("imagenes/b.png")).getImage());
  Programa bienvenida= new Programa();
  nombredos = bienvenida.nombreuno;  
  text1= new JLabel ("TÉRMINOS Y CONDICIONES");
  text1.setBounds(200,15,250,40);
  text1.setFont(new Font("Cambria", 1, 14));
  add(text1);

  ter= new JTextArea("\n\n"
                    +"      EN LA MÁXIMA MEDIDA PERMITIDA POR LA LEY APLICABLE, EN NINGÚN CASO ©THE COOKIE\n"
                    +"      COMPANY  SERÁ  RESPONSABLE  POR  DAÑOS  INDIRECTOS,  PUNITIVOS,  INCIDENTALES,\n"
                    +"      ESPECIALES,  CONSECUENTES  O  EJEMPLARES, INCLUIDOS,  ENTRE  OTROS, DAÑOS  POR\n"
                    +"      PÉRDIDA DE BENEFICIOS, BUENA VOLUNTAD, USO, DATOS.U OTRAS PÉRDIDAS INTANGIBLES\n"
                    +"      QUE SURJAN  DE O ESTÉN  RELACIONADAS CON EL USO O LA IMPOSIBILIDAD DE UTILIZAR\n"
                    +"      EL SERVICIO. EN LA MÁXIMA MEDIDA  PERMITIDA POR LA  LEY APLICABLE, ©THE COOKIE\n\n"
                    +"        (I)    ERRORES, ERRORES O INEXACTITUDES DE CONTENIDO; \n\n"
                    +"        (II)   LESIONES PERSONALES O DAÑOS A  LA PROPIEDAD, DE CUALQUIER  NATURALEZA\n"
                    +"                 QUE SEAN, COMO RESULTADO DE TU ACCESO O USO DE NUESTRO SERVICIO;\n\n"
                    +"        (III)  CUALQUIER ACCESO NO AUTORIZADO O USO DE NUESTROS SERVIDORES SEGUROS Y\n"
                    +"                  / O TODA LA INFORMACIÓN PERSONAL ALMACENADA EN LOS MISMOS.\n\n");
  ter.setEditable(false);
  ter.setFont(new Font("Yu Gothic", 0,10));
  sp1= new JScrollPane(ter);
  sp1.setBounds(30,55,550,300);
  add(sp1);

  box1= new JCheckBox("Yo "+ nombredos + " acepto las Condiciones");
  box1.setBounds(10,370,350,30);
  box1.addChangeListener(this);
  add(box1);

  b1=new JButton("Continuar");
  b1.setBounds(20,420,100,30);
  add(b1);
  b1.addActionListener(this);
  b1.setEnabled(false);

  b2=new JButton("Retroceder");
  b2.setBounds(130,420,100,30);
  add(b2);
  b2.addActionListener(this);
  b2.setEnabled(true);
  
 ImageIcon logo=new ImageIcon("imagenes/a.png");
  img1= new JLabel(logo);
  img1.setBounds(280,350,300,150);
  add(img1);
 }
 public void stateChanged(ChangeEvent e){
    if (box1.isSelected()==true){
       b1.setEnabled(true);
       b2.setEnabled(false);
     }else{
          b1.setEnabled(false);
          b2.setEnabled(true);       
          }
 }
  public void actionPerformed(ActionEvent e){
   if(e.getSource()==b1){
      Principal prin1=new Principal();
      prin1.setBounds(0,0,630,535);
      prin1.setVisible(true);
      prin1.setResizable(false);
      prin1.setLocationRelativeTo(null);
      this.setVisible(false);     


   }
   if(e.getSource()==b2){
      Programa p1 = new Programa();
      p1.setBounds(0,0,350,450);
      p1.setVisible(true);
      p1.setResizable(false);
      p1.setLocationRelativeTo(null);
      this.setVisible(false);
   }
 } 
 public static void main(String args[]){
  Condiciones c1 = new Condiciones();
  c1.setBounds(0,0,610,550);
  c1.setVisible(true);
  c1.setResizable(false);
  c1.setLocationRelativeTo(null);
 }
}