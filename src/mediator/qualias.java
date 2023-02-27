package mediator;

public class qualias extends pro{
    private String grado;
    public qualias(ichannel canalComunication) {
        super(canalComunication);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("el grado es: "+grado);
    }

    public String getGrado() {
        return grado;
    }

    public qualias setGrado(String grado) {
        this.grado = grado;
        return this;
    }
}
