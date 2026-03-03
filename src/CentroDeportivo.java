/**
 * Representa un centro deportivo que gestiona un conjunto limitado de entrenadores
 * mediante un array unidimensional de tamaño fijo.
 *
 * El sistema permite:
 * <ul>
 *     <li>Registrar entrenadores evitando duplicados por identificador.</li>
 *     <li>Buscar entrenadores por su {@code id}.</li>
 *     <li>Eliminar entrenadores del sistema.</li>
 *     <li>Actualizar información relacionada con los entrenadores.</li>
 *     <li>Obtener una representación textual del conjunto almacenado.</li>
 * </ul>
 *
 * La estructura interna utiliza un array estático donde las posiciones libres
 * se representan mediante valores {@code null}. La gestión del espacio disponible
 * se realiza mediante métodos internos que localizan la primera posición libre.
 *
 * Esta clase actúa como contenedor y gestiona la lógica de almacenamiento
 * y acceso a los objetos {@link Entrenador}.
 *
 * @author Qi Wang
 * @version 1.0
 */
public class CentroDeportivo {
    private Entrenador[] entrenadores;
    private final int NUM_MAX_ENTRENADORES;

    /**
     * Constructor de clase CentroDeportivo
     * @param num_max_entrenadores capacidad máxima de entrenadores
     */
    public CentroDeportivo(int num_max_entrenadores) {
        if (num_max_entrenadores > 0) {
            this.NUM_MAX_ENTRENADORES = num_max_entrenadores;
        } else  {
            this.NUM_MAX_ENTRENADORES = 100;
        }

        entrenadores = new Entrenador[this.NUM_MAX_ENTRENADORES];
    }

    /**
     * Dado su identificador, busca el entrenador que coincida con dicho id entre la lista de entrenadores
     * @param id identificador del entrenador a buscar
     * @return Entrenador con el id proporcionado, null si no se ha encontrado
     */
    public Entrenador buscarEntrenador(int id){
        boolean seguirBuscando = true;
        Entrenador entrenador = null;

        for (int i = 0; i < this.NUM_MAX_ENTRENADORES && seguirBuscando; i++) {
            if (entrenadores[i] != null && entrenadores[i].getId() == id) {
                seguirBuscando = false;
                entrenador = entrenadores[i];
            }
        }

        return entrenador;
    }

    /**
     * Encuentra primer hueco libre dentro de la lista de entrenadores
     * @return posicion del primer hueco libre, -1 si no hay hueco
     */
    private int buscarPrimerHuecoLibre(){
        boolean seguirBuscando = true;
        int primerHuecoLibre = -1;

        for (int i = 0; i < this.NUM_MAX_ENTRENADORES && seguirBuscando; i++) {
            if (entrenadores[i] == null) {
                primerHuecoLibre = i;
                seguirBuscando = false;
            }
        }

        return primerHuecoLibre;
    }

}
