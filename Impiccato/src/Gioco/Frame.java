package Gioco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {

    private static final int xFrame = 960;
    private static final int yFrame = 540;
    private Point initialClick;

    public Frame() {
        setSize(xFrame, yFrame);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(new Color(224, 224, 244));
        setResizable(false);
        setUndecorated(true);
        setVisible(true);

        // Aggiungi il trascinamento
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                getComponentAt(initialClick);
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                int thisX = getLocation().x;
                int thisY = getLocation().y;
                int xMoved = e.getX() - initialClick.x;
                int yMoved = e.getY() - initialClick.y;
                setLocation(thisX + xMoved, thisY + yMoved);
            }
        });
    }

    public static int getxFrame() {
        return xFrame;
    }

    public static int getyFrame() {
        return yFrame;
    }
}
