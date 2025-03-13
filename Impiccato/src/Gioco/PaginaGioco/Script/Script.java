 package Gioco.PaginaGioco.Script;

import java.util.ArrayList;
import java.util.Arrays;

 public class Script {

    // Metodo per il controllo delle posizione della lettera selezionata
    public static ArrayList<Integer> controllLetterPositions(String parola, char lettera) {
        ArrayList<Integer> posizioni = new ArrayList<>();
        for (int i = 0; i < parola.length(); i++) {
            if(Character.toLowerCase(parola.charAt(i)) == Character.toLowerCase(lettera)) {
                posizioni.add(i);
            }
        }
        return posizioni;
    }

    // Metodo per la selezione randomica della parola
    public static String getRandomWord(Parole lista, int lettere) {
        ArrayList<Parole> elenco = getLevelWord(lista, lettere);
        int posizione = (int)Math.floor(Math.random() * elenco.size());
        return elenco.get(posizione).getNome();
    }

    // Metodo per selezionare solo le lettere di una certa lunghezza
    public static ArrayList<Parole> getLevelWord(Parole lista, int lettere){
        ArrayList<Parole> selezionate = new ArrayList<>();
        for(int i = 0; i < lista.getSize(); i++){
            if (lista.getParole(i).getN_lettere() == lettere){
                selezionate.add(lista.getParole(i));
            }
        }
        return selezionate;
    }

    // Metodo per controllare se all'interno della parola c'è il carattere ' _ ' per la guess
    public static boolean controllArraySpace(String word){
        return word.contains("_");
    }

    // Metodo per creare una String con il carattere ' _ ' per la guess
    public static String createWord(int numero){
        char[] word = new char[numero];
        Arrays.fill(word, '_');
        return new String(word);
    }

    // Metodo per cambiare le posizioni delle lettere nella giusta posizione
     public static Parole WordGuess(String word, String parola, char lettera) {
         StringBuilder modifiedWord = new StringBuilder(word);
         ArrayList<Integer> positions= controllLetterPositions(parola, lettera);
         if(positions.isEmpty()){
             return null;
         }
         for (Integer i : positions) {
             modifiedWord.setCharAt(i, lettera);
         }
         return new Parole(modifiedWord.toString(), 1);
     }


}