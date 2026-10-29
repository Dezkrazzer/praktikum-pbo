package kegiatan.model;

public abstract class Kegiatan implements Ringkasan {
    private final String nama;
    private int jumlahPeserta;

    protected Kegiatan(String nama, int jumlahPeserta) {
        this.nama = nama;
        this.jumlahPeserta = jumlahPeserta;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahPeserta() {
        return jumlahPeserta;
    }

    public void setJumlahPeserta(int jumlahPeserta) {
        if (jumlahPeserta >= 1) {
            this.jumlahPeserta = jumlahPeserta;
        }
    }

    @Override
    public String ringkasan() {
        return getNama() + " | Peserta: " + getJumlahPeserta() + " | Menit: " + hitungDurasiMenit();
    }

    protected abstract int hitungDurasiMenit();
}
