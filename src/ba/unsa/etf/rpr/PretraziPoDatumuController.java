package ba.unsa.etf.rpr;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PretraziPoDatumuController {
    public TextField dan;
    public TextField mjesec;
    public TextField godina;
    public Button nadji;
    public ListView lista;


    public PretraziPoDatumuController() {
    }

    @FXML
    public void initialize() {
        Image img1 = new Image("/slike/trazi.png");
        ImageView view1 = new ImageView(img1);
        view1.setFitHeight(25);
        view1.setFitWidth(48);
        nadji.setGraphic(view1);
    }
}
