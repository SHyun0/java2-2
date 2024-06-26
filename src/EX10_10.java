import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class EX10_10 extends JFrame{
    private String [] fruits = {"apple", "banana", "mango"}; 
    private ImageIcon [] images = { new ImageIcon("images/apple.jpg"),
            new ImageIcon("images/banana.jpg"),
            new ImageIcon("images/mango.jpg") };
    private JLabel imgLabel= new JLabel(images[0]); 

    public EX10_10() {
        setTitle("콤보박스활용예제");
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    JComboBox<String> combo = new JComboBox<String>(fruits); 
    c.add(combo); c.add(imgLabel);

    combo.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        JComboBox<String> cb = (JComboBox<String>)e.getSource(); 
       int index = cb.getSelectedIndex(); 
       imgLabel.setIcon(images[index]); 
       }
    });
    setSize(300,250);
    setVisible(true);
        }
    public static void main(String [] args) {
        new EX10_10();
    }
}  
    