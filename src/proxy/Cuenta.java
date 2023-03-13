package proxy;

public class Cuenta implements IServer{

    private String owner;
    private int number;
    private double balance;

    public Cuenta(String owner, int number, double balance) {
        this.owner = owner;
        this.number = number;
        this.balance = balance;
    }

    public void showAccount(){
        System.out.println("Cuenta: ");
        System.out.println("Nro: "+number);
        System.out.println("su propietario es: "+owner);
        System.out.println("el balance es: "+balance);
    }

    public String getOwner() {
        return owner;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    private void showBalance(){
        System.out.println("El balance es de: "+balance+"bs");
    }

    public void addMoney(double amount){
        balance += amount;
        System.out.println("El monto: "+amount+"bs");
        showBalance();
    }

    @Override
    public void withdraw(double amount, Currency currency) {
        if (balance >= amount){
            balance -= amount;
            System.out.println("Usted ha retirado "+amount+" bolivianos de su cuenta");
            showBalance();
        } else {
            System.out.println("Los fondos de su cuenta son insuficientes");
        }
    }
}