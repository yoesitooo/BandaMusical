package grupoMusical;

import java.util.Arrays;

public class AppMusical {
    public static void main(String[] args) {
        // Definicion de musicos participantes (nota para agregar se debe crear una de esos objetos de la clase musico y ya agregarlos en 
    	// el momento crear el objeto banda y se le agrega el nuevo musico al arary list
        Musico m1 = new Musico("Jhoe");
        Musico m2 = new Musico("Luis");
        Musico m3 = new Musico("Andres");
        Musico m4 = new Musico("Juan");

        // Se crea la agrupación y nombre, además del festival
        Grupo banda = new Grupo("Ensamble_01", Arrays.asList(m1, m2, m3,m4));
        Evento festival = new Evento("Festival de Programacion", banda);

        // Ejecucion
        festival.ejecutar();
    }
}