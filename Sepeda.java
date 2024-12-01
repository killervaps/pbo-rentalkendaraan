public class Sepeda extends Kendaraan {
    private String jenis;

    public Sepeda(String merk, String model, int tahunProduksi, String jenis) {
        super(merk, model, tahunProduksi); // Panggil konstruktor dari kelas Kendaraan
        this.jenis = jenis;
    }

    @Override
    public String getInfo() {
        return "Sepeda - Merk: " + merk + ", Model: " + model + 
               ", Tahun: " + tahunProduksi + ", Jenis: " + jenis;
    }
}
