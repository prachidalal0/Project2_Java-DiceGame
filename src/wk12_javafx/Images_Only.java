package wk12_javafx;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Images_Only extends Application {

	@Override
	//when using file input stream, have to read in throw IOException Class
	public void start(Stage primaryStage) throws IOException{
		
		FileInputStream fis = new FileInputStream(" ");
		Image img = new Image(fis);
		ImageView iv = new ImageView(img);
		iv.setFitWidth(100);
		iv.setFitHeight(120);
		
		//when using a URL file, use jpg and gif (work better than other file types) 
		//use tenor.com when you want a moving dice 
		ImageView iv2 = new ImageView("https://upload.wikimedia.org/wikipedia/commons/3/31/Stone_Dice_17.JPG");
		iv2.setFitWidth(100);
		iv2.setFitHeight(100);
		iv2.setLayoutX(300);
		iv2.setLayoutY(300);
		
		Pane pane = new Pane(iv2);
		Scene scene = new Scene(pane, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
