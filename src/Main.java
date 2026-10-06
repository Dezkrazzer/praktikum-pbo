public class Main {
    public static void main(String[] args) throws Exception {
        
        // Compile Time Polymorph
        Boboiboy boboiboyBaik = new Boboiboy("Boboiboy Baik");
        Boboiboy boboiboyJahat = new Boboiboy("Boboiboy Jahat");

        boboiboyBaik.serang();
        boboiboyBaik.serang("Pedang Halilintar!");
        boboiboyBaik.serang(boboiboyJahat, 50);

        // Run-time Polymorph
        
    }
}
