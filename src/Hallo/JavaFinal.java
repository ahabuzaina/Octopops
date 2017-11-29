package Hallo;
/**
 *
 * 
 */
import javax.swing.JFrame;
public class JavaFinal 
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gameeeee");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        frame.add(panel);
        frame.pack();
        frame.setSize(600,600);
        frame.setVisible(true);
        
    }
    
}
