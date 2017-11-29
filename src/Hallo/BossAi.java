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
public class BossAi {
    public int hit = 0;
    public int hp = 600;
    Random rng = new Random();
    private int rngesus = rng.nextInt(100);
    public void ishehit(){
        
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
        if (hp >= 300){
            //normal shite
            if (rngesus > 66){
                
            }
            if (rngesus > 33 && rngesus <= 66){
                
            }
            if (rngesus <= 33){
                
            }
            
        }
        if (hp < 300 && hp > 0){
            //his enraged mode
            if (rngesus > 66){
                
            }
            if (rngesus > 33 && rngesus <= 66){
                
            }
            if (rngesus <= 33){
                
            }
        }
        if (hp == 0){
            //he dead, return something so you can go to credits
            
        }
    }
}
