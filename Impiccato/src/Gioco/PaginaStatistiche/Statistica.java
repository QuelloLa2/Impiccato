package Gioco.PaginaStatistiche;

import Gioco.Frame;
import Gioco.PaginaGioco.Script.Statistiche;
import Gioco.Panel;

public class Statistica {

    private final Statistiche statistiche;

    public Statistica(Frame frame) {

        Panel panel = new Panel(frame);

        statistiche = Statistiche.Loading();

        panel.add(new Button("←").backButton(panel,frame));
        panel.add(new Label("Statistiche").Title(panel));
        String parola = (statistiche.getVittorie() == 1) ? "Vittoria" : "Vittorie";
        panel.add(new Label(parola + " : " + statistiche.getVittorie()).Vittoria(panel));
        parola = (statistiche.getSconfitte() == 1) ? "Sconfitta" : "Sconfitte";
        panel.add(new Label(parola  + " : " + statistiche.getSconfitte()).Sconfitte(panel));
        panel.add(new Label(String.format("Media Errori : %.2f", MediaError())).Errori(panel));

    }

    private double MediaError(){
        int[] errori = statistiche.getTentativi();
        int somma_tentativi = 0 , somma_errori = 0;
        for(int i = 0 ; i < errori.length ; i++){
            somma_tentativi += errori[i] * i;
            somma_errori += errori[i];
        }
        if (somma_errori == 0){
            return 0;
        }
        return (double) somma_tentativi / somma_errori;
    }

}
