package state;

import java.util.ArrayList;
import java.util.List;
public class Compu {
    private List<String> programasAbiertos = new ArrayList<>();
    private procesador pro;
    private intestados state;
    private ram rm;

    public Compu(String nombreCPU, String nombreRAM) {
        state = new apagado();
        pro = new procesador(nombreCPU);
        rm = new ram(nombreRAM);
    }

    public void showInfo() {
        System.out.println("PC: ");
        System.out.println("Los programas abieros son: "+ programasAbiertos.size());
        rm.showInfo();
        pro.showInfo();
    }

    public List<String> getProgramasAbiertos() {
        return programasAbiertos;
    }
    public void changeState(intestados state) {
        this.state = state;
        state.cambiarComponentes(this);
    }

    public void setProgramasAbiertos(List<String> programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public procesador getPro() {
        return pro;
    }

    public void setPro(procesador pro) {
        this.pro = pro;
    }

    public ram getRm() {
        return rm;
    }

    public void setRm(ram rm) {
        this.rm = rm;
    }
}
