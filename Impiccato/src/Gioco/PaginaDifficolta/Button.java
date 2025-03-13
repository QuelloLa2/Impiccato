package Gioco.PaginaDifficolta;

import Gioco.PaginaGioco.Play;
import Gioco.PaginaInizio.Inizio;
import Gioco.Frame;
import Gioco.Panel;
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
        setBounds(10,10,xButton,yButton);
        setMargin(new Insets(0,0,0,0));
        RoundButton.createRoundedButton(this, 25, new Color(180,40,40));
        this.setForeground(Color.WHITE);
        addActionListener(_ ->{
            panel.setVisible(false);
            new Inizio(frame);
        });
        
        return this;
    }

    public Button minusButton(Rectangle box, Panel panel, Label numeri) {
        int xButton = 90;
        int yButton = 90;
        CustomFont.setBold(this,50);
        setBounds(box.getBounds().x + 45, (panel.getyPanel() - yButton)/2,xButton,yButton);
        RoundButton.createRoundedButton(this, 25, new Color(180,40,40));
        this.setForeground(Color.WHITE);
        addActionListener(_ ->{
            int numero = Integer.parseInt(numeri.getText());
            if (numero > 3) {
                numero--;
                numeri.setText(String.valueOf(numero));
            }
        });
        return this;
    }

    public Button plusButton(Rectangle choose, Panel panel, Label numeri) {
        int xButton = 85;
        int yButton = 85;
        CustomFont.setBold(this,50);
        setBounds(choose.getBounds().x + choose.getxBox() + 45, (panel.getyPanel() - yButton)/2,xButton,yButton);
        RoundButton.createRoundedButton(this, 25, new Color(80, 180, 90));
        this.setForeground(Color.WHITE);
        addActionListener(_ ->{
            int numero = Integer.parseInt(numeri.getText());
            if (numero < 7) {
                numero++;
                numeri.setText(String.valueOf(numero));
            }
        });
        return this;
    }

    public Button playButton(Panel panel, Frame frame, Label string) {
        int xButton = 300;
        int yButton = 60;
        CustomFont.setBold(this,30);
        setBounds((panel.getxPanel()-xButton)/2,panel.getyPanel()-yButton*2,xButton,yButton);
        RoundButton.createRoundedButton(this, 25, new Color(180,40,40));
        this.setForeground(Color.WHITE);
        addActionListener(_ -> {
            panel.setVisible(false);
            new Play(frame, Integer.parseInt(string.getText()));
        });
        return this;
    }

}
