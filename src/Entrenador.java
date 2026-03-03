/**
 * Representa a un entrenador dentro del sistema del centro deportivo.
 *
 * Cada entrenador está identificado de manera única mediante un {@code id}
 * y dispone de información básica como nombre, especialidad y años de experiencia.
 *
 * Esta clase actúa como entidad del dominio y encapsula sus datos,
 * permitiendo el acceso únicamente a través de métodos públicos.
 *
 * @author Luis García Sánchez
 * @version 1.0
 */
public class Entrenador {
    private int id;
    private String nombre;
    private String especialidad;
    private int yearsExperiencia;
    private int idAlt = 100;

    /**
     * Constructor de la clase Entrenador
     * @param id identificador
     * @param nombre nombre del entrenador
     * @param especialidad especializacion del entrenador
     * @param yearsExperiencia años de experiencia del entrenador
     */
    public Entrenador (int id, String nombre, String especialidad, int yearsExperiencia) {
        if (id > 0) {
            this.id = id;
        } else {
            this.id = idAlt;
            idAlt++;
        }

        this.nombre = nombre;
        this.especialidad = especialidad;
        this.yearsExperiencia = yearsExperiencia;
    }

    /**
     * Devuelve identificador de Entrenador
     * @return int id de clase Entrenador
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve nombre del Entrenador
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la especialidad del Entrenador
     * @return String especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Devuelve los años de experiencia del Entrenador
     * @return int yearsExperiencia
     */
    public int getYearsExperiencia() {
        return yearsExperiencia;
    }

    /**
     * Metodo toString de Entrenador
     * @return String del entrenador con sus atributos
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Entrenador{");

        sb.append(String.format("id = %d", id));
        sb.append(String.format("; nombre = %s", nombre));
        sb.append(String.format("; especialidad = %s", especialidad));
        sb.append(String.format("; yearsExperiencia = %d", yearsExperiencia));
        sb.append("}");

        return sb.toString();
    }


}
