package Gioco.PaginaDifficolta;

import Gioco.Panel;
import Gioco.Utilitis.CustomFont;

import javax.swing.*;

public class Label extends JLabel {

    public Label(String text) {
        super(text);
        setVisible(true);
    }

    public Label title(Panel panel) {
        int xLabel = 600;
        int yLabel = 60;
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.TOP);
        setBounds((panel.getxPanel()-xLabel)/2, 50,xLabel, yLabel);
        CustomFont.setBold(this, 37);
        return this;
    }

    public Label n_letter(Panel panel) {
        int xLabel = 140;
        int yLabel = 100;
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
        CustomFont.setBold(this, 45);
        setBounds((panel.getxPanel()-xLabel)/2,(panel.getyPanel()-yLabel)/2,xLabel,yLabel);
        return this;
    }

}
