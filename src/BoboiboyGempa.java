public class BoboiboyGempa extends Boboiboy {
    String tipeKuasa = "Kuasa Gempa";

    public BoboiboyGempa(String nama) {
        super(nama);
        this.nama = "Gempa";
    }

    @Override 
    public void display() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Kuasa: " + this.tipeKuasa);
    }

    @Override 
    public void gunaKuasa() {
        System.out.println(this.nama + " menggunakan dengan Tanah Pelindung!");
    }
}
