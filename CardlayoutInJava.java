package cardlayout.in.java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CardlayoutInJava {

     JButton button1,button2,button1card1,button2card1,button1card2,button2card2;
     JPanel cardpanel,card1,card2;
     CardLayout c;
    public static void main(String[] args) {
       
       CardlayoutInJava xyz=new CardlayoutInJava();
       xyz.go();
     }
    public void go()
    {
        JFrame frame=new JFrame();
        button1=new JButton("card1");
        button2=new JButton("card2");
        frame.getContentPane().add(BorderLayout.WEST,button1);
        frame.getContentPane().add(BorderLayout.EAST,button2);
        card1=new JPanel(new GridLayout(1,2));
        button1card1=new JButton("left");
        button2card1=new JButton("right");
        card1.add(button1card1);
        card1.add(button2card1);
        card2=new JPanel(new GridLayout(2,1));
        button1card2=new JButton("card2 upper");
        button2card2=new JButton("card2 lower");
        card2.add(button1card2);
        card2.add(button2card2);
        c=new CardLayout();
        cardpanel=new JPanel(c);
        cardpanel.add(card1,"card1");
        cardpanel.add(card2,"card2");
        frame.getContentPane().add(BorderLayout.CENTER,cardpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
        button1.addActionListener(new card1());
        button2.addActionListener(new card2());
        
     }
    class card1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
            c.show(cardpanel,"card1");
           
        }
        
    }
     class card2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
            c.show(cardpanel,"card2");
           
        }
        
    }
    
}
