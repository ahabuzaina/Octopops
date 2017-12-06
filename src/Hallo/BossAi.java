/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hallo;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Student
 */
public class BossAi extends Sprite{
    Timer timer;
    private ArrayList Bullets1;
    private int hp = 75;
    Random rng = new Random();
    private int rngesus = rng.nextInt(100);
    private int rngesus1 = rng.nextInt(1101);
    private int y = 0;
    
    class RemindTask extends TimerTask {
        @Override
        public void run() {
            if (hp >= 1) {
            for (int n = 0; n < 20; n++){
            rngesus = rng.nextInt(100);
                Bullets1.add(new FallingBullets(x,y));
            }
            x = rng.nextInt(1101);
            } else {
                timer.cancel();
            }
        }
    }
    public BossAi(int x, int y) {
        super(x, y);
        
        initBoss();
    }
   
   private void initBoss() {
        Bullets1 = new ArrayList();
        loadImage("Final_Boss.png");  
        getImageDimensions();
        setVisible(true);
    }
   
    public void ishehit(){
        hp = hp - 1;
    }
    
    public int hp(){
    return hp;
    }
    
    public ArrayList getBullets() {
        return Bullets1;
}

    public void pewpew(){
        timer = new Timer();
        timer.schedule(new RemindTask(), 0, 1500);
        }
}
