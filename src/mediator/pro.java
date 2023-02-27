package mediator;

public abstract class pro {
    protected ichannel ty;
    private String ci;
    private String name;

    public pro(ichannel ty){
        this.ty=ty;
    }

    public String getCi() {
        return ci;
    }

    public pro setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public String getName() {
        return name;
    }

    public pro setName(String name) {
        this.name = name;
        return this;
    }


    public void showInfo(){
        System.out.println("El ci es: "+ci);
        System.out.println("el nombre es: "+name);
    }

    public void send(String msg){
        ty.send(msg,this);
    }

    public void received(String msg) {
        this.showInfo();
        System.out.println("Informacion recibida: "+msg+"\n");
    }
}
