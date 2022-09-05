package ba.unsa.etf.rpr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;

public class DodajController {
    public Button dodajslika;
    public Button dodajj;
    public TextField dan;
    public TextField mjesec;
    public TextField godina;
    public TextField sati;
    public TextField minute;
    public CheckBox bitan;

    public DodajController() {
    }

    @FXML
    public void initialize() {
        Image img1 = new Image("/slike/zadatak.png");
        ImageView view1 = new ImageView(img1);
        view1.setFitHeight(198);
        view1.setFitWidth(171);
        dodajslika.setGraphic(view1);
    }
    public void dodajTask(ActionEvent actionEvent) {

    }
}
