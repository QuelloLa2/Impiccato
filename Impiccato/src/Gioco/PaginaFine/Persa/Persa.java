package Gioco.PaginaFine.Persa;

import Gioco.Frame;
import Gioco.Panel;

public class Persa {

    public Persa(Frame frame, String parola){
        Panel panel = new Panel(frame);

        panel.add(new Label("Hai Perso").title(panel));
        panel.add(new Label("You lost Aura").subtitle(panel));
        panel.add(new Label("La parole era: " + parola).guess(panel));
        panel.add(new Button("Main menu").menuButton(panel, frame));
        panel.add(new Button("Exit").exitButton(panel));

    }
}
