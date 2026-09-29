package id.ngawibank;

import id.ngawibank.account.Account;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Account alfian = new Account("Alfian");
        System.out.println(alfian.getNamaPemilik());
    }
}