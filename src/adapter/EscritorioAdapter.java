package adapter;
public class EscritorioAdapter implements IEmpresa1{

    private Escritorio escri = new Escritorio();

    public EscritorioAdapter(Escritorio escri) {
        this.escri = escri;
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
