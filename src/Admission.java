import java.awt.Color;
import javax.swing.*;
class Response
{
  
}

public class Admission
{
  public static void main(String args[])
  {
    JFrame s = new JFrame("Admissions system");
    JFrame r = new JFrame("Response Form");
    JLabel title = new JLabel("Admission Form");
    JLabel gpa = new JLabel("GPA");
    JLabel sat = new JLabel("SAT score");
    JLabel name = new JLabel("Name");
    JLabel email = new JLabel("Email");
    JTextField t1 = new JTextField("");
    JTextField t2 = new JTextField("");
    JTextField t3 = new JTextField("");
    JTextField t4 = new JTextField("");
    title.setBounds(90,0,150,50);
    gpa.setBounds(10,50,120,20);
    sat.setBounds(10,80,120,20);
    name.setBounds(10,110,120,20);
    email.setBounds(10,140,120,20);
    t1.setBounds(80,50,300,30);
    t2.setBounds(80,80,300,30);
    t3.setBounds(80,110,300,30);
    t4.setBounds(80,140,300,30);
    JButton as = new JButton("Add Application");
    JButton cancel = new JButton("Cancel");
    cancel.setBounds(295,170,85,30); //x,y,width,height;
    as.setBounds(170,170,130,30);   //x,y,width,heiht;
    s.setBackground(Color.blue);
    s.add(as);
    s.add(cancel);
    s.add(title);
    s.add(gpa);
    s.add(sat);
    s.add(name);
    s.add(email);
    s.add(t1);
    s.add(t2);
    s.add(t3);
    s.add(t4);
    s.setSize(410,250);  
    s.setLayout(null);
    s.setVisible(true); 

  }
}
