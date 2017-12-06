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
    private ArrayList Bullets;
    private int hp = 9001;
    Random rng = new Random();
    private int rngesus = rng.nextInt(100);
    private final int rngesus1 = rng.nextInt(1201);
    private int x = rngesus1;
    private int y = 0;
    class RemindTask extends TimerTask {
        public void run() {
            if (hp >= 1) {
            for (int n = 0; n < 100; n++){
            rngesus = rng.nextInt(100);
            
            if (rngesus > 66){
                Bullets.add(new FallingBullets(x,y));
            }
            if (rngesus > 33 && rngesus <= 66){
                Bullets.add(new FallingBullets(x,y));
            }
            if (rngesus <= 33){
                Bullets.add(new FallingBullets(x,y));
            }
            }
            x = rng.nextInt(1201);
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
        Bullets = new ArrayList();
        loadImage("Final_Boss.png");  
        getImageDimensions();
        setVisible(true);
    }
   
    public void ishehit(){
        hp = hp - 420;
    }
    
    public int hp(){
    return hp;
    }
    
    public ArrayList getBullets() {
        return Bullets;
}

    public void pewpew(){
        timer = new Timer();
        timer.schedule(new RemindTask(), 0, 1000);
        }
}
