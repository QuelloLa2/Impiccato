package Gioco.PaginaInizio;

import Gioco.PaginaDifficolta.Difficolta;
import Gioco.PaginaStatistiche.Statistica;
import Gioco.Utilitis.CustomFont;
import Gioco.PaginaRegole.Regole;
import Gioco.Panel;
import Gioco.Frame;
import Gioco.Utilitis.RoundButton;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {



    public Button(String text) {
        super(text);
        setVisible(true);
    }

    public Button playButton(Panel panel, Frame frame) {
        int xButton = 400;
        int yButton = 80;
        CustomFont.setBold(this,45);
        this.setForeground(Color.WHITE);
        setBounds((panel.getxPanel()-xButton)/2,(panel.getyPanel()-yButton)/2+25,xButton,yButton);
        RoundButton.createRoundedButton(this, 25, new Color(180,40,40));
        addActionListener(_ -> {
            panel.setVisible(false);
            new Difficolta(frame);
        });

        return this;
    }

    public Button statsButton(Panel panel, Frame frame) {
        int xButton = 300;
        int yButton = 60;
        CustomFont.setBold(this,25);
        this.setForeground(Color.WHITE);
        setBounds((panel.getxPanel()-xButton)/2,(panel.getyPanel()-yButton)/2+125,xButton,yButton);
        RoundButton.createRoundedButton(this, 25, new Color(180,40,40));
        addActionListener(_ -> {
            panel.setVisible(false);
            new Statistica(frame);
        });

        return this;
    }

    public Button exitButton(Panel panel) {
        int xButton = 40;
        int yButton = 40;
        CustomFont.setBold(this,20);
        setBounds(panel.getxPanel()-10-xButton,10,xButton,yButton);
        setMargin(new Insets(0,0,0,0));
        this.setForeground(Color.WHITE);
        RoundButton.createRoundedButton(this, 40, new Color(180,40,40));
        addActionListener(_ -> System.exit(0));

        return this;
    }

    public Button rulesButton(Panel panel, Frame frame) {
         int xButton = 40;
         int yButton = 40;
        CustomFont.setBold(this,20);
        setBounds(panel.getxPanel()-10-xButton, panel.getyPanel()-10-yButton, xButton, yButton);
        setMargin(new Insets(0,0,0,0));
        this.setForeground(Color.WHITE);
        RoundButton.createRoundedButton(this, 40, new Color(80,80,80));
        addActionListener(_ -> {
            panel.setVisible(false);
            new Regole(frame);
        });
        return this;
    }
}
