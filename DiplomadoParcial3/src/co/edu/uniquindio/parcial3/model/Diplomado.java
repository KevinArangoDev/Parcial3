package co.edu.uniquindio.parcial3.model;

import java.util.List;

import co.edu.uniquindio.parcial3.exception.ClasePrincipalException;


public class Diplomado {

	//Atributos
	private String nombre;
	private int cupo;
    private List<Estudiante> listaEstudiantes;


    /**
     * Metodo Constructor
     */

    public Diplomado(String nombre, int cupo) {
		super();
		this.nombre = nombre;
		this.cupo = cupo;
	}

    /**
     * Getters y Setters
     * @return
     */

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCupo() {
		return cupo;
	}


	public void setCupo(int cupo) {
		this.cupo = cupo;
	}


	public List<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}


	public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}


	/**
	 * HashCode + To String + Equals
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cupo;
		result = prime * result + ((listaEstudiantes == null) ? 0 : listaEstudiantes.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diplomado other = (Diplomado) obj;
		if (cupo != other.cupo)
			return false;
		if (listaEstudiantes == null) {
			if (other.listaEstudiantes != null)
				return false;
		} else if (!listaEstudiantes.equals(other.listaEstudiantes))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Diplomado [nombre=" + nombre + ", cupo=" + cupo + ", listaEstudiantes=" + listaEstudiantes + "]";
	}


//----------------------------------------------Primer Punto--------------------------------------------------

	/**
	 * metodo utilizado para agregar un estudiante
	 *
	 * @param vehiculo
	 * @throws ClasePrincipalException
	 */
	public void agregarEstudiante(Estudiante estudiante) throws ClasePrincipalException {
		for (Estudiante est : listaEstudiantes) {
			if (est.getIdentificacion().equals(estudiante.getIdentificacion())) {
				throw new ClasePrincipalException("Ya existe un estudiante con la identificación.");
			}
		}

		listaEstudiantes.add(estudiante);
		System.out.println("Se agregó un nuevo estudiante.");
	}


	/**
	 * Metodo Calcular promedii de un estudiante dada su identificación
	 * @return
	 */

	public float calcularPromEstudiante (String identificacion){

		int prom = 0;

		for (Estudiante estudiante : listaEstudiantes) {
			if(estudiante.getIdentificacion().equals(identificacion)){
				List<Float> notas = estudiante.getListaNotasEstudiante();
                float suma = 0;
                for (float nota : notas) {
                    suma += nota;
                }
                return suma / notas.size();

			}
		}
		return prom;

	}

//	for (ClienteNatural cliente : listaClienteNatural) {
//        if (cliente.getCedula().equals(identificacion)) {
//            return true; // El cliente existe
//        }
//
}
