/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hallo;

import java.util.Random;

/**
 *
 * @author Student
 */
public class FallingBullets extends Sprite{
    
    private final int BOARD_Length = 700;
    int BulletSpeedy = 2;
    int BulletSpeedx = -1;
    int checkPower;
    ArrayQueue<Integer> randomQueue = new ArrayQueue<>();
    
    public FallingBullets(int x, int y) {
   	 
    super(x, y);
    
	Random rand = new Random();
	int randInt = rand.nextInt(4);
	randomQueue.enqueue(randInt);
    initFallingBullet();
    
    }
    
private void initFallingBullet() {
	 int bulletType = randomQueue.dequeue();
	 if (bulletType == 1) {
		 loadImage("fallingbullet2.png");
		 checkPower = 2;
	 } else if (bulletType == 2) {
		 loadImage("fallingbullet3.png");
		 checkPower = 3;
	 } else {
		 loadImage("fallingbullet.png");
		 checkPower = 1;
	 }
        getImageDimensions();
    }

public int getPower() {
	return checkPower;
}

public void move() {
        y += BulletSpeedy;
        x += BulletSpeedx;
        if (y > BOARD_Length) {
            vis = false;
        }
    }

}