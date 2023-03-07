package TareaParcial2.ej3;

public class client {
    public static void main(String[] args) {
        store tienda = new store("Phone Store");
        tienda.addCelular(new celu("Hot 20S","Infinix","media",1200))
                .addCelular(new celu("Galaxy S8","Samsung","media",800))
                .addCelular(new celu("IPhone 14", "Apple","Alta",12000))
                .addCelular(new celu("Galaxy s7","Samsung","Baja",700))
                .addCelular(new celu("X3","Poco","Media",1000))
                .addCelular(new celu("M3","Sony","Baja",500));
        if(tienda.getCelist().size() <= 5){
            tienda.setStrategy(new aless());
        }else {
            tienda.setStrategy(new alot());
        }
        tienda.ordenamiento();
    }
}
