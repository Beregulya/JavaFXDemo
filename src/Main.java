import com.sun.javafx.scene.control.skin.ChoiceBoxSkin;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Observable;

public class Main extends Application  {

    Stage window;
    Scene scene;
    Button button;
    ListView<String> listView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Demo");
        button = new Button("Submit");

        listView = new ListView<>();
        listView.getItems().addAll("Iron Man", "Titanic", "Savage");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        button.setOnAction(e -> buttonClicked());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(listView, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void buttonClicked() {
        String message = "";
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();
        for (String m : movies) {
            message += m + "\n";
        }
        System.out.println(message);
    }

}
