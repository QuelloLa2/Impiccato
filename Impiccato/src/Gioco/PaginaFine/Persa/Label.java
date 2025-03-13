package Gioco.PaginaFine.Persa;

import Gioco.Panel;
import Gioco.Utilitis.CustomFont;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
    public Label(String text) {
        super(text);
        setVisible(true);
    }

    public Label title(Panel panel) {
        int xLabel = 600;
        int yLabel = 340;
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.TOP);
        setBounds((panel.getxPanel()-xLabel)/2, 100,xLabel, yLabel);
        CustomFont.setBold(this, 62);
        return this;
    }

    public Label subtitle(Panel panel) {
        int xLabel = 600;
        int yLabel = 340;
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.TOP);
        setBounds((panel.getxPanel()-xLabel)/2, 200,xLabel, yLabel);
        CustomFont.setItalic(this, 15);
        setForeground(new Color(76, 76, 76));
        return this;
    }

    public Label guess(Panel panel) {
        int xLabel = 600;
        int yLabel = 340;
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.TOP);
        setBounds((panel.getxPanel()-xLabel)/2, 275,xLabel, yLabel);
        CustomFont.setItalic(this, 20);
        setForeground(new Color(76, 76, 76));
        return this;
    }

}
