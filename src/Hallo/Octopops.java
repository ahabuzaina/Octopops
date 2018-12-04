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
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.util.ArrayList;

public class Octopops extends Sprite{
    private int dx;
    private int x = 50;
    public int y = 500;
    private Image image;
    private ArrayList Bullets;
    int hp = 3;
    int height = 100;
    int width = 80;
    public Octopops(int x, int y) {
        super(x, y);
        
        character();
    }
    
    private void character() {
        ImageIcon i = new ImageIcon("octopops.png");
        image = i.getImage();
    	Bullets = new ArrayList();
    }

    public void heshit(){
        hp = hp - 1;
    }
    
    public int gethp(){
    return hp;
    }
    
    @Override
    public Rectangle getBounds() {
	Rectangle r1 = new Rectangle();
	r1.setBounds(x, y, width, height);
    return r1;
    }

    public void move() {
        x += 5*dx;
    }
@Override
    public int getX() {
        return x;
    }
@Override
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