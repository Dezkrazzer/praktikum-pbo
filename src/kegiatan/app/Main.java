// Nama: Lazuardi Akbar Imani
// NIM: L0125105
// Kelas: Informatika 2025D
package kegiatan.app;

import kegiatan.model.Diskusi;
import kegiatan.model.Kegiatan;
import kegiatan.model.Presentasi;

public class Main {
    public static void main(String[] args) {
        Kegiatan[] kegiatan = createKegiatanArray();

        for (Kegiatan k : kegiatan) {
            System.out.println(k.ringkasan());
        }

        kegiatan[0].setJumlahPeserta(5);
        System.out.println(kegiatan[0].ringkasan());

        kegiatan[0].setJumlahPeserta(0);
        System.out.println(kegiatan[0].ringkasan());
    }

    private static Kegiatan[] createKegiatanArray() {
        Presentasi presentasi = new Presentasi("Demo Proyek", 3);
        Diskusi diskusi = new Diskusi("Forum Kelas", 10);

        return new Kegiatan[] { presentasi, diskusi };
    }
}
