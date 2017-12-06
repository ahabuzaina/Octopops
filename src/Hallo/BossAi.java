/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hallo;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Student
 */
public class BossAi extends Sprite{
    private ArrayList Bullets;
    private int hit;
    private int hp = 9001;
    Random rng = new Random();
    private int rngesus = rng.nextInt(100);
    
    public BossAi(int x, int y) {
        super(x, y);
        
        initBoss();
    }
   
   private void initBoss() {
        
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
        while (hp >= 1){
            if (rngesus > 66){
                Bullets.add(new FallingBullets(rng.nextInt(1201),0,5,13));
            }
            if (rngesus > 33 && rngesus <= 66){
                Bullets.add(new FallingBullets(rng.nextInt(1201),0,3,2));
            }
            if (rngesus <= 33){
                Bullets.add(new FallingBullets(rng.nextInt(1201),0,-4,8));
            }
            rngesus = rng.nextInt(100);
        }
        }
    }
