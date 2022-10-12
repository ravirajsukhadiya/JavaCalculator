import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.applet.*;

/*
<applet code="cal" width=250 height=300>
</applet>
*/

class calc extends JFrame implements ActionListener  
{  
   FlowLayout fl;
   GridLayout gr;
  JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9; 
   JButton b[],plus,eql,minus,mul,div,ce;
   JTextField t1;
   int a,c,r=0;
   String s="";
   public calc()
            { 
  gr = new GridLayout(8,1);
  setLayout(gr);
  fl = new FlowLayout(0); 
  p1 = new JPanel();
                         p1.setLayout(fl);
  t1 = new JTextField(15);
  p1.add(t1); 
  add(p1);
  b = new JButton[10];
  for(int i=0;i<10;i++)
  {
   b[i] = new JButton(    String.valueOf(i)    );
   }
       p3 = new JPanel();
                                p3.setLayout(fl);
  plus = new JButton("+");
  plus.addActionListener(this);
  p3.add(plus);
  ce = new JButton("      CE        ");
  ce.addActionListener(this);
  p3.add(ce);
  add(p3);
  p4 = new JPanel();
                 p4.setLayout(fl);
  mul = new JButton("* ");
  mul.addActionListener(this); 
  p4.add(mul); 
  div = new JButton("/ ");
  div.addActionListener(this);
  p4.add(div);
  minus = new JButton(" -");
  minus.addActionListener(this);
  p4.add(minus);
  add(p4);
  p5 = new JPanel();
                                p5.setLayout(fl);
  p5.add(  b[7]  );
  b[7].addActionListener(this);
  p5.add(  b[8]  );
  b[8].addActionListener(this);
  p5.add(  b[9]  );
  b[9].addActionListener(this);  
  add(p5);
  p6 = new JPanel();
                                p6.setLayout(fl);
  p6.add(b[4]);
  b[4].addActionListener(this);
  p6.add(b[5]);
  b[5].addActionListener(this); 
  p6.add(b[6]);
  b[6].addActionListener(this); 
  add(p6);
  p7 = new JPanel();
                                p7.setLayout(fl);
  p7.add(b[1]);
  b[1].addActionListener(this);
  p7.add(b[2]);
  b[2].addActionListener(this);
  p7.add(b[3]);
  b[3].addActionListener(this); 
  add(p7);
  p8 = new JPanel();
                         p8.setLayout(fl);
  p8.add(b[0]); 
  b[0].addActionListener(this);
  eql = new JButton("        =         ");
  eql.addActionListener(this);
  p8.add(eql);
  add(p8);
  setTitle("Java Calculator");
  setLocation(100,100);
  setSize(200,300);
                 setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
 public void actionPerformed(ActionEvent e)
 {
  for(int i=0; i<b.length; i++)
  {
   if(e.getSource() == b[i])
   {
    switch(i)
    {
     case 0:
      s=s+"0";
      break;
     case 1:
      s=s+"1";
      break;   
     case 2:
      s=s+"2";
      break; 
     case 3:
      s=s+"3";
      break;
     case 4:
      s=s+"4";
      break;
     case 5:
      s=s+"5";
      break;
     case 6:
      s=s+"6";
      break;
     case 7:
      s=s+"7";
      break;
     case 8:
      s=s+"8";
      break;
     case 9:
      s="9";
      break;
    }
   t1.setText(s);
   }
  }
  if(e.getSource() == plus)
  {
   a=Integer.parseInt(s);
   s="";
   t1.setText("");
   r=1;
  }
  else if(e.getSource() == minus)
  {
   a=Integer.parseInt(s);
   s="";
   t1.setText("");
   r=2;
  }
  else if(e.getSource() == mul)
  {
   a=Integer.parseInt(s);
   s="";
   t1.setText("");
   r=3;
  }
  else if(e.getSource() == div)
  {
   a=Integer.parseInt(s);
   s="";
   t1.setText("");
   r=4;
  }
  else if(e.getSource() == ce)
  {
   s="";
   t1.setText("");
  }
  else if(e.getSource() == eql)
  {
   switch(r)
   {
           case 1:  
     c = a + Integer.parseInt(t1.getText());
     break;
          case 2:
     c = a - Integer.parseInt(t1.getText());
     break;
          case 3:
     c = a * Integer.parseInt(t1.getText());
     break;
          case 4:
     c = a / Integer.parseInt(t1.getText());
     break;   
   }
   t1.setText(""+c);
  }
 }
}
public class cal
{
public static void main(String args[])
{
calc cl = new calc();
}
}