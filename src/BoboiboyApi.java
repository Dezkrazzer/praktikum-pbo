// L0125105_Lazuardi Akbar Imani
public class BoboiboyApi extends Boboiboy {
    String tipeKuasa = "Kuasa Api";
    private int tingkatPanas;

    public BoboiboyApi(String nama) {
        super(nama, "Api", 85);
        this.tingkatPanas = 75;
    }

    public BoboiboyApi(String nama, int kekuatan, int tingkatPanas) {
        super(nama, "Api", kekuatan);
        setTingkatPanas(this.tingkatPanas);
    }

    public int getTingkatPanas() {
        return this.tingkatPanas;
    }

    public void setTingkatPanas(int tingkatPanas) {
        this.tingkatPanas = tingkatPanas;
    }

    @Override
    public void display() {
        System.out.println("Nama         : " + this.nama);
        System.out.println("Kuasa        : " + this.tipeKuasa);
        System.out.println("Elemen       : " + this.elemen);
        System.out.println("Kekuatan     : " + this.kekuatan);
        System.out.println("Tingkat panas: " + this.tingkatPanas);
        System.out.println("Health       : " + this.health);
    }

    @Override
    public void gunaKuasa() {
        System.out.println(this.nama + " menyerang dengan Ledakan Api! (Tingkat panas: " + this.tingkatPanas + ")");
    }

    @Override
    public void bersatu(Boboiboy lain) {
        this.kekuatan += lain.kekuatan;
        this.kekuatan = Math.ceilDiv(this.kekuatan, 2);
        setTingkatPanas(Math.min(100, this.tingkatPanas + 10));
        System.out.println(this.nama + " bersatu dengan " + lain.nama
                + "! Api menjadi semakin panas (Kekuatan gabungan: " + this.kekuatan
                + ", Tingkat panas: " + this.tingkatPanas + ")");
    }
}
