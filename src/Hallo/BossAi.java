/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hallo;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Timer;

/**
 *
 * @author Student
 */
public class BossAi extends Sprite{
    private ArrayList Bullets1;
    private int hp = 9001;
    Random rng = new Random();
    private int rngesus = rng.nextInt(100);
    private int rngesus1 = rng.nextInt(1101);
    private int y = 0;
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
        hp = hp - 420;
    }
    
    public int hp(){
    return hp;
    }
    
    public ArrayList getBullets() {
        return Bullets1;
}

    public void pewpew(){
Bullets1.add(new FallingBullets(x - rngesus1,y));
        }
        }
    