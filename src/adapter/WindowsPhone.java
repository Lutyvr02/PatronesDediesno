package adapter;

public class WindowsPhone implements IEmpresa1{

    private int bateria = 12;

    @Override
    public void login() {
        System.out.println("Bienvenido usuario de WindowsPhone!");
    }

    @Override
    public void logout() {
        System.out.println("Saliendo del sistema operativo Windows Phone, ten un buen dia");
    }

    @Override
    public void reportes() {
        System.out.println("La bateria es de: "+ bateria+'%');
    }
}