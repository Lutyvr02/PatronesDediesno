package adapter;

public class AplicacionWeb implements IEmpresa2{

    int bandaAncha = 12;

    @Override
    public void iniciarSesion() {
        System.out.println("Buenas usuario web!");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Saliendo del sistema de pestañas, ten un buen dia");
    }

    @Override
    public void generarDatos() {
        System.out.println("La banda ancha es de: "+ bandaAncha+"Hz");
    }
}
