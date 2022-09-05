package ba.unsa.etf.rpr;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;

public class LoginController {
    public TextField ime;
    public TextField sifra;
    public Button prijava;
    public Button slika;
    private String pass;
    private String username;



    public void clickLogin(ActionEvent actionEvent) {
        pass = sifra.getText();
        username = ime.getText();

        if(ime.equals("admin") && pass.equals("admin")){
            Stage stage = new Stage();
            Parent root = null;
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/glavni.fxml"));
                GlavniController gradController = new GlavniController();
                loader.setController(gradController);
                root = loader.load();
                stage.setTitle("Grad");
                stage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
                stage.setResizable(true);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
