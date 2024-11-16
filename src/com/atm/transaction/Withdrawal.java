package src.com.atm.transaction;

import src.com.atm.model.Account;
import java.util.Scanner;

public class Withdrawal extends Transaction {
    public Withdrawal(Account account) {
        super(account);
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah penarikan: ");
        double amount = scanner.nextDouble();

        if (account.getBalance() - amount >= Account.MINIMUM_BALANCE) {
            account.debit(amount);
            System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + account.getBalance());
        } else if (amount > account.getBalance()) {
            account.debit(amount);
            System.out.println("Saldo Anda Tidak Mencukupi.");
        } else {
            System.out.println("Penarikan Gagal. Anda Harus Menyisakan Minimum Saldo Rp" + Account.MINIMUM_BALANCE + "-");
        }
    }

}
