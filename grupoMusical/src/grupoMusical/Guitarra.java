package grupoMusical;

public class Guitarra extends Instrumento {
    public Guitarra() { super("Guitarra"); }

    @Override
    public String ejecutar() {
        // Se anuncia que toca la guitarra
        return "Tocando Guitarra: Acordes en " + notaAfinacion;
    }
}