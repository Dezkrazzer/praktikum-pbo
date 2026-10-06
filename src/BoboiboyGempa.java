// L0125105_Lazuardi Akbar Imani
public class BoboiboyGempa extends Boboiboy {
    String tipeKuasa = "Kuasa Gempa";

    public BoboiboyGempa(String nama) {
        super(nama, "Gempa", 85);
    }

    public BoboiboyGempa(String nama, int kekuatan) {
        super(nama, "Gempa", kekuatan);
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
        System.out.println(this.nama + " menyerang dengan Tanah Pelindung!");
    }

    @Override
    public void bersatu(Boboiboy lain) {
        this.kekuatan += lain.kekuatan;
        this.kekuatan = Math.ceilDiv(this.kekuatan, 2);
        System.out.println(this.nama + " bersatu dengan " + lain.nama + "! Memperkuat daya tahan bumi (Kekuatan gabungan: " + this.kekuatan + ")");
    }
}
