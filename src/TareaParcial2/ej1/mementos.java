package TareaParcial2.ej1;

public class mementos {
    private TareaParcial2.ej1.tesis tesis;
    private int nrorev;

    public mementos(TareaParcial2.ej1.tesis tesis, int nDeRevision){
        this.tesis = tesis;
        this.nrorev = nDeRevision;
    }
    public tesis getTesis(){
        return  tesis;
    }
}
