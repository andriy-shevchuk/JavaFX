import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FxTextField extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane root = new GridPane();
        root.setPadding(new Insets(10,10,10,10));
        root.setHgap(5);
        root.setVgap(5);

        TextField name = new TextField();
        name.setPromptText("Enter your name");
        GridPane.setConstraints(name,0,0);
        root.getChildren().add(name);

        TextField lastName = new TextField();
        lastName.setPromptText("Enter your lastname");
        GridPane.setConstraints(lastName,0,1);
        root.getChildren().add(lastName);

        TextField comment = new TextField();
        comment.setPromptText("Enter your comment");
        GridPane.setConstraints(comment,0,2);
        root.getChildren().add(comment);

        Label label = new Label();
        GridPane.setConstraints(label,0,3);
        root.getChildren().add(label);

        Button submit = new Button("Submit");
        GridPane.setConstraints(submit,1,0);
        root.getChildren().add(submit);

        Button clear = new Button("Clear");
        GridPane.setConstraints(clear,1,1);
        root.getChildren().add(clear);

        submit.setOnAction(event -> {
            if(!comment.getText().isEmpty()){
                label.setText(name.getText()+" "+lastName.getText()+", thank you for comment");
            } else {
                label.setText("You did not left any comment");
            }
        });

        clear.setOnAction(event -> {
            name.clear();
            lastName.clear();
            comment.clear();
            label.setText(null);
        });


        Scene scene = new Scene(root,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String args[]) {

        launch(args);
    }
}
