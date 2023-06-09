package co.edu.uniquindio.parcial3.model;

import java.util.List;

public class Estudiante {

	// Atributos
	private String nombre;
	private String genero;
	private String identificacion;
	private List<Float> listaNotasEstudiante;

	/**
	 * Metodo Constructor
	 */

	public Estudiante(String nombre, String genero, String identificacion) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.identificacion = identificacion;
	}

	/**
	 * Constructor vacio
	 */

	public Estudiante(){
		super();
	}

	/**
	 * Getter y Setters de la clase
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public List<Float> getListaNotasEstudiante() {
		return listaNotasEstudiante;
	}

	public void setListaNotasEstudiante(List<Float> listaNotasEstudiante) {
		this.listaNotasEstudiante = listaNotasEstudiante;
	}

	/**
	 * Metodos Hashcode + equals
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((identificacion == null) ? 0 : identificacion.hashCode());
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
		Estudiante other = (Estudiante) obj;
		if (genero != other.genero)
			return false;
		if (identificacion == null) {
			if (other.identificacion != null)
				return false;
		} else if (!identificacion.equals(other.identificacion))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	/**
	 * Metodo ToString
	 */

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", genero=" + genero + ", identificacion=" + identificacion + "]";
	}












}
