// L0125105_Lazuardi Akbar Imani
public class BoboiboyHalilintar extends Boboiboy {
    String tipeKuasa = "Kuasa Halilintar";

    public BoboiboyHalilintar(String nama) {
        super(nama, "Halilintar", 90);
    }

    public BoboiboyHalilintar(String nama, int kekuatan) {
        super(nama, "Halilintar", kekuatan);
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
        System.out.println(this.nama + " menyerang dengan Pedang Halilintar!");
    }

    @Override
    public void bersatu(Boboiboy lain) {
        this.kekuatan += lain.kekuatan;
        this.kekuatan = Math.ceilDiv(this.kekuatan, 2);
        this.elemen = 
            this.elemen.substring(0, Math.floorDiv(this.elemen.length(), 2)) + 
            lain.elemen.substring(Math.floorDiv(lain.elemen.length(), 2), lain.elemen.length());
        System.out.println(this.nama + " bersatu dengan " + lain.nama + "! Terbentuk elemen baru: " + this.elemen + " (Kekuatan gabungan: " + this.kekuatan + ")");
    }
}
