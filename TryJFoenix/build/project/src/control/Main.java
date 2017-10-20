package control;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
//import com.jfoenix.controls.*

	

public class Main extends Application {

	private AnchorPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			// Load root layout from fxml file.
						FXMLLoader loader = new FXMLLoader();
						loader.setLocation(Main.class.getResource("../view/JFoenix.fxml"));
						rootLayout = (AnchorPane) loader.load();
						
						
//			BorderPane root = new BorderPane();
			Scene scene = new Scene(rootLayout,300,600);
			scene.getStylesheets().add(getClass().getResource("../view/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
