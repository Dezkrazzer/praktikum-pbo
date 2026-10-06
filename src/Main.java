// L0125105_Lazuardi Akbar Imani
public class Main {
    public static void main(String[] args) {
        Boboiboy boboiboyBaik = new BoboiboyHalilintar("Boboiboy Baik", 95);
        Boboiboy boboiboyJahat = new BoboiboyGempa("Boboiboy Jahat", 90);

        boboiboyBaik.serang();
        boboiboyBaik.serang("Pedang Halilintar!");
        boboiboyBaik.serang(boboiboyJahat, 50);

        boboiboyBaik.belajar();
        boboiboyJahat.ujian();

        BoboiboyGempa gempa = new BoboiboyGempa("Boboiboy Gempa", 85);
        BoboiboyHalilintar halilintar = new BoboiboyHalilintar("Boboiboy Halilintar", 90);
        BoboiboyTopan topan = new BoboiboyTopan("Boboiboy Topan", 80);

        Boboiboy[] daftarBoboiboys = new Boboiboy[3];
        daftarBoboiboys[0] = gempa;
        daftarBoboiboys[1] = halilintar;
        daftarBoboiboys[2] = topan;

        for (Boboiboy boy : daftarBoboiboys) {
            boy.display();
            boy.gunaKuasa();
        }

        ((BoboiboyTopan) daftarBoboiboys[2]).terbang();

        halilintar.bersatu(topan);
        topan.bersatu(gempa);
        gempa.bersatu(halilintar);

        for (Boboiboy boy : daftarBoboiboys) {
            boy.display();
        }

        BoboiboyApi api = new BoboiboyApi("Boboiboy Api", 88, 90);
        api.display();
        api.gunaKuasa();

        api.setTingkatPanas(95);
        System.out.println("Tingkat panas setelah diatur: " + api.getTingkatPanas());
        api.bersatu(gempa);
        api.display();
    }
}
