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
    private int dx;
    public int x;
    public int y;
    private Image image;
    private final int BOARD_Length = 700;
    private final int BOARD_WIDTH = 1500;
    private ArrayList Bullets;
    Random rng = new Random();
    private int rngesus = rng.nextInt(1201);
    public FallingBullets(int x, int y) {
    super(x, 0);
        
        character();
    }
private void character() {
        Bullets = new ArrayList();
        ImageIcon i = new ImageIcon("bullets.png");
        image = i.getImage();
        y = 0;
        x = rngesus;
    }
public void move(int BulletSpeedx, int BulletSpeedy) {
        
        x += BulletSpeedx;
        y += BulletSpeedy;
        if (x > BOARD_WIDTH) {
            vis = false;
        }
    }
}