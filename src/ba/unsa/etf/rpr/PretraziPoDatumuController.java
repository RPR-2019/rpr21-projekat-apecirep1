package ba.unsa.etf.rpr;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class PretraziPoDatumuController {
    public TextField dan;
    public TextField mjesec;
    public TextField godina;
    public Button nadji;
    public ListView lista;
    private ProjekatDao dao;


    public PretraziPoDatumuController() {
        dao = ProjekatDao.getInstance();
    }

    @FXML
    public void initialize() {
        Image img1 = new Image("/slike/trazi.png");
        ImageView view1 = new ImageView(img1);
        view1.setFitHeight(25);
        view1.setFitWidth(48);
        nadji.setGraphic(view1);
    }

    public void clickNadji(){
        ArrayList<Zadatak> rez = new ArrayList<>();
        String str = dan.getText() + " " + mjesec.getText() + " " + godina.getText();
        rez = dao.dajPoDatumu(str);

        for(Zadatak z : rez){
            String s = "";
            s += z.getNaziv();
            s += "   ";
            s += z.getDatum();
            s += "   ";
            s += z.getVrijeme();
            s += "   ";
            if(z.getBitno() == 1){
                s += "bitan";
            }else{

            }
            lista.getItems().add(s);
        }

    }
}
