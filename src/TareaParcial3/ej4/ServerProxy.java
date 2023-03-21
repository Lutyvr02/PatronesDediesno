package TareaParcial3.ej4;


public class ServerProxy implements IServer {
    private int ty = 1;
    private ManejaUsuarios ServidorPar;
    private ManejaUsuarios ServidorImpar;

    public ServerProxy(String ip, String port, String size) {
        this.ServidorPar = new ManejaUsuarios(ip, port, size);
        this.ServidorImpar = new ManejaUsuarios("10.10.10.8", "9091", "5TB");
    }

    @Override
    public void uploadUsuario(Usuario user) {
        if (ty%2==0) {
            System.out.println("El usuario: "+user.getNombreUser()+ ", con la contraseña: " + user.getPassword()+" " +
                    "sera llevado al servidor (De pares) 2");
            this.ServidorPar.uploadUsuario(user);
        } else {
            System.out.println("El usuario: "+user.getNombreUser()+ ", con la contraseña: " + user.getPassword()+" " +
                    "sera llevado al servidor (De impares) 1");
            this.ServidorImpar.uploadUsuario(user);
        }
        ty++;
    }

    public void MostrarUsuario() {
        System.out.println("Usuarios Guardados en el servidor 1 (Impares) >>");
        for (Usuario usuario : this.ServidorImpar.getAlmacen()) {
            usuario.show();
        }
        System.out.println("Usuarios Guardados en el servidor 2 (pares)>>");
        for (Usuario usuario : this.ServidorPar.getAlmacen()) {
            usuario.show();
        }

    }
}