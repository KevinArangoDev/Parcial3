package co.edu.uniquindio.pr2.controller;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PromNotasEstudianteController implements Initializable {
	ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnVolver;


    @FXML
    private Button btnPromedio;

    @FXML
    private TextField Promedio;

    @FXML
    private TextField txtIdentificacion;

    @FXML
    void obtenerPromedio(ActionEvent event) {
    	String identificacion = this.txtIdentificacion.getText();
    	modelFactoryController.diplomado.calcularPromEstudiante(identificacion);
    	 double promed = modelFactoryController.diplomado.getPromedioEstudiante(identificacion);
    	 Promedio.setText("promedio: "+ promed);
    	 txtIdentificacion.setText("");


    }
    @FXML
    void volverInicio(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/InicioView.fxml"));
    		Parent root = loader.load();



    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("");
    		Stage myStage = (Stage) this.btnVolver.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {

    	}

    }


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}


}
