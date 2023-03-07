package TareaParcial2.ej1;

public class tesis {
    private String nombreArchivo;
    private String cambios;

    public tesis(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void showInfo(){
        System.out.println("tesis");
        System.out.println("Nombre: "+nombreArchivo);
        System.out.println("Cambios: "+cambios);
    }
}
