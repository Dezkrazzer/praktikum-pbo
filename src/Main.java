// L0125105_Lazuardi Akbar Imani
public class Main {
    public static void main(String[] args) throws Exception {
        Pemain messi = new Pemain("Lionel Messi", 40, false);
        Pemain mbappe = new Pemain("Kylian Mbappe", 29, true);

        Sepatu nike = new Sepatu("Nike", 40, 100000);
        Sepatu asics = new Sepatu("Asics", 30, 200000);

        messi.pakaiSepatu(nike);
        messi.display();

        System.out.println("\n");

        mbappe.pakaiSepatu(asics);
        mbappe.display();

        System.out.println("\nTotal Pemain: " + Pemain.totalPemain);
    }
}