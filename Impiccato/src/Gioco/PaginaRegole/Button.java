package Gioco.PaginaRegole;

import Gioco.PaginaInizio.Inizio;
import Gioco.Panel;
import Gioco.Frame;
import Gioco.Utilitis.CustomFont;
import Gioco.Utilitis.RoundButton;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    public Button(String text) {
        super(text);
        setVisible(true);
    }

    public Button backButton(Panel panel, Frame frame) {
        int xButton = 40;
        int yButton = 40;
        CustomFont.setBold(this,20);
        setBounds(10, 10, xButton, yButton);
        setMargin(new Insets(0,0,0,0));
        RoundButton.createRoundedButton(this, 25, new Color(180,40,40));
                this.setForeground(Color.WHITE);
        addActionListener(_ -> {
            panel.setVisible(false);
            new Inizio(frame);
        });
        
        return this;
    }

}
