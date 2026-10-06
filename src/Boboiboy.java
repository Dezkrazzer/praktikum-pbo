// L0125105_Lazuardi Akbar Imani
public abstract class Boboiboy implements Kekuatan, Akademik {
    protected String nama;
    protected String elemen;
    protected int kekuatan;
    protected int health = 100;

    public Boboiboy(String nama, String elemen, int kekuatan) {
        this.nama = nama;
        this.elemen = elemen;
        this.kekuatan = kekuatan;
        this.health = 100;
    }

    public Boboiboy(String nama, String elemen) {
        this(nama, elemen, 80);
    }

    public Boboiboy(String elemen, int kekuatan) {
        this("Boboiboy " + elemen, elemen, kekuatan);
    }

    public Boboiboy(String nama) {
        this(nama, "Biasa", 75);
    }

    public void display() {
        System.out.println("Nama     : " + this.nama);
        System.out.println("Elemen   : " + this.elemen);
        System.out.println("Kekuatan : " + this.kekuatan);
        System.out.println("Health   : " + this.health);
    }

    public void serang() {
        System.out.println(this.nama + " sedang menyerang!");
    }

    public void serang(String jurus) {
        if (jurus.endsWith("!")) {
            System.out.println(this.nama + " menyerang menggunakan " + jurus);
        } else {
            System.out.println(this.nama + " menyerang menggunakan " + jurus + "!");
        }
    }

    @Override
    public void serang(Boboiboy target, int damage) {
        target.health -= damage;
        if (target.health < 0) {
            target.health = 0;
        }
        System.out.println(this.nama + " menyerang " + target.nama + " dengan damage: " + damage);
        System.out.println(" -> Sisa health " + target.nama + ": " + target.health);
    }

    @Override
    public void belajar() {
        System.out.println(this.nama + " sedang belajar bersama Yaya dan Gopal di Sekolah Rendah Pulau Rintis.");
    }

    @Override
    public void ujian() {
        System.out.println(this.nama + " sedang mengerjakan ujian sekolah Pulau Rintis.");
    }

    public abstract void gunaKuasa();
    public abstract void bersatu(Boboiboy lain);
}
