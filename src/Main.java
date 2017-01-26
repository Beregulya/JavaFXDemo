import com.sun.javafx.scene.control.skin.ChoiceBoxSkin;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Observable;

public class Main extends Application  {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Demo");

        Human nick = new Human();
        nick.firstNameProperty().addListener((v, oldValue, newValue) -> {
            System.out.println("Name changed to: " + newValue);
            System.out.println("firstNameProperty(): " + nick.firstNameProperty());
            System.out.println("getFirstName(): " + nick.getFirstName());
        });

        Button button = new Button("Submit");
        button.setOnAction(e -> nick.setFirstName("Genius"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        scene.getStylesheets().add("Style.css");
        window.setScene(scene);
        window.show();
    }

}
