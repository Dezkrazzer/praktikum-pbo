public class Boboiboy {
    String nama;
    String elemen;

    public Boboiboy(String nama) {
        this.nama = nama;
    }

    public Boboiboy(String nama, String elemen) {
        this.nama = nama;
        this.elemen = elemen;
    }

    public void display() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Eemen: " + this.elemen);
    }

    public void serang() {
        System.out.println(this.nama + " sedang menyerang!");
    }

    public void serang(String jurus) {
        System.out.println(this.nama + " menyerang menggunakan " + jurus + "!");
    }

    public void serang(Boboiboy target, int damage) {
        System.out.println(this.nama + " menyerang " + target.nama + " dengan damage: " + damage);
    }

    public void gunaKuasa() {
        System.out.println(this.nama + " menggunakan kuasa");
    }
}
