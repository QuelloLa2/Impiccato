package Gioco.PaginaGioco;

import Gioco.Frame;
import Gioco.PaginaFine.Persa.Persa;
import Gioco.PaginaFine.Vittoria.Vittoria;
import Gioco.PaginaGioco.Script.*;
import Gioco.Panel;
import Gioco.Utilitis.FiguraImpiccato;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Play {

    protected String parola_selezionata;
    protected Parole parola_guess;
    protected int errori = 0;
    protected Panel panel;
    protected Label parola;
    protected FiguraImpiccato figura;
    protected Label attemps;
    protected ArrayList<Character> lettere_inserite;
    protected Label errore_lettera;
    protected Label doppia_lettera;
    protected Statistiche statistiche;

    public Play(Frame frame, int n_lettere) {
        this.panel = new Panel(frame);

        Parole dizionario = new Parole();
        this.parola_selezionata = Script.getRandomWord(dizionario, n_lettere);
        System.out.println(parola_selezionata);
        this.parola_guess = new Parole(Script.createWord(parola_selezionata.length()), 1);

        this.lettere_inserite = new ArrayList<>();
        statistiche = Statistiche.Loading();

        setupLabels();
        setupFigura();
        setupParola();

        panel.setFocusable(true);
        panel.addKeyListener(getLetter(frame));
        panel.requestFocusInWindow();
    }

    private void setupLabels() {
        this.errore_lettera = new Label("Lettera non Presente").errore_lettera(panel);
        panel.add(errore_lettera);

        this.doppia_lettera = new Label("Lettera Già inserita").errore_lettera(panel);
        panel.add(doppia_lettera);

        this.attemps = new Label("Tentativi: " + errori).attempts(panel);
        panel.add(attemps);
    }

    private void setupFigura() {
        this.figura = FiguraImpiccato.Impiccato(panel, this.errori);
        panel.add(figura);
    }

    private void setupParola() {
        this.parola = new Label(formatWordWithSpaces(parola_guess.getNome())).Guess(panel);
        panel.add(parola);
    }

    private KeyAdapter getLetter(Frame frame) {
        return new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char letter = e.getKeyChar();
                if (Character.isLetter(letter)) {
                    handleLetterInput(letter, frame);
                }
            }
        };
    }

    private void handleLetterInput(char letter, Frame frame) {
        if (!lettere_inserite.contains(Character.toLowerCase(letter))) {
            lettere_inserite.add(Character.toLowerCase(letter));

            Parole updateword = Script.WordGuess(parola_guess.getNome(), parola_selezionata, letter);
            if (updateword != null) {
                parola_guess = updateword;
                parola.setText(formatWordWithSpaces(parola_guess.getNome().toUpperCase()));
                doppia_lettera.setVisible(false);
                errore_lettera.setVisible(false);
            } else {
                handleWrongGuess();
            }
        } else {
            errore_lettera.setVisible(false);
            doppia_lettera.setVisible(true);
        }
        checkGameStatus(frame);
    }

    private void handleWrongGuess() {
        errori++;
        panel.remove(attemps);
        attemps = new Label("Tentativi: " + errori).attempts(panel);
        panel.add(attemps);

        panel.remove(figura);
        figura = FiguraImpiccato.Impiccato(panel, errori);
        panel.add(figura);

        doppia_lettera.setVisible(false);
        errore_lettera.setVisible(true);

        panel.revalidate();
        panel.repaint();
    }

    private void checkGameStatus(Frame frame) {
        if (errori >= 9) {
            panel.setVisible(false);
            statistiche.setSconfitte();
            statistiche.Saving();
            new Persa(frame, parola_selezionata);
        } else if (!Script.controllArraySpace(parola_guess.getNome()) && errori < 9) {
            panel.setVisible(false);
            statistiche.setVittorie();
            statistiche.setTentativi(errori);
            statistiche.Saving();
            new Vittoria(frame, errori);
        }
    }

    private String formatWordWithSpaces(String word) {
        return String.join(" ", word.split(""));
    }
}
