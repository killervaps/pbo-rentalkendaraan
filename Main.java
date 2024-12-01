public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();

        // Tambahkan kendaraan
        rentalSystem.tambahKendaraan(new Mobil("Toyota", "Avanza", 2020, 4));
        rentalSystem.tambahKendaraan(new Motor("Yamaha", "NMax", 2022, 2));
        rentalSystem.tambahKendaraan(new Sepeda("Polygon", "BMX", 2019, "BMX"));

        // Tampilkan daftar kendaraan
        rentalSystem.tampilkanKendaraan();

        // Tambahkan penyewa
        Penyewa penyewa1 = new Penyewa("Andi", new Mobil("Toyota", "Avanza", 2020, 4), 7);
        Penyewa penyewa2 = new Penyewa("Budi", new Sepeda("Polygon", "BMX", 2019, "BMX"), 3);
        rentalSystem.tambahPenyewa(penyewa1);
        rentalSystem.tambahPenyewa(penyewa2);

        // Tampilkan daftar penyewa
        rentalSystem.tampilkanPenyewa();
    }
}
