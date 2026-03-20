package grupoMusical;

import java.util.*;

public class Grupo {
    private String nombre;
    private List<Musico> musicos;

    public Grupo(String nombre, List<Musico> musicos) {
        this.nombre = nombre;
        this.musicos = musicos;
    }

    public void iniciarPresentacion() {
        Random random = new Random();
        //se deja como BPM minimo del metronomo de 80 y se da la posibilidad de sumarle numeros de 0 a 60 para randomizar eso tambien
        int bpmGlobal = 80 + random.nextInt(60); 
        
        System.out.println("LOG: GRUPO " + nombre + " | TEMPO: " + bpmGlobal + " BPM");

        for (Musico m : musicos) {
            Instrumento inst;
            // Genera un número entre 0 y 3 para elegir que instrumeto toca aleatoriamente
            switch (random.nextInt(4)) {
                case 0: inst = new Guitarra(); break;
                case 1: inst = new Bajo(); break;
                case 2: inst = new Bateria(); break;
                case 3: inst = new Piano(); break; 
                default: inst = new Guitarra(); break;
            }
            m.realizarAccion(inst, bpmGlobal);
        }
    }
}