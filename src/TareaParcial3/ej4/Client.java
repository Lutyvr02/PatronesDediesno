package TareaParcial3.ej4;

public class Client {
    //contraseña de 8 caracteres de palabras y letras
    public static void main (String []args){
        ServerProxy fileServer = new ServerProxy("10.20.10.10","8080","500TB");
        fileServer.uploadUsuario(new Usuario("lutyvr02","Stream12"));
        fileServer.uploadUsuario(new Usuario("Bussy888","Stream12"));
        fileServer.uploadUsuario(new Usuario("Trevor","Stream12"));
        fileServer.uploadUsuario(new Usuario("EnzoFernandez","Stream12"));
        fileServer.MostrarUsuario();
    }
}
