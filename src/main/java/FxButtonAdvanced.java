import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FxButtonAdvanced extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root = new Pane();

        Button button = new Button();
        //button.setText("Click");

        Image image = new Image(getClass().getResourceAsStream("eclipse_update_120.jpg"));
        ImageView img = new ImageView(image);
        img.setFitHeight(40);
        img.setFitWidth(40);

        button.setGraphic(img);

        button.setStyle("-fx-base:#b6e7c9");

        DropShadow shadow = new DropShadow();
        shadow.setColor(Color.GOLD);
        shadow.setRadius(40);

        button.setOnAction(event -> {
            button.setEffect(shadow);
        });

        root.getChildren().setAll(button);

        Scene scene = new Scene(root,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String args[]) {

        launch(args);
    }
}
