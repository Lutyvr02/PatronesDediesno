package visitor;

public class turis implements iviaj{
    @Override
    public void convertirDinero(double euro, europeo europa) {
        System.out.println("la cantidad de: "+euro+"€ son en bolivianos: "+euro*7.38);
        System.out.println("la cantidad de: "+euro+"€ son en dolares: "+euro*1.07);
    }

    @Override
    public void convertirDinero(double dolar, estadounidense eeuu) {
        System.out.println("la cantidad de: "+dolar+"$us son en euros: "+dolar*0.94);
        System.out.println("la cantidad de: "+dolar+"$us son en bolivianos"+dolar*6.96);
    }

    @Override
    public void convertirDinero(double bolviano, boliviano bolivia) {
        System.out.println("la cantidad de: "+bolviano+"Bs. son en dolares: "+bolviano*0.14);
        System.out.println("la cantidad de: "+bolviano+"Bs. son en euros: "+bolviano*0.13);
    }
}
