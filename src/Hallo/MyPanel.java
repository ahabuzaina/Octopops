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
public class MyPanel extends JPanel {
    

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gameeeee");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        frame.add(panel);
        frame.pack();
        frame.setSize(600,600);
        frame.setVisible(true);
    }
}