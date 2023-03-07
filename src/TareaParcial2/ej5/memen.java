package TareaParcial2.ej5;

public class memen {
    private com commit;
    private String descripcion;
    private String fecha;

    public void setCommit(com commit) {
        this.commit = commit;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public com getCommit() {
        return commit;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public memen(com commit, String descripcion, String fecha) {
        this.commit = commit;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

}
