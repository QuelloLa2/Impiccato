package Gioco.PaginaRegole;

import Gioco.*;

public class Regole {

    public Regole( Frame frame) {

        String Rules = "<html>" +
                        "<head>" +
                        "<style>" +
                        "body {" +
                        "    line-height: 1;" +
                        "}" +
                        "ul {" +
                        "    padding-left: 0;" +
                        "    list-style-position: inside;" +
                        "    font-size: 16px;" +
                        "}" +
                        "</style>" +
                        "</head>" +
                        "<body>" +
                        "<h1>1. Obiettivo: Indovina la parola nascosta prima di finire gli errori!</h1>" +
                        "<h1>2. Come si gioca: Inserisci una lettera alla volta:</h1>" +
                        "<ul>" +
                        "<li><b>Corretta:</b> appare nella parola</li>" +
                        "<li><b>Sbagliata:</b> aggiunge una parte del disegno</li>" +
                        "</ul>" +
                        "<h1>3. Vittoria e Sconfitta:</h1>" +
                        "<ul>" +
                        "<li><b>Vittoria:</b> Completa la parola in tempo</li>" +
                        "<li><b>Sconfitta:</b> Completa il disegno dell’impiccato</li>" +
                        "</ul>" +
                        "<h1>4. Difficoltà: Scegli tra parole di diversa lunghezza</h1>" +
                        "</body>" +
                        "</html>";


        Panel panel = new Panel(frame);
        panel.add(new Label(Rules).List());
        panel.add(new Label("Regole").Title(panel));
        panel.add(new Button("←").backButton(panel, frame));

    }

}
