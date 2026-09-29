package id.ngawibank.business;

import id.ngawibank.account.Account;
import id.ngawibank.account.Card;

public class BusinessAccount extends Account {
    BusinessAccount(String namaBisnis) {
        super(namaBisnis);
        this.card = new Card();
    }
}
