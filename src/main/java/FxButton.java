import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;




public class FxButton extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("MyWindow");
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);

        Pane root = new Pane();

        javafx.scene.control.Button btn = new javafx.scene.control.Button();
        btn.setText("Click");
        btn.setTranslateX(100);
        btn.setTranslateY(100);
        btn.setPrefSize(70,20);

        final Rectangle rect = new Rectangle(50,50);

        btn.setOnAction(event ->{
            rect.setFill(Color.RED);
        });


        Scene scene = new Scene(root);

        root.getChildren().addAll(btn,rect);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
