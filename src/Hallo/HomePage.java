package Hallo;
/**
 *
 * 
 */
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
public class HomePage extends JFrame
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gameeeee");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        
        frame.add(panel);
        frame.pack();
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setFocusable(true);
        panel.setBackground(Color.BLACK);
    }
    @Override
        public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }
}
