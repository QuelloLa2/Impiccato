package Gioco.PaginaFine.Vittoria;

import Gioco.*;

public class Vittoria {

    public Vittoria(Frame frame, int errori){
        Panel panel = new Panel(frame);
        panel.add(new Label("Hai vinto").title(panel));
        panel.add(new Label("You gained Aura").subtitle(panel));
        panel.add(new Button("Main menu").menuButton(panel, frame));
        panel.add(new Button("Exit").exitButton(panel));

        if (errori != 0) {
            panel.add(new Label("I tuoi tentativi: " + errori).tries(panel));
        }
    }
}
