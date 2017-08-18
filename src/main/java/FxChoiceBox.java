import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class FxChoiceBox extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root = new Pane();

        ChoiceBox choiceBox = new ChoiceBox();
        choiceBox.setItems(FXCollections.observableArrayList(
                "Red", "Green", "Yellow", "Blue", "Black"
        ));

        Color[] colors = new Color[] {Color.RED,Color.GREEN,Color.YELLOW,Color.BLUE,Color.BLACK};

        Rectangle rect = new Rectangle(200,200, Color.WHITE);
        rect.setTranslateX(100);
        rect.setTranslateY(100);

        choiceBox.getSelectionModel().selectedIndexProperty().addListener(
                (ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
                    rect.setFill(colors[new_val.intValue()]);
                }
        );

        choiceBox.setValue("Red");
        root.getChildren().setAll(choiceBox,rect);

        Scene scene = new Scene(root,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String args[]) {

        launch(args);
    }
}
