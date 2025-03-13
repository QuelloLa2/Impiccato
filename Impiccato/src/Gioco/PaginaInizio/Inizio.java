package Gioco.PaginaInizio;

import Gioco.*;

public class Inizio {


    public Inizio(Frame frame) {

        Panel panel = new Panel(frame);

        panel.add(new Button("Play").playButton(panel, frame));
        panel.add(new Button("X").exitButton(panel));
        panel.add(new Button("?").rulesButton(panel, frame));
        panel.add(new Button("Statistiche").statsButton(panel, frame));

        panel.add(new Label("L' IMPICCATO").Title(panel));
        panel.add(new Label(String.join(" ", "____________".split(""))).subTitle(panel));

        panel.revalidate();
        panel.repaint();

    }

}
