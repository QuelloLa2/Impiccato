package Gioco.Utilitis;

import Gioco.Panel;

import javax.swing.*;
import java.awt.*;

public class FiguraImpiccato extends JPanel {

    private int errori;

    public FiguraImpiccato(int errori) {
        this.errori = errori;
        setPreferredSize(new Dimension(470, 560));  // Imposta le dimensioni per il pannello
    }

    private void drawImpiccato(Graphics g, int x, int y, int errori) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);

        float spessore = 3.0f;
        g2d.setStroke(new BasicStroke(spessore));

        int baseWidth = 175;
        int poleHeight = 400;
        int poleX = x + baseWidth / 2;
        int beamX = poleX + 120;

        g2d.drawLine(x, y + poleHeight, x + baseWidth, y + poleHeight); // Base
        if (errori >= 1) g2d.drawLine(poleX, y + poleHeight, poleX, y); // Palo
        if (errori >= 2) g2d.drawLine(poleX, y, beamX, y); // Trave
        if (errori >= 3) g2d.drawLine(beamX, y, beamX, y + 30); // Corda

        int headY = y + 30;
        int bodyTop = headY + 50;
        int bodyBottom = bodyTop + 100;

        if (errori >= 4) g2d.drawOval(beamX - 25, headY, 50, 50); // Testa
        if (errori >= 5) g2d.drawLine(beamX, bodyTop, beamX, bodyBottom); // Corpo
        if (errori >= 6) g2d.drawLine(beamX, bodyBottom, beamX - 30, bodyBottom + 50); // Gamba sinistra
        if (errori >= 7) g2d.drawLine(beamX, bodyBottom, beamX + 30, bodyBottom + 50); // Gamba destra
        if (errori >= 8) g2d.drawLine(beamX, bodyTop + 25, beamX - 30, bodyTop + 50); // Braccio sinistro
        if (errori >= 9) g2d.drawLine(beamX, bodyTop + 25, beamX + 30, bodyTop + 50); // Braccio destro
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Posizione per centrare la figura (questo permette di adattarla al pannello)
        int xPos = (getWidth() - 300) / 2;
        int yPos = (getHeight() - 400) / 2;
        drawImpiccato(g, xPos, yPos, errori);
    }

    public static FiguraImpiccato Impiccato(Panel panel, int errori) {
        FiguraImpiccato figura = new FiguraImpiccato(errori);
        // Setto bounds corretti per la figura (la posizione e la dimensione della figura stessa)
        figura.setBounds((panel.getxPanel())/2, 0, 470, 560);  // Modifica questa parte se vuoi cambiare la posizione nel pannello
        return figura;
    }
}
