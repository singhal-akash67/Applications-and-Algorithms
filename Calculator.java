package calculator;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author AKASH SINGHAL
 */
public class Calculator {
     JFrame frame;
    JButton reset,backspace,one,second,third,fourth,five,six,seven,eight,nine,zero,plus,minus,divide,multiply,equalto;
    JPanel panel,panelleftmost,panelcentermost,panelrightmost,topmost,paneloperators;
    JTextField textfield;
    float firstnumber=0;
    float secondnumber=0;
    boolean operator=false;
    String operatorsign;
    oneclass a;
    twoclass b;
    threeclass c;
    fourclass d;
    fiveclass e;
    sixclass f;
    sevenclass g;
    eightclass h;
    nineclass i;
    zeroclass j;
    equaltooperator k;
    plusoperator l;
    minusoperator m;
    multiplyoperator n;
    divideoperator o;
    backspace p;
    reset q;
    
    
 
    
    public static void main(String[] args) {
        Calculator xyz=new Calculator();
        xyz.go();    
    }
    public void go(){
        frame=new JFrame();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel=new JPanel();
        reset=new JButton("reset");
        backspace=new JButton("backspace");
        p=new backspace();
        q=new reset();
        reset.addActionListener(q);
        backspace.addActionListener(p);
        textfield=new JTextField("enter number");
        panel.add(reset);
        panel.add(textfield);
        panel.add(backspace);
        topmost=new JPanel();
        panelleftmost=new JPanel();
        one=new JButton("1");
        second=new JButton("2");
        third=new JButton("3");
        fourth=new JButton("4");
        a=new oneclass();
        b=new twoclass();
        c=new threeclass();
        d=new fourclass();
        one.addActionListener(a);
        second.addActionListener(b);
        third.addActionListener(c);
        fourth.addActionListener(d);
        panelleftmost.add(one);
        panelleftmost.add(second);
        panelleftmost.add(third);
        panelleftmost.add(fourth);
        panelleftmost.setLayout(new BoxLayout(panelleftmost,BoxLayout.Y_AXIS));
        panelcentermost= new JPanel();
        five=new JButton("5");
        six=new JButton("6");
        seven=new JButton("7");
        eight=new JButton("8");  
         e=new fiveclass();
        f=new sixclass();
        g=new sevenclass();
        h=new eightclass();
        five.addActionListener(e);
        six.addActionListener(f);
        seven.addActionListener(g);
        eight.addActionListener(h);
        panelcentermost.add(five);
        panelcentermost.add(six);
        panelcentermost.add(seven);
        panelcentermost.add(eight);
        panelcentermost.setLayout(new BoxLayout(panelcentermost,BoxLayout.Y_AXIS));

        panelrightmost= new JPanel();
        nine=new JButton("9");
        zero=new JButton("0");
        i=new nineclass();
        j=new zeroclass();
        k=new equaltooperator();
                l=new plusoperator();
                m=new minusoperator();
                n=new multiplyoperator();
                o=new divideoperator();
                
        nine.addActionListener(i);
        zero.addActionListener(j);
        panelrightmost.add(nine);
        panelrightmost.add(zero);
        panelrightmost.setLayout(new BoxLayout(panelrightmost,BoxLayout.Y_AXIS));
        paneloperators=new JPanel();
        paneloperators.setLayout(new BoxLayout(paneloperators,BoxLayout.Y_AXIS));
        minus=new JButton("-");
        plus=new JButton("+"); 
        divide=new JButton("/");
        multiply=new JButton("*");
        equalto=new JButton("=");
        equalto.addActionListener(k);
       plus.addActionListener(l);
       minus.addActionListener(m);
       multiply.addActionListener(n);
       divide.addActionListener(o);
        paneloperators.add(minus);
        paneloperators.add(plus);
        paneloperators.add(divide);
        paneloperators.add(multiply);
        paneloperators.add(equalto);
        topmost.add(panelleftmost);
        topmost.add(panelcentermost);
        topmost.add(panelrightmost);
        topmost.add(paneloperators);
        
        frame.getContentPane().add(BorderLayout.NORTH,panel);
        frame.getContentPane().add(BorderLayout.CENTER,topmost);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    class oneclass implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(operator==false)
                firstnumberformation(1);
            else
                secondnumberformation(1);
            
           
        }
    }
    class twoclass implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(operator==false)
                firstnumberformation(2);
            else
                secondnumberformation(2);
            
        }
    }
    class threeclass implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(operator==false)
                firstnumberformation(3);
            else
                secondnumberformation(3);
            
        }
    }
    class fourclass implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(operator==false)
                firstnumberformation(4);
            else
                secondnumberformation(4);
            
        }
    }
    class fiveclass implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(operator==false)
                firstnumberformation(5);
            else
                secondnumberformation(5);
            
        }
    }
    class sixclass implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(operator==false)
                firstnumberformation(6);
            else
                secondnumberformation(6);
            
        }
    }
    class sevenclass implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(operator==false)
                firstnumberformation(7);
            else
                secondnumberformation(7);
            
        }
    }
    class eightclass implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(operator==false)
                firstnumberformation(8);
            else
                secondnumberformation(8);
            
        }
    }
    class nineclass implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(operator==false)
                firstnumberformation(9);
            else
                secondnumberformation(9);
            
        }
    }
    class zeroclass implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(operator==false)
                firstnumberformation(0);
            else
                secondnumberformation(0);
            
        }
    }
    class backspace implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(secondnumber==0&&operator==false)
                firstnumber=firstnumber/10;
            else if(secondnumber==0&&operator==true)
                operator=false;
            else
                secondnumber=secondnumber/10;
        }
    }
    class reset implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            operator=false;
            firstnumber=0;
            secondnumber=0;
            textfield.setText(" ");
        }
    }
    void firstnumberformation(int a)
    {
        firstnumber=firstnumber*10+a;
        textfield.setText(Float.toString(firstnumber));
    }
    void secondnumberformation(int b)
    {
        secondnumber=secondnumber*10+b;
        textfield.setText(Float.toString(secondnumber));
    }
     class equaltooperator implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(secondnumber==0)
                textfield.setText("error");
            else if(operatorsign=="+")
            {
                firstnumber=firstnumber+secondnumber;
            }
            else if(operatorsign=="-")
            {
                firstnumber=firstnumber-secondnumber;
            }
            else if(operatorsign=="*")
            {
                firstnumber=firstnumber*secondnumber;
            }
            else if(operatorsign=="/")
            {
                firstnumber=firstnumber/secondnumber;
            }
            secondnumber=0;
            textfield.setText(Float.toString(firstnumber));
            operator=false;
                
          
        }
    }
     class plusoperator implements ActionListener
     {
         public void actionPerformed(ActionEvent e)
         {
             if(operator==true&&secondnumber==0)
                 textfield.setText("error");
             else if(operator==true)
             {
                 if(operatorsign=="+")
            {
                firstnumber=firstnumber+secondnumber;
            }
            else if(operatorsign=="-")
            {
                firstnumber=firstnumber-secondnumber;
            }
            else if(operatorsign=="*")
            {
                firstnumber=firstnumber*secondnumber;
            }
            else if(operatorsign=="/")
            {
                firstnumber=firstnumber/secondnumber;
            }
                 secondnumber=0;
                 operator=false;
             }
         
             
             
             operator=true;
             operatorsign=("+");
             
         }
         
     }
     class multiplyoperator implements ActionListener
     {
         public void actionPerformed(ActionEvent e)
         {
             if(operator==true&&secondnumber==0)
                 textfield.setText("error");
             else if(operator==true)
             {
                 if(operatorsign=="+")
            {
                firstnumber=firstnumber+secondnumber;
            }
            else if(operatorsign=="-")
            {
                firstnumber=firstnumber-secondnumber;
            }
            else if(operatorsign=="*")
            {
                firstnumber=firstnumber*secondnumber;
            }
            else if(operatorsign=="/")
            {
                firstnumber=firstnumber/secondnumber;
            }
                 secondnumber=0;
                 operator=false;
             }
       
             
             
             operator=true;
             operatorsign=("*");
             
         }
         
     }
     class minusoperator implements ActionListener
     {
         public void actionPerformed(ActionEvent e)
         {
             if(operator==true&&secondnumber==0)
                 textfield.setText("error");
             else if(operator==true)
             {
                 if(operatorsign=="+")
            {
                firstnumber=firstnumber+secondnumber;
            }
            else if(operatorsign=="-")
            {
                firstnumber=firstnumber-secondnumber;
            }
            else if(operatorsign=="*")
            {
                firstnumber=firstnumber*secondnumber;
            }
            else if(operatorsign=="/")
            {
                firstnumber=firstnumber/secondnumber;
            }
                 secondnumber=0;
                 operator=false;
             }
            
             
             
             operator=true;
             operatorsign=("-");
             
         }
         
     }
     class divideoperator implements ActionListener
     {
         public void actionPerformed(ActionEvent e)
         {
             if(operator==true&&secondnumber==0)
                 textfield.setText("error");
             else if(operator==true)
             {
                 if(operatorsign=="+")
            {
                firstnumber=firstnumber+secondnumber;
            }
            else if(operatorsign=="-")
            {
                firstnumber=firstnumber-secondnumber;
            }
            else if(operatorsign=="*")
            {
                firstnumber=firstnumber*secondnumber;
            }
            else if(operatorsign=="/")
            {
                firstnumber=firstnumber/secondnumber;
            }
                 secondnumber=0;
                 operator=false;
             }
        
             
             
             operator=true;
             operatorsign=("/");
             
         }
         
     }
 }
