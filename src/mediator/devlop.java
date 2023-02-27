package mediator;

public class devlop extends pro{
    private String lenguaje;
    public devlop(ichannel ty) {
        super(ty);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("El lenguaje es: "+lenguaje);
    }
    public String getLenguaje() {
        return lenguaje;
    }

    public devlop setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
        return this;
    }
}

