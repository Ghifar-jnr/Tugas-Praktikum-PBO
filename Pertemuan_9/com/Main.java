package Pertemuan_9.com;

public class Main{
    public static void main(String[] args){
    //Membuat objek ATM
    ATM atm =new ATM("Jakarta");
    //MembuatobjekBankAccountmelaluiobjekATM
    ATM.BankAccount account = atm.new
    BankAccount("0011223344");
    //Menampilkansaldoawal
    account.displayAccountInfo();
    //Melakukandeposit
    account.deposit(1000000);
    account.displayAccountInfo();
    //Melakukanwithdraw
    account.withdraw(500000);
    account.displayAccountInfo();
}
}