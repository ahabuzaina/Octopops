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
/**
 *
 * @author Student
 */
public class DisplayingOctopops extends JPanel implements ActionListener {
    
    private Octopops Octopops;
    private final int DELAY = 10;

    public DisplayingOctopops() {
        character();
    }
    
    private void character() {
        
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.BLACK);

        Octopops = new Octopops();       
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }
    
    private void doDrawing(Graphics g) {
    
    Graphics2D g2d = (Graphics2D) g;
    g2d.drawImage(Octopops.getImage(), Octopops.getX(), Octopops.getY(), this);
    }
     @Override
     
    public void actionPerformed(ActionEvent e) {
        
        Octopops.move();
        repaint();  
    }
    private class TAdapter extends KeyAdapter {

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

