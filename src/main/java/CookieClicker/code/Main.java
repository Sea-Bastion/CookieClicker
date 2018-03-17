package CookieClicker.code;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		Label text = new Label("Work in progress");
		StackPane pane = new StackPane(text);
		Scene scene = new Scene(pane, 600, 337.5);

		primaryStage.setScene(scene);
		primaryStage.show();

	}
}
