package kegiatan.model;

public class Diskusi extends Kegiatan {
    public Diskusi(String nama, int jumlahPeserta) {
        super(nama, jumlahPeserta);
    }

    @Override
    protected int hitungDurasiMenit() {
        int kelompok = (int) Math.ceil(getJumlahPeserta() / 4.0);
        return 15 * kelompok;
    }
}
