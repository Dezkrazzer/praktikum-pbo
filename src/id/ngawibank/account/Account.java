package id.ngawibank.account;

public class Account {
    String namaPemilik;
    protected Card card;

    public Account(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }
}
