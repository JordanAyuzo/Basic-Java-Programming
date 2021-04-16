import javax.swing.*;


public class Programa extends JFrame{

private JTextField tf1;
private JTextArea ta1;


public Programa(){
 setLayout(null);
 tf1= new JTextField();
 tf1.setBounds(10,10,200,30);
 add(tf1);

 ta1= new JTextArea();
 ta1.setBounds(10,50,400,300);
 add(ta1);
}
public static void main(String args[]){
 Programa p1= new Programa();
 p1.setBounds(0,0,500,400);
 p1.setVisible(true);
 p1.setResizable(false); 
 p1.setLocationRelativeTo(null);
}


}