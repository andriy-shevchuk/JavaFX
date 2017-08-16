import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FxHboxVbox extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        VBox vBox = new VBox(10);
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);

        Button btn1 = addButton("1");
        Button btn2 = addButton("2");
        Button btn3 = addButton("3");
        Button btn4 = addButton("4");
        Button btn5 = addButton("5");
        Button btn6 = addButton("6");

        vBox.getChildren().addAll(btn1,btn2,btn3);
        hBox.getChildren().addAll(btn4,btn5,btn6);

        root.setTop(hBox);
        root.setLeft(vBox);

        Scene scene = new Scene(root,300,200);
        primaryStage.setScene(scene);
        primaryStage.show();

     }

     private Button addButton (String name) {
        Button btn = new Button(name);
        btn.setPrefSize(70,20);
        return btn;

     }

    public static void main(String args[]) {
        launch(args);
    }
}
