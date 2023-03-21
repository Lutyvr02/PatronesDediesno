package TareaParcial3.ej5;

public class Client {
    public static void main(String[] args) {
        WindowsPhone wp = new WindowsPhone();
        wp.login();
        wp.reportes();
        wp.logout();

       /* AplicacionWeb web = new AplicacionWeb();
        web.iniciarSesion();
        web.generarDatos();
        web.cerrarSesion();*/


        Escritorio escri = new Escritorio();

        IEmpresa1 adaptado = new EscritorioAdapter(escri);

        adaptado.login();
        adaptado.reportes();
        adaptado.logout();

        AplicacionWeb webi = new AplicacionWeb();
        IEmpresa1 adaptado2 = new AplicacionWebAdapter(webi);

        adaptado2.login();
        adaptado2.reportes();
        adaptado2.logout();
        

    }
}
