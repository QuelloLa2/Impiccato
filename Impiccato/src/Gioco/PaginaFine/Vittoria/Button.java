package Gioco.PaginaFine.Vittoria;

import Gioco.Frame;
import Gioco.PaginaInizio.Inizio;
import Gioco.Panel;
import Gioco.Utilitis.CustomFont;
import Gioco.Utilitis.RoundButton;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    public static int xButton = 300;
    public static int yButton = 60;

    public Button(String text) {
        super(text);
        CustomFont.setBold(this,30);
        setVisible(true);
    }

    public Button exitButton(Panel panel) {
        setBounds(((panel.getxPanel())/2)+30,400,xButton,yButton);
        setMargin(new Insets(0,0,0,0));
        RoundButton.createRoundedButton(this, 25, new Color(180,40,40));
        setForeground(Color.white);
        addActionListener(_ -> System.exit(0));

        return this;
    }

    public Button menuButton(Panel panel, Frame frame) {
        setBounds(((panel.getxPanel())/2)-30-xButton,400,xButton,yButton);
        setMargin(new Insets(0,0,0,0));
        RoundButton.createRoundedButton(this, 25, new Color(180,40,40));
        setForeground(Color.white);

        addActionListener(_ ->{
            panel.setVisible(false);
            new Inizio(frame);
        });

        return this;
    }
}
