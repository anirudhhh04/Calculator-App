import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class calculator implements ActionListener {
    JFrame f=new JFrame();
    JTextField t1;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,a,b,c,d,e1,c1;
    calculator(){
    b1=new JButton("1");
    b2=new JButton("2");
    b3=new JButton("3");
    b4=new JButton("4");
    b5=new JButton("5");
    b6=new JButton("6");
    b7=new JButton("7");
    b8=new JButton("8");
    b9=new JButton("9");
    b0=new JButton("0");
    a=new JButton("+");
    b=new JButton("-");
    c=new JButton("x");
    d=new JButton("/");
    e1=new JButton("=");
    c1=new JButton("Clear");
    t1= new JTextField();
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b0.addActionListener(this);
    a.addActionListener(this);
    b.addActionListener(this);
    c.addActionListener(this);
    d.addActionListener(this);
    e1.addActionListener(this);
    c1.addActionListener(this);
    f.setTitle("CALCULATOR");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(new GridLayout(4,4));
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);
    f.add(b6);
    f.add(b7);
    f.add(b8);
    f.add(b9);
    f.add(b0);
    f.add(a);
    f.add(b);
    f.add(c);
    f.add(d);
    f.add(e1);
    f.add(t1);
    f.add(c1);
    f.setVisible(true);
    f.setSize(400, 500);}
    public void actionPerformed(ActionEvent e){
        if(e.getSource()!=e1 && e.getSource()!=c1{
          String s=((JButton)e.getSource()).getText();
          String t=t1.getText();
          t1.setText(t+s);
        }
        else if(e.getSource()==c1){
            t1.setText("0");}
        else{
            String s1=t1.getText();
            String t="",p="";
            char u=' ';
            int k=0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)=='+' || s1.charAt(i)=='-' || s1.charAt(i)=='x' || s1.charAt(i)=='/'){
                       k=1;
                       u=s1.charAt(i);
                        
                }
                else if(k==0){
                    t=t+s1.charAt(i);
                }
                else{
                  p=p+s1.charAt(i);
                }
            }
           double i= cal(t,p,u);
           if(i!=-1){
             t1.setText(i+"");
           }
        }
    }
    
    public double cal(String n,String m,char o){
        int f,s;
        f=Integer.parseInt(n);
        s=Integer.parseInt(m);
        if(o=='+') return (double)f+s;
        else if(o=='-') return (double)f-s;
        else if(o=='x') return (double)f*s;
        else if(o=='/') {
            if(s==0){ t1.setText("Not Possible");
                      return -1;}

            else return (double)f/s;

        }

        return 0;
    }
}
     
class Calc{
public static void main(String args[]){
     new calculator();
}
    
}
