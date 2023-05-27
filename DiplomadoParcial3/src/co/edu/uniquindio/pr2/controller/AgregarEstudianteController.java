package co.edu.uniquindio.pr2.controller;



import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.pr2.exception.ClasePrincipalException;
import co.edu.uniquindio.pr2.model.Estudiante;
import co.edu.uniquindio.pr2.model.Genero;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AgregarEstudianteController  implements Initializable{

	// llamamos la instancia del modelFactory
	ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();
	 private Genero valorSeleccionado;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private Button volver;

    @FXML
    private TextField txtNota3;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNota2;

    @FXML
    private ComboBox<Genero> cmbxGenero;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNota1;

    @FXML
    private Button btnAgregarEstudiante;


    /**
     * evento que captura los datos ingresados por el usuario los valida y agrega el estudiante
     * @param event
     */

    @FXML
    void agregarEstudiante(ActionEvent event) {


    	String nombre = this.txtNombre.getText();
		String identificacion = this.txtId.getText();
		float nota1 = Float.parseFloat(this.txtNota1.getText());
		float nota2 = Float.parseFloat(this.txtNota2.getText());
		float nota3 = Float.parseFloat(this.txtNota3.getText());
		//creo un arreglo de notas y le agrego las notas capturadas
		List<Float> notas = new ArrayList<>();
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);

		if(datosValidos(nombre, identificacion )){
		Estudiante estudiante = new Estudiante(nombre, valorSeleccionado, identificacion);

		try {
			modelFactoryController.getDiplomado().agregarEstudiante(estudiante ,notas);

			System.out.println("bien");
		} catch (ClasePrincipalException e) {

			e.getMessage();
			mostrarMensaje("erroe", " agregarEstudiante", e.getMessage(), AlertType.WARNING);
		}
    	}
		txtNombre.setText("");
        txtId.setText("");
        txtNota1.setText("");
        txtNota2.setText("");
        txtNota3.setText("");







    }
	private boolean datosValidos(String nombre, String identificacion) {
    	boolean esNumerica = true;

    	if (identificacion == null || identificacion.equals("")) {
    	    // La identificación es nula o una cadena vacía
    	    esNumerica = false;
    	} else {
    	    for (int i = 0; i < identificacion.length(); i++) {
    	        if (!Character.isDigit(identificacion.charAt(i))) {
    	            // Se encontró un carácter no numérico en la identificación
    	            esNumerica = false;
    	            break;
    	        }
    	    }
    	}
		String notificacion = "";
		if (nombre == null ||!(nombre instanceof String) || nombre.equals("")){
			notificacion += "el nombre ingresado es invalido";
		}

		if (identificacion == null ||esNumerica==false|| nombre.equals("")){
			notificacion += "la identificacion ingresado es invalida";
		}
		if(notificacion.equals("")){
			return true;
		}
		mostrarMensaje("notificiacion persona", "informacion invalida", notificacion, AlertType.WARNING);
		return false;
	}
	 public void mostrarMensaje(String titulo , String header , String contenido , AlertType alertType){
	    	Alert alert = new Alert(alertType);
	    	alert.setTitle(titulo);
	    	alert.setHeaderText(header);
	    	alert.setContentText(contenido);
	    	alert.showAndWait();
	    }

	 /**
	  * cargar la ventana de inicio al  oprimir el boton volver
	  * @param event
	  */
	    @FXML
	    void volverVenIni(ActionEvent event) {
	    	try {

	    		FXMLLoader loader = new FXMLLoader(
	    				getClass().getResource("../view/ListadoEstudiantes.fxml"));
	    		Parent root = loader.load();



	    		Scene scene = new Scene(root);
	    		Stage stage = new Stage();

	    		stage.setScene(scene);
	    		stage.show();
	    		stage.setTitle("Lista Facturas");
	    		Stage myStage = (Stage) this.volver.getScene().getWindow();
	    		myStage.close();

	    	} catch (IOException e) {

	    	}

	    }


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		 Genero[] valoresEnum = Genero.values();
		 cmbxGenero.setItems(FXCollections.observableArrayList(valoresEnum));
		 cmbxGenero.setOnAction(event -> {
	            valorSeleccionado = cmbxGenero.getSelectionModel().getSelectedItem();

		 });

	}


}
