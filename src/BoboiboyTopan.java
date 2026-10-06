// L0125105_Lazuardi Akbar Imani
public class BoboiboyTopan extends Boboiboy {
    String tipeKuasa = "Kuasa Topan";

    public BoboiboyTopan(String nama) {
        super(nama, "Topan", 80);
    }

    public BoboiboyTopan(String nama, int kekuatan) {
        super(nama, "Topan", kekuatan);
    }

    @Override
    public void display() {
        System.out.println("Nama     : " + this.nama);
        System.out.println("Kuasa    : " + this.tipeKuasa);
        System.out.println("Elemen   : " + this.elemen);
        System.out.println("Kekuatan : " + this.kekuatan);
        System.out.println("Health   : " + this.health);
    }

    @Override
    public void gunaKuasa() {
        System.out.println(this.nama + " menyerang dengan Pusaran Taufan!");
    }

    public void terbang() {
        System.out.println(this.nama + " terbang menggunakan hoverboard!");
    }

    @Override
    public void bersatu(Boboiboy lain) {
        int temp = lain.kekuatan;
        lain.kekuatan = this.kekuatan;
        this.kekuatan = temp;
        System.out.println(this.nama + " bertukar kekuatan dengan " + lain.nama + "! (Kekuatan Topan: " + this.kekuatan + ", Kekuatan " + lain.nama + ": " + lain.kekuatan + ")");
    }
}
