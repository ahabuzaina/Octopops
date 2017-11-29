/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hallo;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
/**
 *
 * @author Student
 */
class MyPanel extends JPanel implements KeyListener {
    private char c = 'e';

    public MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
        addKeyListener(this);
    }


    

    public static void main(String[] s) {
        JFrame f = new JFrame();
        f.getContentPane().add(new MyPanel());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
}