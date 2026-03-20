package grupoMusical;

public class Evento {
    private String nombreEvento;
    private Grupo grupo;

    public Evento(String nombreEvento, Grupo grupo) {
        this.nombreEvento = nombreEvento;
        this.grupo = grupo;
    }
    
    public void ejecutar() {
        System.out.println("--- EVENTO: " + nombreEvento + " ---");
        grupo.iniciarPresentacion();
    }
}