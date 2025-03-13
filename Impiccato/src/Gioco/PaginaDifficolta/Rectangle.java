package Gioco.PaginaDifficolta;

import Gioco.Panel;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends JPanel {

    private final int width;
    private final int height;
    private final Color color;

    public Rectangle(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getxBox(){
        return width;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(0, 0, width, height);
    }

    public static Rectangle BoxRectangle(Panel panel) {
        Rectangle rectangle = new Rectangle(500,220, new Color(217,217,217));
        rectangle.setBounds((panel.getxPanel()-rectangle.width)/2,(panel.getyPanel()-rectangle.height)/2,rectangle.width,rectangle.height);
        return rectangle;
    }

    public static Rectangle ChooseRectangle(Panel panel) {
        Rectangle rectangle = new Rectangle(140,100, new Color(101,101,101, 102));
        rectangle.setBounds((panel.getxPanel()-rectangle.width)/2,(panel.getyPanel()-rectangle.height)/2,rectangle.width,rectangle.height);
        return rectangle;
    }

}