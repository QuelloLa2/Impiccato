package Gioco.PaginaRegole;

import Gioco.Panel;
import Gioco.Utilitis.CustomFont;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    public Label(String text) {
        super(text);
    }

    public Label List(){
        setSize(910, 430);
        setLocation(50, 100);
        CustomFont.setPlain(this, 0);
        setHorizontalAlignment(SwingConstants.LEFT);
        setVerticalAlignment(SwingConstants.TOP);
        return this;
    }

    public Label Title(Panel panel){
        int xLabel = 200;
        int yLabel = 60;
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.TOP);
        setBounds((panel.getxPanel()-xLabel)/2, 20,xLabel, yLabel);
        CustomFont.setBold(this, 45);
        return this;
    }

}
