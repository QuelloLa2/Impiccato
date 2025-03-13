package Gioco;

import Gioco.PaginaInizio.Inizio;

public class Main {
    public static void main(String[] args) {

        System.setProperty("awt.useSystemAAFontSettings", "on");
        System.setProperty("swing.text", "true");

        Frame frame = new Frame();
        new Inizio(frame);
    }
}