package co.edu.uniquindio.pr2.controller;

import co.edu.uniquindio.pr2.model.Diplomado;
import co.edu.uniquindio.pr2.model.Estudiante;

public class ModelFactoryController {
		Diplomado diplomado;
		Estudiante estudiante;
		private static class SingletonHolder {
			// El constructor de Singleton puede ser llamado desde aqui al ser
			// protected
			private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
		}
		// Metodo para obtener la instancia de nuestra clase
			public static ModelFactoryController getInstance() {
				return SingletonHolder.eINSTANCE;
			}

			public ModelFactoryController() {
				System.out.println("invocación clase singleton");
				inicializarDatos();
			}

			private void inicializarDatos() {
				diplomado = new Diplomado("nombre", 20);

			}

			public Diplomado getDiplomado() {
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




}
