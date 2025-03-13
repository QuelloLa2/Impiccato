package Gioco.PaginaGioco;

import Gioco.Panel;
import Gioco.Utilitis.CustomFont;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    public Label(String text) {
        super(text);
    }

    public Label Guess(Panel panel) {
        int xLabel = 500;
        int yLabel = 70;
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
        CustomFont.setBold(this, 70);
        setBounds(20, (panel.getyPanel()-yLabel)/2, xLabel, yLabel);
        return this;
    }

    public Label attempts(Panel panel) {
        int xLabel = 500;
        int yLabel = 70;
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
        CustomFont.setBold(this, 30);
        setBounds(20, 40, xLabel, yLabel);
        return this;
    }

    public Label errore_lettera(Panel panel) {
        int xLabel = 500;
        int yLabel = 70;
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
        CustomFont.setBold(this, 30);
        setBounds(20, (panel.getyPanel()-yLabel)/2-100, xLabel, yLabel);
        setForeground(new Color(180,40,40));
        setVisible(false);
        return this;
    }

}
