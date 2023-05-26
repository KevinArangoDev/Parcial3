package co.edu.uniquindio.parcial3.controller;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial3.model.Estudiante;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AgregarEstudianteController implements Initializable {

 		private ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();

 		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub

		}

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TextField txtNota3;

	    @FXML
	    private TextField txtId;

	    @FXML
	    private TextField txtNota2;

	    @FXML
	    private TextField txtNombre;

	    @FXML
	    private TextField txtNota1;

	    @FXML
	    private TextField txtGenero;

	    @FXML
	    private Button btnAgregarEstudiante1;


	    @FXML
	    void agregarEstudiante(ActionEvent event) throws IOException {

	    	String nombre = txtNombre.getText();
	        String idnetificacion = txtId.getText();
	        String genero = txtGenero.getText();
	        double nota1 = Double.parseDouble(txtNota1.getText());
	        double nota2 = Double.parseDouble(txtNota2.getText());
	        double nota3 = Double.parseDouble(txtNota3.getText());

	        Estudiante nuevoEstudiante = new Estudiante(nombre, genero, idnetificacion);

	        // Agregar el nuevo cliente a la lista de clientes en el ModelFactorySingleton
    	    modelFactoryController.getDiplomado().getListaEstudiantes().add(nuevoEstudiante);

    	    mostrarAlerta("Estudiante Agregado:\n\n" +
	                  "Nombre: " + nombre + "\n" +
	                  "Genero: " + genero + "\n" +
	                  "Idenntificacion: " + idnetificacion);


	        // Realizar otras operaciones necesarias con el nuevo cliente

	        // Limpiar los campos de texto
    	    txtNombre.clear();
    	    txtId.clear();
    	    txtGenero.clear();
    	    txtNota1.clear();
    	    txtNota2.clear();
    	    txtNota3.clear();

	  }

	    private void mostrarAlerta(String string) {
	    	 Alert alerta = new Alert(Alert.AlertType.INFORMATION);
		        alerta.setTitle("Alerta");
		        alerta.setHeaderText(null);
		        alerta.setContentText(string);
		        alerta.showAndWait();
		}




	}


