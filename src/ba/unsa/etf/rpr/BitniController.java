package ba.unsa.etf.rpr;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.ArrayList;

public class BitniController {
    public ListView lista;
    private ProjekatDao dao;

    public BitniController() {
        dao = ProjekatDao.getInstance();
    }

    @FXML
    public void initialize() {
        ArrayList<Zadatak> rez = new ArrayList<>();
        rez = dao.dajBitne();
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
