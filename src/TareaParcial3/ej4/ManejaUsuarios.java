package TareaParcial3.ej4;

import java.util.ArrayList;
import java.util.List;

public class ManejaUsuarios implements IServer {
        private String ipHostName;
        private String port;
        private String limitStorage;
        private List<Usuario> almacen = new ArrayList<>();

    public ManejaUsuarios(String ipHostName, String port, String limitStorage) {
            this.ipHostName = ipHostName;
            this.port = port;
            this.limitStorage = limitStorage;
    }

        public String getIpHostName() {
            return ipHostName;
        }

        public void setIpHostName(String ipHostName) {
            this.ipHostName = ipHostName;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

        public String getLimitStorage() {
            return limitStorage;
        }

        public void setLimitStorage(String limitStorage) {
            this.limitStorage = limitStorage;
        }


        @Override
        public void uploadUsuario(Usuario file) {
            almacen.add(file);
            System.out.println();
            System.out.println("Usuario Guardado");
        }

        public void removeFile(Usuario user){
            almacen.remove(user);
        }

        public Usuario getFile(Usuario user){
            for (Usuario us: almacen) {
                if (us.getNombreUser().equals(user.getNombreUser()) && us.getPassword().equals(user.getPassword())){
                    return us;
                }
            }
            System.out.println("ERROR> el usuario no se encuentra en el servidor");
            return null;
        }
        public List<Usuario> getAlmacen() {
            return almacen;
        }
}
