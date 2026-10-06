public class BoboiboyHalilintar extends Boboiboy {
    String tipeKuasa = "Kuasa Halilintar";

    public BoboiboyHalilintar(String nama) {
        super(nama);
        this.nama = "Halilintar";
    }
    
    @Override 
    public void display() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Kuasa: " + this.tipeKuasa);
    }

    @Override 
    public void gunaKuasa() {
        System.out.println(this.nama + " menggunakan dengan Pedang Halilintar!");
    }
}
