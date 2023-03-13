package proxy;

import java.util.Random;

public class debito implements IServer{

    private Cuenta account;

    public debito(String owner) {
        account = new Cuenta(owner, new Random().nextInt(50000), 0);
    }

    public void showAccount(){
        account.showAccount();
    }

    public void deposit(double amount, Currency currency){
        cambiodemoneda<Double, Currency> t = currencyVerifier(amount, currency);
        account.addMoney(t.first);
    }

    public Cuenta getAccount() {
        return account;
    }

    public void setAccount(Cuenta account) {
        this.account = account;
    }

    private cambiodemoneda<Double, Currency> currencyVerifier(double amount, Currency currency){
        Currency currencyF = currency;
        double amountF = amount;
        if(!currency.equals(Currency.BOB)){
            currencyF = Currency.BOB;
            amountF = amount * Currency.rate(currency, currencyF);
        }
        return new cambiodemoneda<>(amountF, currencyF);
    }

    @Override
    public void withdraw(double amount, Currency currency) {
        cambiodemoneda<Double, Currency> t = currencyVerifier(amount, currency);
        account.withdraw(t.first, t.second);
    }
}