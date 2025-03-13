package Gioco.PaginaGioco.Script;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;

public class Statistiche {

    private static final String homePath = Paths.get(System.getProperty("user.home"), "Documents").toString();
    private static final String filePath = Paths.get(homePath, "statistiche.json").toString();
    private static final File file = new File(filePath);

    private int vittorie;
    private int sconfitte;
    private final int[] tentativi = new int[8];

    // JSON parser
    private static final Gson jsonSave = new GsonBuilder().setPrettyPrinting().create();
    private static final Gson jsonLoad = new Gson();

    // Costruttore standard (se il file non esiste)
    public Statistiche() {
        this.vittorie = 0;
        this.sconfitte = 0;
        Arrays.fill(tentativi, 0);
    }

    // Metodo per salvare le statistiche in JSON
    public void Saving()  {
        try (FileWriter writer = new FileWriter(file)) {
            jsonSave.toJson(this, writer);  // Corretto: salva l'oggetto "this", non il filePath
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Metodo per caricare le statistiche dal file JSON
    public static Statistiche Loading() {
        if (file.exists()) {
            try (FileReader reader = new FileReader(file)) {
                return jsonLoad.fromJson(reader, Statistiche.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new Statistiche();  // Se il file non esiste, restituisci un oggetto nuovo
    }

    // Metodi getter per le statistiche
    public int getVittorie() {
        return vittorie;
    }

    public int getSconfitte() {
        return sconfitte;
    }

    public int[] getTentativi() {
        return tentativi;
    }

    public void setSconfitte() {
        this.sconfitte++;
    }

    public void setVittorie() {
        this.vittorie++;
    }

    public void setTentativi(int posizione) {
        this.tentativi[posizione]++;
    }


}
