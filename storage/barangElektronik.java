package storage;

import java.util.ArrayList;

public class BarangElektronik extends Barang {

    private String jenisElektronik; 

    public BarangElektronik(String kodeBarang, String namaBarang, int stok, String jenisElektronik) {
        super(kodeBarang, namaBarang, stok); 
        this.jenisElektronik = jenisElektronik;
    }

    public BarangElektronik(String kodeBarang, String namaBarang, int stok) {
        super(kodeBarang, namaBarang, stok);
        this.jenisElektronik = "Elektronik Umum";
    }

    public String getJenisElektronik() {
        return jenisElektronik;
    }

    public void setJenisElektronik(String jenisElektronik) {
        this.jenisElektronik = jenisElektronik;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Kategori: Elektronik");
        System.out.println("Jenis: " + jenisElektronik);
    }

    public static void tampilkanBarangElektronik(ArrayList<Barang> daftarBarang) {
        System.out.println("=== DAFTAR BARANG ELEKTRONIK ===");

        for (Barang b : daftarBarang) {
            if (b instanceof BarangElektronik) {
                BarangElektronik be = (BarangElektronik) b;
                be.tampilInfo();
                System.out.println("----------------------");
            }
        }
    }
}

public class barangElektronik extends Barang{
    private String garansi;

}