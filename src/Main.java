
public class Main {
    public static void main(String[] args) {
        CentroDeportivo centroDeportivo;
        Entrenador entrenador1;
        Entrenador entrenador2;
        Entrenador entrenador3;

        centroDeportivo = new CentroDeportivo(15);

        entrenador1 = new Entrenador(1,"Entrenador 1", "Especialidad 1", 3);
        entrenador2 = new Entrenador(2,"Entrenador 2", "Especialidad 2", 6);
        entrenador3 = new Entrenador(3,"Entrenador 3", "Especialidad 3", 7);

        centroDeportivo.registrarEntrenador(entrenador1);
        centroDeportivo.registrarEntrenador(entrenador2);
        centroDeportivo.registrarEntrenador(entrenador3);

        System.out.println(centroDeportivo.mostrarEntrenadores());
        System.out.println("Total de entrenadores: " + centroDeportivo.contarEntrenadores());

        System.out.println(centroDeportivo.buscarEntrenador(2));
        System.out.println(centroDeportivo.buscarEntrenador(9));
    }
}