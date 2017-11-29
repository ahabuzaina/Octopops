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
public class BossAi {
    int hit = 0;
    public int hp = 600;
    public void hebehit()
    {
    if (hit == 1)
        {
        hp = hp-1;
        hit = 0;
        }
    }
}
