import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class FxRadioButton extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane root = new BorderPane();

        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER);

        HBox pic = new HBox();
        pic.setAlignment(Pos.CENTER);

        RadioButton rb1 = new RadioButton("cheese");
        RadioButton rb2 = new RadioButton("chocolate");
        RadioButton rb3 = new RadioButton("citrus");

        ToggleGroup group = new ToggleGroup();

        rb1.setToggleGroup(group);
        rb2.setToggleGroup(group);
        rb3.setToggleGroup(group);

        rb1.setUserData("cheese");
        rb2.setUserData("chocolate");
        rb3.setUserData("citrus");




        ImageView img = new ImageView();

        group.selectedToggleProperty().addListener(event -> {
            Image image = new Image(getClass().getResourceAsStream(group.getSelectedToggle().getUserData()+".jpg"));
            img.setImage(image);
            img.setFitWidth(94);
            img.setFitHeight(94);
        });

        rb2.setSelected(true);

        buttons.getChildren().setAll(rb1,rb2,rb3);
        pic.getChildren().setAll(img);
        root.setTop(buttons);
        root.setCenter(pic);
        Scene scene = new Scene(root,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String args[]) {

        launch(args);
    }
}
