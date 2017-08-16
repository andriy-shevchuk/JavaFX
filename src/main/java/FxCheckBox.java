import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class FxCheckBox extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane root = new BorderPane();

        VBox buttons = new VBox(10);
        HBox rects = new HBox();

        CheckBox[] chbs = new CheckBox[] {
                new CheckBox("red"),
                new CheckBox("green"),
                new CheckBox("blue")
        };

        Rectangle[] rectangles = new Rectangle[] {
                new Rectangle(100,100, Color.RED),
                new Rectangle(100,100, Color.GREEN),
                new Rectangle(100,100, Color.BLUE),
        };

        for (int i=0; i<3; i++) {
            CheckBox cb = chbs[i];
            Rectangle rect = rectangles[i];
            buttons.getChildren().add(cb);
            cb.selectedProperty().addListener(event ->{
                if (cb.isSelected()){
                    rects.getChildren().add(rect);
                } else {
                    rects.getChildren().remove(rect);
                }
            });


        }



        root.setLeft(buttons);
        root.setCenter(rects);
        Scene scene = new Scene(root,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String args[]) {

        launch(args);
    }
}
