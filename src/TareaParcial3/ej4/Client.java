package TareaParcial3.ej4;

public class Client {
    public static void main (String []args){
        ServerProxy fileServer = new ServerProxy("10.20.10.10","8080","500TB");
        fileServer.uploadUsuario(new Usuario("lutyvr02","asdasds"));
        fileServer.uploadUsuario(new Usuario("Bussy888","asdasdasd"));
        fileServer.uploadUsuario(new Usuario("Trevor","asdsadas"));
        fileServer.uploadUsuario(new Usuario("EnzoFernandez","asdsadas"));
        fileServer.showAllFile();
    }
}
