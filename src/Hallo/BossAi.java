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
    public int hit = 0;
    public int hp = 9001;
    Random rng = new Random();
    private int rngesus = rng.nextInt(100);
    
    public BossAi(int x, int y) {
        super(x, y);
        
        initBoss();
    }
   
   private void initBoss() {
        
        loadImage("Final_Boss.png");  
        getImageDimensions();
    }
   
    public void ishehit(){
        hit = 1;
    }
    public void hebehit()
    {
    if (hit == 1)
        {
        hp = hp-1;
        hit = 0;
        }
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
        if (hp <= 0){
            //he dead, return something so you can go to credits
            
        }
    }
}