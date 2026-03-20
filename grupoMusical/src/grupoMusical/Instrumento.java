package grupoMusical;

import java.util.Random;

public abstract class Instrumento {
    protected String nombre;
    protected String notaAfinacion;
    protected int tempo; //tempo BPM de metronomo

    public Instrumento(String nombre) {
        this.nombre = nombre;
    }

    public void preparar(int bpm) {
        this.tempo = bpm;
        String[] notas = {"Do", "Re", "Mi", "Fa", "Sol", "La", "Si"};
        this.notaAfinacion = notas[new Random().nextInt(notas.length)];
    }

    public abstract String ejecutar();

    public String getMetronomo() {
        return "[Metronomo: " + tempo + " BPM]";
    }
}