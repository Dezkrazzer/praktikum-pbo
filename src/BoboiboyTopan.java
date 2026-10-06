public class BoboiboyTopan extends Boboiboy {
    String tipeKuasa = "Kuasa Topan";

    public BoboiboyTopan(String nama) {
        super(nama);
        this.nama = "Topan";
    }

    @Override 
    public void display() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Kuasa: " + this.tipeKuasa);
    }

    @Override 
    public void gunaKuasa() {
        System.out.println(this.nama + " menggunakan dengan Pusaran Taufan!");
    }

    public void terbang() {
        System.out.println(this.nama + " terbang menggunakan hoverboard!");
    }
}
