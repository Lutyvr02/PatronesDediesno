package FactoryMethod.homework;
/*numero vuelo
destino (pais, ciudad, aeropuerto)
origen (pais, ciudad, aeropuerto)
avion (marca,capacidad, modelo, numerodeAsientos)
pasajero (nombre,ci)
numero asiento
costo de pasaje*/
public class Infante implements IAlgo {

    public void setEspecial(int especial) {
        this.especial = especial;
    }

    public int getEspecial() {
        return especial;
    }

    private int especial;
    private Base base = new Base();

    private destino des = new destino();
    private origen ori = new origen();
    private avion avi = new avion();
    private pasajero pas = new pasajero();

    public void setPas(pasajero pas) {
        this.pas = pas;
    }

    public void setAvi(avion avi) {
        this.avi = avi;
    }

    public void setOri(origen ori) {
        this.ori = ori;
    }

    public void setDes(destino des) {
        this.des = des;
    }

    public avion getAvi() {
        return avi;
    }

    public pasajero getPas() {
        return pas;
    }

    public origen getOri() {
        return ori;
    }

    public destino getDes() {
        return des;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }


    @Override
    public void preparAlgo() {
        System.out.println("Mostrando....");
    }

    @Override
    public void showAlgo() {
        System.out.println(" ** Boleto standard **");
        base.showInfo();
        des.showAlgo();
        ori.showAlgo();
        avi.showAlgo();
        pas.showAlgo();
        System.out.println("Tiene el precio especial al infantes es de: "+especial);
    }
}