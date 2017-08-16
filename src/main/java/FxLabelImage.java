import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FxLabelImage extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root = new Pane();

        Label label = new Label();
        label.setText("This is a label");

        Image image = new Image(getClass().getResourceAsStream("10000206.jpg"));
        ImageView img = new ImageView(image);
        img.setFitHeight(200);
        img.setFitWidth(200);

        Label labelImg = new Label();
        labelImg.setGraphic(img);
        labelImg.setTranslateX(75);
        labelImg.setTranslateY(100);
        labelImg.setText("football");
        labelImg.setGraphicTextGap(20);
        labelImg.setContentDisplay(ContentDisplay.TOP);

        Label onMouseLabel = new Label();
        onMouseLabel.setText("This is on mouse label");
        onMouseLabel.setTranslateX(140);
        onMouseLabel.setTranslateY(350);

        onMouseLabel.setOnMouseEntered(event -> {
            onMouseLabel.setScaleX(1.5);
            onMouseLabel.setScaleY(1.5);
            onMouseLabel.setTextFill(Color.RED);
        });

        onMouseLabel.setOnMouseExited(event -> {
            onMouseLabel.setScaleX(1);
            onMouseLabel.setScaleY(1);
            onMouseLabel.setTextFill(Color.BLACK);
        });

        root.getChildren().addAll(label, labelImg, onMouseLabel);

        Scene scene = new Scene(root,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String args[]) {

        launch(args);
    }
}
