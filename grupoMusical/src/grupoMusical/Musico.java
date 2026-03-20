package grupoMusical;

public class Musico {
    private String nombre;

    public Musico(String nombre) { this.nombre = nombre; }

    public void realizarAccion(Instrumento inst, int bpm) {
        inst.preparar(bpm); // Afina y setea el tempo
        System.out.println("Musico: " + nombre + " | " + inst.getMetronomo() + " | " + inst.ejecutar());
    }
}