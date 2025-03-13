package Gioco.PaginaStatistiche;

import Gioco.Panel;
import Gioco.Utilitis.CustomFont;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    public Label(String text) {
        super(text);
        setVisible(true);
    }

    public Label Title(Panel panel){
        int xLabel = panel.getxPanel();
        int yLabel = 70;
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.TOP);
        setBounds(0, 20,xLabel, yLabel);
        CustomFont.setBold(this, 45);
        return this;
    }

    public Label Vittoria(Panel panel){
        int xLabel = panel.getxPanel();
        int yLabel = 60;
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.TOP);
        setBounds(0, 170, xLabel, yLabel);
        setForeground(new Color(40,180,40));
        CustomFont.setBold(this, 45);
        return this;
    }

    public Label Sconfitte(Panel panel){
        int xLabel = panel.getxPanel();
        int yLabel = 60;
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.TOP);
        setForeground(new Color(180, 40 ,40));
        setBounds(0, 240, xLabel, yLabel);
        CustomFont.setBold(this, 45);
        return this;
    }

    public Label Errori(Panel panel){
        int xLabel = panel.getxPanel();
        int yLabel = 60;
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.TOP);
        setForeground(new Color(40,180,180));
        setBounds(0, 310, xLabel, yLabel);
        CustomFont.setBold(this, 45);
        return this;
    }

}
