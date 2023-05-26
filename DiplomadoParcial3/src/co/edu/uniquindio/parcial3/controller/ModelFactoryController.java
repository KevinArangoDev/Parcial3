package co.edu.uniquindio.parcial3.controller;



import java.util.List;

import co.edu.uniquindio.parcial3.model.Diplomado;
import co.edu.uniquindio.parcial3.model.Estudiante;


public class ModelFactoryController {

	//Atrinutos
	private static ModelFactoryController instance;
	private List<Float> listaNotasEstudiante;
    Diplomado diplomado;
    Estudiante estudiante;


    private ModelFactoryController() {
        // Constructor privado para evitar instanciación directa
//    	listaNotasEstudiante = new List<>;
		diplomado = new Diplomado("nombre", 10);
		
    }



	public static ModelFactoryController getInstance() {
        if (instance == null) {
            instance = new ModelFactoryController();
        }
        return instance;
    }

	private void inicializarEstudiante() {




    }


	public  Diplomado getDiplomado() {
		return diplomado;
	}

	public void setDiplomado(Diplomado diplomado) {
		this.diplomado = diplomado;
	}



	public Estudiante getEstudiante() {
		return estudiante;
	}



	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}



	public static void setInstance(ModelFactoryController instance) {
		ModelFactoryController.instance = instance;
	}



	public List<Float> getListaNotasEstudiante() {
		return listaNotasEstudiante;
	}



	public void setListaNotasEstudiante(List<Float> listaNotasEstudiante) {
		this.listaNotasEstudiante = listaNotasEstudiante;
	}






}
