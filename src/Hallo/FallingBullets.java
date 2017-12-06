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
public class FallingBullets extends Sprite{
    
    private final int BOARD_Length = 700;
    private final int BOARD_WIDTH = 2000;
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
        y += BulletSpeedy;
        if (y > BOARD_Length) {
            vis = false;
        }
    }
}