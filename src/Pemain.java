// L0125105_Lazuardi Akbar Imani
public class Pemain {

    String nama;
    int umur;
    boolean aktifMain;

    Sepatu sepatu;

    static int totalPemain = 0;

    Pemain(String nama, int umur, boolean aktifMain) {
        this.nama = nama;
        this.umur = umur;
        this.aktifMain = aktifMain;
        totalPemain++;
    }

    void pakaiSepatu(Sepatu sepatu) {
        this.sepatu = sepatu;
    }

    void display() {
        System.out.println("Nama Pemain: " + nama);
        System.out.println("Umur Pemain: " + umur);
        System.out.println("Status Aktif Main: " + (this.aktifMain ? "Aktif" : "Tidak Aktif"));
        this.sepatu.display();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
