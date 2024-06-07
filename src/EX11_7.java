import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 public class EX11_7 extends JFrame{
    public EX11_7() {
        setTitle("마우스드래깅으로타원그리기예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String [] args) {
        new EX11_7();
 }
    class MyPanel extends JPanel {
        private Point start=null, end=null;
        public MyPanel() {
            MyMouseListener listener = new MyMouseListener();

            addMouseListener(listener); 
            addMouseMotionListener(listener);
 }
    class MyMouseListener extends MouseAdapter { 
        public void mousePressed(MouseEvent e) {
         start = e.getPoint(); 
    }
        public void mouseDragged(MouseEvent e) {
        end = e.getPoint();
        repaint(); 
    }
}
    public void paintComponent(Graphics g) { 
        super.paintComponent(g);
        if(start == null) 
         return;
        g.setColor(Color.BLUE);
        int x = Math.min(start.x, end.x);
        int y = Math.min(start.y, end.y);
        int width = Math.abs(start.x-end.x);
        int height = Math.abs(start.y-end.y);
        g.drawOval(x, y, width, height);
        }
    }
}