package grupoMusical;

public class Bajo extends Instrumento {
    public Bajo() { super("Bajo"); }

    @Override
    public String ejecutar() {
        // Añadimos el nombre del instrumento al mensaje
        return "Tocando Bajo: Escala base en " + notaAfinacion;
    }
}