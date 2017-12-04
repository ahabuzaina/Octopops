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
import java.awt.EventQueue;
import javax.swing.JFrame;

public class MovingSprite extends JFrame {

    public MovingSprite() {

        initUI();
    }

    private void initUI() {

        add(new DisplayingOctopops());

        setSize(1500, 700);
        setResizable(false);

        setTitle("Moving sprite");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override

            public void run() {

                MovingSprite ex = new MovingSprite();
                ex.setVisible(true);
            }
        });
    }
}
