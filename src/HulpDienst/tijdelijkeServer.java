package HulpDienst;/**
 * Created by Mark on 6-4-2016.
 */

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class tijdelijkeServer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    ServerSocket SS;
    Socket connection = null;
    ObjectOutputStream out;
    ObjectInputStream in;
    IRequests TRS;

    @Override
    public void start(Stage primaryStage) {
        TRS = new requests();
        TeamRequest TR = new TeamRequest("Brand", "daym fire", 1, 1, 3, 0);
        TRS.addRequests(TR);

        try {
            SS = new ServerSocket(2004);
            connection = SS.accept();
            out = new ObjectOutputStream(connection.getOutputStream());
            out.flush();
            in = new ObjectInputStream(connection.getInputStream());
            out.writeObject(TRS);
        } catch (IOException e) {

        }


    }
}