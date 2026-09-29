package id.ngawibank;

import id.ngawibank.account.Account;

public class Main {
    public static void main(String[] args) throws Exception {
        Account alfian = new Account("Alfian");
        System.out.println(alfian.getNamaPemilik());
        System.out.println(alfian.getNoRekening());
    }
}