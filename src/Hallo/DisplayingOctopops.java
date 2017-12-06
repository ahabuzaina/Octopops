/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hallo;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.ArrayList;
import java.awt.Rectangle;
import java.awt.Dimension;
/**
 *
 * @author Student
 */
public class DisplayingOctopops extends JPanel implements ActionListener {

    private Octopops Octopops;
    private BossAi BossAi;
    private Timer timer;
    private final int DELAY = 10;
    private int octo_X = 50;
    private int octo_Y = 500;
    private final int boss_X = 1220;
    private final int boss_Y = 500;
    private final int B_WIDTH = 900;
    private final int B_HEIGHT = 300;
    private ArrayList Bullets1;
    public DisplayingOctopops() {
        
        character();
        timer = new Timer(DELAY, this);
        timer.start();
        
    }

    private void character() {
    Bullets1 = new ArrayList();
        addKeyListener(new Adapter());
        setFocusable(true);
        setBackground(Color.WHITE);
        Octopops = new Octopops(octo_X, octo_Y);
        BossAi = new BossAi(boss_X, boss_Y);
        BossAi.setVisible(true);
        for(int i = 0; i < 10;i++){
        BossAi.pewpew();
        }
    }

    @Override

    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        doDrawing(g);

        if(BossAi.hp() <= 0)
        {
        drawGameOver(g);
        }
        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        if (Octopops.isVisible()) {
            g2d.drawImage(Octopops.getImage(), Octopops.getX(), 500, this);
            }
        
        if (BossAi.isVisible()) {
            g2d.drawImage(BossAi.getImage(), 1100, 400, this);
            }else{
        }
        
        ArrayList ms = Octopops.getBullets();
        ArrayList md = BossAi.getBullets();

        
        for (Object m1 : ms) {
            Bullet m = (Bullet) m1;
            g2d.drawImage(m.getImage(), m.getX(),500, this);
    }
        
        for (Object m2 : md) {
            FallingBullets m = (FallingBullets) m2;
            g2d.drawImage(m.getImage(), m.getX(), m.getY(), this);
    }
    }
    
    @Override

    public void actionPerformed(ActionEvent e) {
        updateBullets();
        updateFallingBullets();
        checkCollisions();
        repaint();
        if (Octopops.getX() >= 0 && Octopops.getX() <= 1000)
        {
        updateOctopops();
        repaint();
        }
    }

     private void updateBullets() {

        ArrayList ms = Octopops.getBullets();

        for (int i = 0; i < ms.size(); i++) {

            Bullet m = (Bullet) ms.get(i);

            if (m.isVisible()) {

                m.move();
            } else {

                ms.remove(i);
            }
        }
    }
     private void updateFallingBullets() {
     
         ArrayList md = BossAi.getBullets();

        for (int i = 0; i <md.size(); i++) {

            FallingBullets m = (FallingBullets) md.get(i);
            if (m.isVisible()) {
            m.move();
            } else {
                md.remove(i);
            }
        }
     }
    
     
     private void updateOctopops(){
     if (Octopops.isVisible()) {
                Octopops.move();
            }
     }
     
     private void updateBoss(){
     BossAi.ishehit();
     }
     
      public void checkCollisions() {
    Rectangle r4 = Octopops.getBounds();
    Rectangle r2 = BossAi.getBounds();
    ArrayList<Bullet> ms = Octopops.getBullets();

        for (Bullet m : ms) {

            Rectangle r1 = m.getBounds();

                if (r1.intersects(r2)) {
                    m.setVisible(false);
                    BossAi.ishehit();
                    if (BossAi.hp() <= 0){
                    BossAi.setVisible(false);
                    }
                    }
        }
    ArrayList<FallingBullets> md = BossAi.getBullets();

        for (FallingBullets m6 : md) {

            Rectangle r3 = m6.getBounds();

                if (r4.intersects(r3)) {
                    m6.setVisible(false);
                    Octopops.setVisible(false);
                    }
                    }
            }
      
       private void drawGameOver(Graphics g) {

        String msg = "Game Over";
        Font small = new Font("Helvetica", Font.BOLD, 52);
        FontMetrics fm = getFontMetrics(small);

        g.setColor(Color.BLACK);
        g.setFont(small);
        g.drawString(msg, (B_WIDTH - fm.stringWidth(msg)),
                B_HEIGHT / 2);
    }
      
    private class Adapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            Octopops.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            Octopops.keyPressed(e);
        }
    }
}