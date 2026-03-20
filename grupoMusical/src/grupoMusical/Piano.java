package grupoMusical;

public class Piano extends Instrumento {

    public Piano() {
        super("Piano");
    }

    @Override
    public String ejecutar() {
        // Retorna una frase técnica acorde al piano agregando la nota usada
        return "Tocando Piano: Arpegio en " + notaAfinacion;
    }
}