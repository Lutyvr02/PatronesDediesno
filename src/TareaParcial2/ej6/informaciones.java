package TareaParcial2.ej6;

public class informaciones {
    private iestr es;

    public  informaciones(iestr estructurador){
        this.es =estructurador;
    }

    public String crearInforme(programador dev){
        return this.es.mensaje(dev);
    }
}
