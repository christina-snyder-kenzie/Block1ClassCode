package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class FirstComponent extends JComponent {
    public void paintComponent(Graphics g){
        g.drawLine(10, 10, 200, 200);

        Rectangle rect = new Rectangle(200, 200, 300, 100);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE);
        g2.fill(rect);
        g2.setColor(Color.MAGENTA);
        g2.setStroke(new BasicStroke(5));
        g2.draw(rect);

        Ellipse2D.Double oval = new Ellipse2D.Double(200,200,300,100);
        g2.draw(oval);
        for (int i = 0; i < 20; i++) {
            rect.translate(10, 10);
            g2.draw(rect);
        }
    }
}
