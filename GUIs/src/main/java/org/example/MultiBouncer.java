package org.example;

import javax.swing.*;
import java.awt.*;

public class MultiBouncer extends JComponent {
    private BouncingDude[] chaos;

    public MultiBouncer(){
        chaos = new BouncingDude[5];
        for (int i =0 ; i < 5; i++){
            chaos[i] = new BouncingDude();
        }
    }

    //move them all
    public void moveAll(){
        for (BouncingDude dude : chaos){
            dude.move();
        }
    }

    //draw them all
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        for (BouncingDude dude : chaos){
            dude.draw(g2);
        }
    }

    class BouncingDude {
        private Rectangle bouncer;
        private int dx, dy;
        private Color outline, insides;

        public BouncingDude (){
            bouncer = new Rectangle(100, 100, 100, 200);
            //dx = -5;
            //dy = 5;
            //dx and dy a random number -10 to 10
            dx = (int) (Math.random() * 20 - 10);
            dy = (int) (Math.random() * 20 - 10);
            insides = new Color(101, 11, 161, 50);
            outline = new Color(101, 11, 161, 255);
        }

        public void move(){
            bouncer.translate(dx, dy);
            if (bouncer.getX() <= 0){
                dx = -dx;
                changeColor();
            }
            if (bouncer.getY() <= 0){
                dy = -dy;
                changeColor();
            }
            double bottom = bouncer.getY() + bouncer.getHeight();
            if (bottom >= AnimatedFrame.HEIGHT){
                dy = -dy;
                changeColor();
            }
            double rightSide = bouncer.getX() + bouncer.getWidth();
            if (rightSide >= AnimatedFrame.WIDTH){
                dx = -dx;
                changeColor();
            }
        }

        public void changeColor(){
            //update insides and outline
            //RGB (Red, Green, Blue)
            //0 -> 255
            //GREEN? (0, 255, 0)
            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);

            insides = new Color(red, green, blue, 50);
            outline = new Color(red, green, blue, 255);

            //reitialize the bouncer with a new height/width @ the current location
            int minSize = 50;
            int maxSize = 350;
            int newWidth = (int) (Math.random() * (maxSize - minSize + 1) + minSize);
            if (newWidth > bouncer.getWidth()){

            }
        }

        public void draw(Graphics2D g2){
            //Color c = new Color(101, 11, 161, 50);
            g2.setColor(insides);
            g2.fill(bouncer);
            //c = new Color(101, 11, 161, 255);
            g2.setColor(outline);
            g2.draw(bouncer);
        }

    }

}
