package TareaParcial2.ej1;

public class estadosguardados {
    private tesis ty;
    public void setEst(tesis ty){
        this.ty = new tesis(ty.getNombreArchivo());
        this.ty.setCambios(ty.getCambios());
    }
    public mementos newEst(int nrorev){
        return new mementos(this.ty,nrorev);
    }
    public tesis restoreEst(mementos mem){
        this.ty = mem.getTesis();
        return this.ty;
    }
}
