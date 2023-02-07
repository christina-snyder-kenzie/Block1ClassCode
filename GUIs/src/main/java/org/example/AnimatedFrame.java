package org.example;

import javax.swing.*;
import java.awt.event.*;

public class AnimatedFrame extends JFrame {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 500;
    private Bouncing comp;
    private Timer t;

    public AnimatedFrame(){
        this.setTitle("Bouncing Rectangle");
        this.setSize(WIDTH, HEIGHT + 27);
        comp = new Bouncing();
        this.add(comp);
        t = new Timer(50, new Animator());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void go(){
        t.start();
    }

    public class Animator implements ActionListener {
        public void actionPerformed(ActionEvent e){
            comp.move();
            comp.repaint();
        }
    }

    public static void main(String[] args){
        System.out.println("Hello! We're in Animated Frame!");
        AnimatedFrame frame = new AnimatedFrame();
        frame.go();
    }
}
