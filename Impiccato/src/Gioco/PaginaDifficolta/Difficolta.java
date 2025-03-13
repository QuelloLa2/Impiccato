package Gioco.PaginaDifficolta;

import Gioco.*;

public class Difficolta {

    public Difficolta(Frame frame) {

        Panel panel = new Panel(frame);
        Rectangle box = Rectangle.BoxRectangle(panel);
        Rectangle choose = Rectangle.ChooseRectangle(panel);
        Label numeri = new Label("4").n_letter(panel);

        panel.setLayout(null);

        panel.add(new Label("Seleziona Numero di Lettere").title(panel));

        panel.add(new Button("←").backButton(panel, frame));
        panel.add(new Button("+").plusButton(choose, panel, numeri));
        panel.add(new Button("-").minusButton(box, panel, numeri));
        panel.add(new Button("Start").playButton(panel, frame, numeri));

        panel.add(numeri);
        panel.add(choose);
        panel.add(box);

    }
}

