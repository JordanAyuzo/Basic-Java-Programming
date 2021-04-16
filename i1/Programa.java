import javax.swing.*;

public class Programa extends JFrame{
 private JLabel mensaje1;

  public Programa(){
   setLayout(null);
   mensaje1= new JLabel("jordan ayuzo pacheco");
   mensaje1.setBounds(0,0,300,200);
   add(mensaje1);
  }

   public static void main(String args[]){
    Programa Programa1 = new Programa();
    Programa1.setBounds(0,0,300,200);
    Programa1.setVisible(true);
    Programa1.setLocationRelativeTo(null);
 
}

}