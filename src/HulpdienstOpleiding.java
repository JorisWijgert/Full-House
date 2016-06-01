import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *  Kees on 11/05/2016.
 */
public class HulpdienstOpleiding extends Application{

    /**
     * to launch the program     *
     */
    public static void main(String[] args) {
        launch(args);

    }

    /**
     * start the main program the school program     *
     *
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/hulpdienst_opleiding.fxml"));
        primaryStage.setTitle("Hulpdienst in opleiding");
        primaryStage.setScene(new Scene(root, 619, 466));
        primaryStage.show();
    }
}
