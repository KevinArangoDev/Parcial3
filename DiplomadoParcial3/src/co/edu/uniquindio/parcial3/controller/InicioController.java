package co.edu.uniquindio.parcial3.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.Initializable;

public class InicioController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private Button btnPromEstudiante;

	    @FXML
	    private Button btnListadoEstudiantes;

	    @FXML
	    private Button btnAgregarEstudiante;

	    @FXML
	    private Button btnPromNotasEstudiantes;



	    @FXML
	    void ventAgregarEstudiante(ActionEvent event) {
	    	try {

	    		FXMLLoader loader = new FXMLLoader(
	    				getClass().getResource("../view/AgregarEstudianteView.fxml"));
	    		Parent root = loader.load();

	    		AgregarEstudianteController controlador = loader.getController();

	    		Scene scene = new Scene(root);
	    		Stage stage = new Stage();

	    		stage.setScene(scene);
	    		stage.show();
	    		stage.setTitle("Diplomado Uq");
	    		Stage myStage = (Stage) this.btnAgregarEstudiante.getScene().getWindow();
	    		myStage.close();

	    	} catch (IOException e) {
	            e.printStackTrace();
	    	}
	    }



	    @FXML
	    void ventPromEstudiante(ActionEvent event) {
	    	try {

	    		FXMLLoader loader = new FXMLLoader(
	    				getClass().getResource("../view/PromedioEstudianteView.fxml"));
	    		Parent root = loader.load();

	    		PromedioEstudianteController controlador = loader.getController();

	    		Scene scene = new Scene(root);
	    		Stage stage = new Stage();

	    		stage.setScene(scene);
	    		stage.show();
	    		stage.setTitle("Diplomado Uq");
	    		Stage myStage = (Stage) this.btnPromEstudiante.getScene().getWindow();
	    		myStage.close();

	    	} catch (IOException e) {
	            e.printStackTrace();
	    	}
	    }



	    @FXML
	    void ventPromNotasEstudiantes(ActionEvent event) {
	    	try {

	    		FXMLLoader loader = new FXMLLoader(
	    				getClass().getResource("../view/PromNotasEstudiantesView.fxml"));
	    		Parent root = loader.load();

	    		PormNotasEstudiantesController controlador = loader.getController();

	    		Scene scene = new Scene(root);
	    		Stage stage = new Stage();

	    		stage.setScene(scene);
	    		stage.show();
	    		stage.setTitle("Diplomado Uq");
	    		Stage myStage = (Stage) this.btnPromNotasEstudiantes.getScene().getWindow();
	    		myStage.close();

	    	} catch (IOException e) {
	            e.printStackTrace();
	    	}
	    }


	    @FXML
	    void ventEstudiantes(ActionEvent event) {
	    	try {

	    		FXMLLoader loader = new FXMLLoader(
	    				getClass().getResource("../view/ListadoEstudiantesView.fxml"));
	    		Parent root = loader.load();

	    		ListadoEstudianteController controlador = loader.getController();

	    		Scene scene = new Scene(root);
	    		Stage stage = new Stage();

	    		stage.setScene(scene);
	    		stage.show();
	    		stage.setTitle("Diplomado Uq");
	    		Stage myStage = (Stage) this.btnListadoEstudiantes.getScene().getWindow();
	    		myStage.close();

	    	} catch (IOException e) {
	            e.printStackTrace();
	    	}
	    }




}
