package co.edu.uniquindio.pr2.aplication;

import co.edu.uniquindio.pr2.controller.ModelFactoryController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplication extends Application {
	static ModelFactoryController singleton = ModelFactoryController.getInstance();

	public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/InicioView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("principal");
        primaryStage.show();

    }


	  public static void main(String[] args) {
	    launch(args);
	}





}

