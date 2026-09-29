package id.ngawibank.account;
import java.util.UUID;

public class Account {
    String namaPemilik;
    protected Card card;
    @SuppressWarnings("FieldMayBeFinal")
    private String noRekening;

    public Account(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        this.noRekening = UUID.randomUUID().toString();
        this.card = new Card();
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getNoRekening() {
        return noRekening;
    }
}
