package kegiatan.model;

public class Presentasi extends Kegiatan {
    public Presentasi(String nama, int jumlahPeserta) {
        super(nama, jumlahPeserta);
    }

    @Override
    protected int hitungDurasiMenit() {
        return 10 + 5 * getJumlahPeserta();
    }
}
