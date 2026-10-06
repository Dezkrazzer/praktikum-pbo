public class Main {
    public static void main(String[] args) throws Exception {
        
        // Compile Time Polymorph
        Boboiboy boboiboyBaik = new Boboiboy("Boboiboy Baik");
        Boboiboy boboiboyJahat = new Boboiboy("Boboiboy Jahat");

        boboiboyBaik.serang();
        boboiboyBaik.serang("Pedang Halilintar!");
        boboiboyBaik.serang(boboiboyJahat, 50);

        // Run-time Polymorph
        BoboiboyGempa gempa = new BoboiboyGempa("Boboiboy Gempa");
        BoboiboyHalilintar halilintar = new BoboiboyHalilintar("Boboiboy Halilintar");
        BoboiboyTopan topan = new BoboiboyTopan("Boboiboy Topan");

        gempa.display();
        gempa.gunaKuasa();
        topan.terbang();

        Boboiboy[] daftarBoboiboys = new Boboiboy[3];
        daftarBoboiboys[0] = gempa;
        daftarBoboiboys[1] = halilintar;
        daftarBoboiboys[2] = topan;

        for(Boboiboy boy : daftarBoboiboys) {
            boy.display();
            boy.gunaKuasa();
        }

        ((BoboiboyTopan)daftarBoboiboys[2]).terbang();
    }
}
