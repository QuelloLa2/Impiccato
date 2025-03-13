package Gioco.PaginaGioco.Script;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Parole {
    
    private String nome;
    private int N_lettere;
    private int difficolta;
    private final ArrayList<Parole> dizionario = new ArrayList<>();

    public Parole(String nome, int difficolta) {
        this.nome = nome;
        this.N_lettere = nome.length();
        this.difficolta = difficolta;
    }

    public Parole() {
        try {
            InputStream inputStream = getClass().getResourceAsStream("/Gioco/PaginaGioco/Script/Parole.txt");

            if (inputStream == null) {
                System.err.println("Errore: il file non è stato trovato all'interno del JAR.");
                System.exit(1);
            }

            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() >= 3 && word.length() <= 7) {
                    dizionario.add(new Parole(word, 1)); // Aggiunge la parola al dizionario
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.err.println("Errore durante la lettura del file: " + e.getMessage());
            System.exit(1);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getN_lettere() {
        return N_lettere;
    }

    public int getDifficolta() {
        return difficolta;
    }

    public int getSize(){
        return dizionario.size();
    }

    public Parole getParole(int pos){
        return dizionario.get(pos);
    }

}
