/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hallo;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.util.Random;

/**
 *
 * @author Student
 */
public class FallingBullets extends Sprite{
    
    private final int BOARD_Length = 700;
    private final int BOARD_WIDTH = 1500;
    Random rng = new Random();
    int BulletSpeedx = 0;
    int BulletSpeedy = 2;
    
    public FallingBullets(int x, int y) {
        
    super(x, y);
        
        character();
    }
    
private void character() {
        loadImage("fallingbullet.png");  
        getImageDimensions();
    }

public void move() {
    
        //x += BulletSpeedx;
        y += BulletSpeedy;
        //if (x > BOARD_WIDTH) {
        //    vis = false;
        //}
        if (y > BOARD_Length) {
            vis = false;
        }
    }
}