/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hallo;

import java.awt.Color;
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
/**
 *
 * @author Student
 */
public class DisplayingOctopops extends JPanel implements ActionListener {

    private Octopops Octopops;
    private Timer timer;
    private final int DELAY = 10;
    private final int octo_X = 50;
    private final int octo_Y = 500;
    public DisplayingOctopops() {
        character();
        timer = new Timer(DELAY, this);
        timer.start();
    }

    private void character() {

        addKeyListener(new Adapter());
        setFocusable(true);
        setBackground(Color.WHITE);
        Octopops = new Octopops(octo_X, octo_Y);
    }

    @Override

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(Octopops.getImage(), Octopops.getX(), 500, this);
     ArrayList ms = Octopops.getBullets();

        for (Object m1 : ms) {
            Bullet m = (Bullet) m1;
            g2d.drawImage(m.getImage(), m.getX(),500, this);
    }
    }
    
    @Override

    public void actionPerformed(ActionEvent e) {
        updateBullets();
        repaint();
        if (Octopops.getX() >= 0 && Octopops.getX() <= 1400)
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
     private void updateOctopops(){
     Octopops.move();
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
