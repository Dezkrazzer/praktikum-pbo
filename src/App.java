/*
    Nama: Lazuardi Akbar Imani
    NIM: L0125105
    Kelas: Informatika D
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("coba_tulis.txt"))) {
            bw.write("belajar IO");
            bw.newLine();
            bw.write("ini baris kedua");
            System.out.println("Write file berhasil");
        } catch (IOException e) {
            System.out.println("Write file gagal: " + e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("coba_tulis.txt", true))) {
            bw.newLine();
            bw.write("ini teks yang diappend");
        } catch (IOException e) {
            System.out.println("Append file gagal: " + e.getMessage());
        }

        File file = new File("coba_tulis.txt");
        System.out.println("Apakah filenya ada? " + file.exists());

        System.out.println("Baca file per baris");
        try (BufferedReader br = new BufferedReader(new FileReader("coba_tulis.txt"))) {
            String baris;
            while ((baris = br.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Baca file gagal: " + e.getMessage());
        }

        try (FileInputStream in = new FileInputStream("test.png"); FileOutputStream out = new FileOutputStream("test_copy.png")) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        } catch (IOException e) {
            System.out.println("Copy file gagal: " + e.getMessage());
        }

        File folder = new File("ini-folder-baru");
        System.out.println("Bikin folder: " + folder.mkdir());

        File FileBaru = new File("ini-folder-baru/ini-file-baru.txt");

        try {
            System.out.println("Bikin file: " + FileBaru.createNewFile());
        } catch (IOException e) {
            System.out.println("Bikin file gagal: " + e.getMessage());
        }
        
    }
}
