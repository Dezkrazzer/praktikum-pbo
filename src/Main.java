import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

enum TipeFile {
    DOKUMEN, VIDEO, FOTO, AUDIO
}

class File {
    private String id;
    private String nama;
    private int ukuranKB;
    private TipeFile tipe;

    public File(String id, String nama, int ukuranKB, TipeFile tipe) {
        this.id = id;
        this.nama = nama;
        this.ukuranKB = ukuranKB;
        this.tipe = tipe;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public int getUkuranKB() {
        return ukuranKB;
    }

    public TipeFile getTipe() {
        return tipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Objects.equals(id, file.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "File{" +
                "id='" + id + '\'' +
                ", nama='" + nama + '\'' +
                ", ukuranKB=" + ukuranKB +
                ", tipe=" + tipe +
                '}';
    }
}



public class Main {
    public static void main(String[] args) throws Exception {
        File file1 = new File("F01", "praktikum_docx", 100, TipeFile.DOKUMEN);
        File file2 = new File("F02", "daffa_x_alfian_full_percakapan.mp4", 2000, TipeFile.VIDEO);
        File file3 = new File("F03", "daffa_x_alfian_full_percakapan.mp3", 500, TipeFile.AUDIO);

        System.out.println("Nama: " + file1.getNama() + ", Ukuran: " + file1.getUkuranKB() + "KB, Tipe: " + file1.getTipe());
        System.out.println("Nama: " + file2.getNama() + ", Ukuran: " + file2.getUkuranKB() + "KB, Tipe: " + file2.getTipe());
        System.out.println("Nama: " + file3.getNama() + ", Ukuran: " + file3.getUkuranKB() + "KB, Tipe: " + file3.getTipe());

        ArrayList<File> folder = new ArrayList<File>();
        folder.add(file1);
        folder.add(file2);
        folder.add(file3);

        System.out.println("File ke-2: " + folder.get(1).getNama() + ", Ukuran: " + folder.get(1).getUkuranKB() + "KB, Tipe: " + folder.get(1).getTipe());

        //LinkedList
        LinkedList<File> recentFiles = new LinkedList<File>();
        recentFiles.add(file2);
        recentFiles.add(file1);
        recentFiles.addFirst(file3);

        System.out.println("Urutan recent files: " + recentFiles);

        //set, cant be duplicate
        Set<File> disk = new HashSet<>();
        disk.add(file1);


        File duplikat = new File("F01", "praktikum_docx", 100, TipeFile.DOKUMEN);
        disk.add(duplikat);

        System.out.println("Total file di disk: " + disk.size());
    }
}
