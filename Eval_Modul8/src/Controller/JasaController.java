package Controller;

import Model.Jasa;
import Model.JasaDAO;
import View.JasaView;

public class JasaController {
    private final JasaDAO dao = new JasaDAO();
    private final JasaView view = new JasaView();

    public void run() {
        boolean jalan = true;
        while (jalan) {
            switch (view.menu()) {
                case 1 -> dao.insert(view.inputJasa());
                case 2 -> view.tampil(dao.findAll());
                case 3 -> view.detail(dao.findByName(view.cariKeyword()));
                case 4 -> {
                    int id = view.inputId();
                    Jasa jasa = view.inputJasa();
                    jasa.setId(id);
                    dao.update(jasa);
                }
                case 5 -> dao.delete(view.inputId());
                case 6 -> {
                    jalan = false;
                    System.out.println("Program selesai. Terima kasih!");
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
