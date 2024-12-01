import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Kendaraan> listKendaraan;
    private List<Penyewa> listPenyewa;

    public RentalSystem() {
        listKendaraan = new ArrayList<>();
        listPenyewa = new ArrayList<>();
    }

    public void tambahKendaraan(Kendaraan k) {
        listKendaraan.add(k);
    }

    public void tambahPenyewa(Penyewa p) {
        listPenyewa.add(p);
    }

    public void tampilkanKendaraan() {
        System.out.println("Daftar Kendaraan Tersedia:");
        for (Kendaraan k : listKendaraan) {
            System.out.println(k.getInfo());
        }
    }

    public void tampilkanPenyewa() {
        System.out.println("Daftar Penyewa:");
        for (Penyewa p : listPenyewa) {
            System.out.println(p.getInfo());
        }
    }
}
