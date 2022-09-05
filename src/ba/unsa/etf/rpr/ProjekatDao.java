package ba.unsa.etf.rpr;

import java.sql.*;
import java.util.ArrayList;

public class ProjekatDao {
    private static ProjekatDao instance;
    private Connection conn;

    private PreparedStatement dajTaskovePoNazivu, dajTaskovePoDatumu, dajBitneTaskove, dajSveTaskove, dodajTask;

    public static ProjekatDao getInstance() {
        if (instance == null) instance = new ProjekatDao();
        return instance;
    }

    private ProjekatDao() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:baza.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            dajTaskovePoNazivu = conn.prepareStatement("SELECT * FROM taskovi WHERE naziv=?");
            dajTaskovePoDatumu = conn.prepareStatement("SELECT * FROM taskovi WHERE datum=?");
            dajBitneTaskove = conn.prepareStatement("SELECT * FROM taskovi WHERE bitno=1");
            dajSveTaskove = conn.prepareStatement("SELECT * FROM taskovi");
            dodajTask = conn.prepareStatement("INSERT INTO taskovi VALUES(?,?,?,?)");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void removeInstance() {
        if (instance == null) return;
        instance.close();
        instance = null;
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Zadatak dajTaskIzResultSeta(ResultSet rs) throws SQLException {
        return new Zadatak(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
    }

    public void dodajZadatak(String naziv, String datum, String vrijeme, int bitno){

            try {
                dodajTask.setString(1, naziv);
                dodajTask.setString(2, datum);
                dodajTask.setString(3, vrijeme);
                dodajTask.setInt(4,bitno);
                dodajTask.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }

    }

    public ArrayList<Zadatak> dajPoNazivu(String naziv) {
        ArrayList<Zadatak> rezultat = new ArrayList();
        try {
            dajTaskovePoNazivu.setString(1, naziv);
            ResultSet rs = dajTaskovePoNazivu.executeQuery();
            while (rs.next()) {
                Zadatak zadatak = dajTaskIzResultSeta(rs);
                rezultat.add(zadatak);
            }
            return rezultat;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public ArrayList<Zadatak> dajPoDatumu(String datum) {
        ArrayList<Zadatak> rezultat = new ArrayList();
        try {
            dajTaskovePoDatumu.setString(2, datum);
            ResultSet rs = dajTaskovePoDatumu.executeQuery();
            while (rs.next()) {
                Zadatak zadatak = dajTaskIzResultSeta(rs);
                rezultat.add(zadatak);
            }
            return rezultat;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public ArrayList<Zadatak> dajBitne() {
        ArrayList<Zadatak> rezultat = new ArrayList();
        try {

            ResultSet rs = dajBitneTaskove.executeQuery();
            while (rs.next()) {
                Zadatak zadatak = dajTaskIzResultSeta(rs);
                rezultat.add(zadatak);
            }
            return rezultat;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public ArrayList<Zadatak> dajSve() {
        ArrayList<Zadatak> rezultat = new ArrayList();
        try {
            ResultSet rs = dajSveTaskove.executeQuery();
            while (rs.next()) {
                Zadatak zadatak = dajTaskIzResultSeta(rs);
                rezultat.add(zadatak);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rezultat;
    }

}
