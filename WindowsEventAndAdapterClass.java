
package windows.event.and.adapter.pkgclass;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;


public class WindowsEventAndAdapterClass {

    JFrame frame;
    CardLayout card;
    JPanel panel1,panel2,mainpanel;
    JButton button1,button2,button3,button4;
    Image image;
    public static void main(String[] args) {
        WindowsEventAndAdapterClass xyz=new WindowsEventAndAdapterClass();
        xyz.go();
        
    }
    void go()
    {
     try
     {
        image=ImageIO.read(new File("O:\\Java programs\\Windows Event and Adapter class\\src\\windows\\event\\and\\adapter\\pkgclass\\courage.png"));
     }
     catch(Exception e)
     {
         
     }
        JFrame frame=new JFrame();
        mainpanel=new JPanel();
        card=new CardLayout();
        mainpanel.setLayout(card);
        panel1=new JPanel(new GridLayout(1,2));
        panel2=new JPanel(new GridLayout(2,1));
        button1=new JButton("card1 button1");
        button2=new JButton("card1 button2");
        button3=new JButton("card2 button1");
        button4=new JButton("card2 button2");
        panel1.add(button1);
        panel1.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        mainpanel.add(panel1,"card1");
        mainpanel.add(panel2,"card2");
        frame.getContentPane().add(BorderLayout.CENTER,mainpanel);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter()
        {
            public void windowIconified(WindowEvent e) {
                frame.setIconImage(image);
      }
            public void windowDeiconified(WindowEvent e) {
               card.show(mainpanel,"card2");
               frame.setIconImage(null);
      }
            
        }
        );
        
        
    }
    
}
