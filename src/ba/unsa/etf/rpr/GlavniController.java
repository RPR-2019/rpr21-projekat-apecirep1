package ba.unsa.etf.rpr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;

public class GlavniController {

    public Button dodaj;
    public Button pretrazi;
    public Button podatumu;
    public Button bitni;
    public Button broj;
    public Button slika1;
    public Button slika2;
    public Button slika3;
    public Button slika4;
    public Button slika5;

    public GlavniController() {
    }

    @FXML
    public void initialize() {
        Image img1 = new Image("/slike/kafa.png");
        ImageView view1 = new ImageView(img1);
        slika1.setGraphic(view1);

        Image img2 = new Image("/slike/knjige.png");
        ImageView view2 = new ImageView(img2);
        slika1.setGraphic(view2);

        Image img3 = new Image("/slike/kucanje.png");
        ImageView view3 = new ImageView(img3);
        slika1.setGraphic(view3);

        Image img4 = new Image("/slike/posao.png");
        ImageView view4 = new ImageView(img4);
        slika1.setGraphic(view4);

        Image img5 = new Image("/slike/tegovi.png");
        ImageView view5 = new ImageView(img5);
        slika1.setGraphic(view5);
    }

    public void clickDodaj(ActionEvent actionEvent) {
        Stage stage = new Stage();
        Parent root = null;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/dodaj.fxml"));
            DodajController dodajController = new DodajController();
            loader.setController(dodajController);
            root = loader.load();
            stage.setTitle("Grad");
            stage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
            stage.setResizable(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clickPretrazi(ActionEvent actionEvent) {
        Stage stage = new Stage();
        Parent root = null;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/pretrazi.fxml"));
            PretraziController pretraziController = new PretraziController();
            loader.setController(pretraziController);
            root = loader.load();
            stage.setTitle("Grad");
            stage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
            stage.setResizable(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clickPoDatumu(ActionEvent actionEvent) {
        Stage stage = new Stage();
        Parent root = null;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/poDatumu.fxml"));
            PretraziPoDatumuController pretraziPoDatumuController = new PretraziPoDatumuController();
            loader.setController(pretraziPoDatumuController);
            root = loader.load();
            stage.setTitle("Grad");
            stage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
            stage.setResizable(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clickBitni(ActionEvent actionEvent) {
        Stage stage = new Stage();
        Parent root = null;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/vazni.fxml"));
            BitniController bitniController = new BitniController();
            loader.setController(bitniController);
            root = loader.load();
            stage.setTitle("Grad");
            stage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
            stage.setResizable(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clickBroj(ActionEvent actionEvent) {

    }

}
