package co.edu.uniquindio.pr2.controller;



import java.io.IOException;
import java.net.URL;

import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.pr2.model.Estudiante;
import co.edu.uniquindio.pr2.model.Genero;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ListadoEstudiantesController implements Initializable {
	ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Estudiante ,String> colIdentificacion;

    @FXML
    private Button btnVolver;

    @FXML
    private TableColumn<Estudiante ,Genero> colGenero;

    @FXML
    private TableColumn<Estudiante, List<Float>> colNotas;

    @FXML
    private TableColumn<Estudiante , String> colNombre;

    @FXML
    private TableView<Estudiante> tblEstudiantes;

    @FXML
    void volverVenInicio(ActionEvent event) {

    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/InicioView.fxml"));
    		Parent root = loader.load();



    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Lista Facturas");
    		Stage myStage = (Stage) this.btnVolver.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {

    	}

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		colNombre.setCellValueFactory( new PropertyValueFactory<>("nombre") );
		colGenero.setCellValueFactory( new PropertyValueFactory<>("genero") );
		colIdentificacion.setCellValueFactory( new PropertyValueFactory<>("identificacion") );
		colNotas.setCellValueFactory(new PropertyValueFactory<>("notas"));
		 colNotas.setCellValueFactory(param -> new SimpleObjectProperty<>(param.getValue().getListaNotasEstudiante()));



		List<Estudiante> estudiantes = modelFactoryController.diplomado.getListaEstudiantes();

		tblEstudiantes.setItems(FXCollections.observableArrayList(estudiantes));
	}

}
