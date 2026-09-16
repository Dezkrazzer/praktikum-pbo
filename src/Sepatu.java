// L0125105_Lazuardi Akbar Imani
public class Sepatu {
    String merk;
    int ukuran;
    float harga;

    Sepatu(String merk, int ukuran, float harga) {
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    void display() {
        System.out.println("Sepatu merk " + merk);
        System.out.println("Sepatu ukuran " + ukuran);
        System.out.println("Sepatu harga Rp" + harga);
    }
}
