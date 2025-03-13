package Gioco.PaginaInizio;

import Gioco.Utilitis.CustomFont;

import javax.swing.*;
import Gioco.Panel;

public class Label extends JLabel {

    public Label(String text) {
        super(text);
        setVisible(true);
    }

    public Label Title(Panel panel) {
        int xLabel = panel.getxPanel();
        int yLabel = 70;
        setBounds(0, 100, xLabel, yLabel);
        CustomFont.setBold(this, 70);
        setHorizontalAlignment(JLabel.CENTER);
        return this;
    }

    public Label subTitle(Panel panel) {
        int xLabel = panel.getxPanel();
        int yLabel = 70;
        setBounds(0, 100, xLabel, yLabel);
        CustomFont.setBold(this, 60);
        setHorizontalAlignment(JLabel.CENTER);
        return this;
    }
}
