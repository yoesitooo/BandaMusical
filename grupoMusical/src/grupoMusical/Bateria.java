package grupoMusical;

public class Bateria extends Instrumento {
    public Bateria() { super("Bateria"); }

    @Override
    public void preparar(int bpm) {
        super.preparar(bpm);
        this.notaAfinacion = "Percusion"; 
    }

    @Override
    public String ejecutar() {
        return "Tocando Bateria: Ritmo 4/4"; //como marca el ritmo, toca especificar cual usa
    }
}