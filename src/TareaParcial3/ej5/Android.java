package TareaParcial3.ej5;

public class Android implements IEmpresa1 {
    private int bateria = 12;

    @Override
    public void login() {
        System.out.println("Bienvenido usuario de Android!");
    }

    @Override
    public void logout() {
        System.out.println("Saliendo del sistema operativo Android, ten un buen dia");
    }

    @Override
    public void reportes() {
        System.out.println("La bateria es de: "+ bateria+'%');
    }
}
