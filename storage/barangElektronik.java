package storage;

public class barangElektronik extends Barang {
    private String garansi;

    public barangElektronik(String nama, String kode, int stok, String garansi) {
        super(nama, kode, stok);
        this.garansi = garansi;
    }

    public String getGaransi() {
        return garansi;
    }

    @Override
    public String toString() {
        return String.format("%-15s | %-10s | %-5d | Garansi: %s",
                getNama(), getKode(), getStok(), garansi);
    }
}