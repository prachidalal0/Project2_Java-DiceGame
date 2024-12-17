package wk12_javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class firstJavaFX extends Application {
	
	/*
	Implement a JavaFX class, FirstJavaFX
	Create a JavaFX graph with the minimum lines of code
	Group
	Scene 
	Stage
	.show()
	*/
	
	@Override
	public void start(Stage primaryStage) {
		
		//access group class and create class object
		//create no arg constructor
		Group group = new Group();
		Scene scene = new Scene(group);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
		
		public class FirstJavaFX extends Application {
		

	}

	public static void main(String[] args) {
		launch(args);
	}
}
