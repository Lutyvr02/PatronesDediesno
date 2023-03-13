package proxy;

public class Client {
    public static void main(String[] args){
        // Account should be a singleton
        debito dc = new debito("Luciano");

        dc.showAccount();
        dc.deposit(100, Currency.USD);
        dc.showAccount();

        dc.withdraw(20, Currency.BOB);
        dc.withdraw(1, Currency.USD);
        dc.withdraw(30, Currency.GBP);
        dc.withdraw(50, Currency.EUR);
    }
}
