package co.edu.uniquindio.pr2.controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class InicioController {

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



    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Lista Facturas");
    		Stage myStage = (Stage) this.btnAgregarEstudiante.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {

    	}


    }

    @FXML
    void ventPromEstudiante(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/PromNotasEstudianteView.fxml"));
    		Parent root = loader.load();



    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Lista Facturas");
    		Stage myStage = (Stage) this.btnAgregarEstudiante.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {

    	}



    }

    @FXML
    void ventPromNotasEstudiantes(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/PromEstudiantesView.fxml"));
    		Parent root = loader.load();



    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Lista Facturas");
    		Stage myStage = (Stage) this.btnAgregarEstudiante.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {

    	}

    }

    @FXML
    void ventEstudiantes(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/ListadoEstudiantes.fxml"));
    		Parent root = loader.load();



    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Lista Facturas");
    		Stage myStage = (Stage) this.btnListadoEstudiantes.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {

    	}

    }
}

