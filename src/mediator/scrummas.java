package mediator;

public class scrummas extends pro{
    private String certificaciones;
    public scrummas(ichannel canalComunication) {
        super(canalComunication);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Sus certificaciones son: "+certificaciones);
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public scrummas setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
        return this;
    }
}
