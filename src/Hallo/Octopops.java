/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hallo;

/**
 *
 * @author Student
 */
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Octopops {
    private int dx;
    private int x;
    private Image image;

    public Octopops() {
        character();
    }
    
    private void character() {
        
        ImageIcon i = new ImageIcon("octopops.png");
        image = i.getImage();
        x = 40;       
    }


    public void move() {
        x += dx;
    }

    public int getX() {
        return x;
    }

    public Image getImage() {
        return image;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_A) {
            dx = -1;
        }

        if (key == KeyEvent.VK_D) {
            dx = 1;
        }

       
    }

    public void keyReleased(KeyEvent e) {
        
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_A) {
            dx = 0;
        }

        if (key == KeyEvent.VK_D) {
            dx = 0;
        }
        

    }
}