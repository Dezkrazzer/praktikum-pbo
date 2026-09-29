package id.ngawibank.account;

public class Account {
    String namaPemilik;
    Card card;

    public Account(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        card = new Card();
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }
}
