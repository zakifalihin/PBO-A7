package Model;

import Database.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JasaDAO {
    private Connection conn;

    public JasaDAO() {
        try { conn = DatabaseConnection.getConnection(); }
        catch (SQLException e) { e.printStackTrace(); }
    }

    public void insert(Jasa j) {
        try (PreparedStatement s = conn.prepareStatement("INSERT INTO jasa (nama_jasa, deskripsi, harga) VALUES (?, ?, ?)")) {
            s.setString(1, j.getNama());
            s.setString(2, j.getDeskripsi());
            s.setDouble(3, j.getHarga());
            s.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public List<Jasa> findAll() {
        List<Jasa> list = new ArrayList<>();
        try (Statement s = conn.createStatement(); ResultSet r = s.executeQuery("SELECT * FROM jasa")) {
            while (r.next())
                list.add(new Jasa(r.getInt(1), r.getString(2), r.getString(3), r.getDouble(4)));
        } catch (SQLException e) { e.printStackTrace(); }
        return list;
    }

    public Jasa findByName(String name) {
        try (PreparedStatement s = conn.prepareStatement("SELECT * FROM jasa WHERE nama_jasa LIKE ?")) {
            s.setString(1, "%" + name + "%");
            ResultSet r = s.executeQuery();
            if (r.next())
                return new Jasa(r.getInt(1), r.getString(2), r.getString(3), r.getDouble(4));
        } catch (SQLException e) { e.printStackTrace(); }
        return null;
    }

    public void update(Jasa j) {
        try (PreparedStatement s = conn.prepareStatement("UPDATE jasa SET nama_jasa=?, deskripsi=?, harga=? WHERE id_jasa=?")) {
            s.setString(1, j.getNama());
            s.setString(2, j.getDeskripsi());
            s.setDouble(3, j.getHarga());
            s.setInt(4, j.getId());
            s.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void delete(int id) {
        try (PreparedStatement s = conn.prepareStatement("DELETE FROM jasa WHERE id_jasa=?")) {
            s.setInt(1, id);
            s.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }
}
