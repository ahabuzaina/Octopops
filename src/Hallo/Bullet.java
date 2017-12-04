/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hallo;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author Tranqualizer
 */

public class Bullet extends Sprite {

    private final int BOARD_WIDTH = 1500;
    private final int BulletSpeed = 5;

    public Bullet(int x, int y) {
        super(x, y);
        
        initBullet();
    }
    
    private void initBullet() {
        
        loadImage("bullet.png");  
        getImageDimensions();
    }


    public void move() {
        
        x += BulletSpeed;
        
        if (x > BOARD_WIDTH) {
            vis = false;
        }
    }
}