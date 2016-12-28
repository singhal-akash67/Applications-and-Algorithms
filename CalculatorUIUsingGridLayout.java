
package calculator.ui.using.grid.layout;
import javax.swing.*;
import java.awt.*;
public class CalculatorUIUsingGridLayout {

    
    public static void main(String[] args) {
        JFrame frame=new JFrame();
       JTextField textedit=new JTextField();
       
         JButton reset=new JButton("reset");
        JButton backspace=new JButton("backspace");
        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(1,3));
        panel.add(reset);
        panel.add(textedit);
        panel.add(backspace);
        frame.getContentPane().add(BorderLayout.NORTH,panel);
        JPanel panel2=new JPanel();
        panel2.setLayout(new GridLayout(4,4));
        JButton one=new JButton("1");
        JButton two=new JButton("2");
        JButton three=new JButton("3");
        JButton four=new JButton("4");
        JButton five=new JButton("5");
        JButton six=new JButton("6");
        JButton seven=new JButton("7");
        JButton eight=new JButton("8");
        JButton nine=new JButton("9");
        JButton zero=new JButton("0");
        JButton plus=new JButton("+");
        JButton minus=new JButton("-");
        JButton divide=new JButton("/");
        JButton multiply=new JButton("*");
        JButton dot=new JButton(".");
        JButton sqrt=new JButton("sqrt");
        panel2.add(one);
        panel2.add(two);
        panel2.add(three);
        panel2.add(plus);
        panel2.add(four);
        panel2.add(five);
        panel2.add(six);
        panel2.add(minus);
        panel2.add(seven);
        panel2.add(eight);
        panel2.add(nine);
        panel2.add(divide);
        panel2.add(zero);
        panel2.add(dot);
        panel2.add(sqrt);
        panel2.add(multiply);

        frame.getContentPane().add(BorderLayout.CENTER,panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
        
        
        
       
        
        
    }
    
}
