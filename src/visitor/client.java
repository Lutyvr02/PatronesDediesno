package visitor;
public class client {
    public static void main(String[] args) {
        turis tu = new turis();
        boliviano bob = new boliviano();
        bob.libreCambio(tu, 31231123);

        estadounidense sus = new estadounidense();
        sus.libreCambio(tu, 312312312);

        europeo eu = new europeo();
        eu.libreCambio(tu, 123113123);
    }
}
