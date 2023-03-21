package TareaParcial3.ej5;

public class AplicacionWebAdapter implements IEmpresa1 {

    private AplicacionWeb escri = new AplicacionWeb();

    public AplicacionWebAdapter(AplicacionWeb web) {
        this.escri = web;
    }
    @Override
    public void login() {
        escri.iniciarSesion();
    }

    @Override
    public void logout() {
        escri.cerrarSesion();
    }

    @Override
    public void reportes() {
        escri.generarDatos();
    }
}
