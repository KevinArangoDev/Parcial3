package co.edu.uniquindio.parcial3.controller;



import java.util.ArrayList;
import java.util.List;

import co.edu.uniquindio.parcial3.exception.ClasePrincipalException;
import co.edu.uniquindio.parcial3.model.Diplomado;
import co.edu.uniquindio.parcial3.model.Estudiante;


public class ModelFactoryController {

	//Atrinutos
	private static ModelFactoryController instance;
	private List<Estudiante> listaEstudiantes;
    Diplomado diplomado;



    private ModelFactoryController() {
        // Constructor privado para evitar instanciación directa
//    	listaNotasEstudiante = new List<>;
		diplomado = new Diplomado("nombre", 10);
		listaEstudiantes = new ArrayList<>();
		inicializarEstudiante();


    }

    /**
     * Instansia del model factory
     * @return
     */

	public static ModelFactoryController getInstance() {
        if (instance == null) {
            instance = new ModelFactoryController();
        }
        return instance;
    }

	/**
	 * metodo que inicializa el estudiante
	 */

	public void inicializarEstudiante() {

    }

	/**
	 * Getters y Setters
	 */

	public  Diplomado getDiplomado() {
		return diplomado;
	}

	public void setDiplomado(Diplomado diplomado) {
		this.diplomado = diplomado;
	}



	public static void setInstance(ModelFactoryController instance) {
		ModelFactoryController.instance = instance;
	}



	public List<Estudiante> getlistaEstudiantes() {
		return listaEstudiantes;
	}



	public void setListaNotasEstudiante(List<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}

//----------------------------------------Metodos---------------------------------------------------

	/**
	 * Metodo Agregar estudiante
	 * @param estudiante
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













}
