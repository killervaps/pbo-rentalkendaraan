public class Penyewa {
    private String nama;
    private Kendaraan kendaraan;
    private int durasiSewa; // dalam hari

    public Penyewa(String nama, Kendaraan kendaraan, int durasiSewa) {
        this.nama = nama;
        this.kendaraan = kendaraan;
        this.durasiSewa = durasiSewa;
    }

    public String getInfo() {
        return "Nama Penyewa: " + nama + ", Kendaraan: [" + kendaraan.getInfo() + 
               "], Durasi Sewa: " + durasiSewa + " hari";
    }
}
