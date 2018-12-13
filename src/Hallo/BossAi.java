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
    private ArrayList<FallingBullets> Bullets1;
    private int hp = 500;
    Random rng = new Random();
    private int y = 0;
    
    class RemindTask extends TimerTask {
        @Override
        public void run() {
            if (hp >= 1) {
            for (int n = 0; n < 1; n++){
                x = rng.nextInt(1400);
                ArrayList<Integer> track = new ArrayList<>();
                if(track.contains(x) == false) {
                    System.currentTimeMillis();
                	Bullets1.add(new FallingBullets(x,y));
                }
                else
                	track.add(x);
                
//                for (int i = 0; i < start; i++)
//                	if (i % 1000 == 0)
                
            }
            } 
            else {
                timer.cancel();
            }
        }
    }
    public BossAi(int x, int y) {
        super(x, y);
        
        initBoss();
    }
   
   private void initBoss() {
        Bullets1 = new ArrayList<FallingBullets>();
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
    
    public ArrayList<FallingBullets> getBullets() {
    	return Bullets1;
}

    public void pewpew(){
        timer = new Timer();
        timer.schedule(new RemindTask(), 0, 140);
        }
    
}
