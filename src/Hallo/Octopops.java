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
import java.util.ArrayList;

public class Octopops extends Sprite{
    private int dx;
    public int x;
    private Image image;
    private ArrayList Bullets;
    
    public Octopops(int x, int y) {
        super(x, y);
        
        character();
    }
    
    private void character() {
        Bullets = new ArrayList();
        ImageIcon i = new ImageIcon("octopops.png");
        image = i.getImage();
        y = 500;
        x = 90;       
    }


    public void move() {
        x += 4*dx;
    }

    public int getX() {
        return x;
    }

    public Image getImage() {
        return image;
    }
    
    public ArrayList getBullets() {
        return Bullets;
}

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        if (key == KeyEvent.VK_A && x >= 0) {
            x = Math.max(0, x);
            x = Math.min(1000, x);
            dx = -1;
        }

        if (key == KeyEvent.VK_D && x <= 1000) {
            x = Math.max(0, x);
            x = Math.min(1000, x);
            dx = 1;
        }
        if (key == KeyEvent.VK_SPACE) {
            fire();
        }
    }
    public void fire() {
        Bullets.add(new Bullet(x + 65, y));
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