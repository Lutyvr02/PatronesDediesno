package state;
import java.util.List;
import java.util.Random;

public class encendido implements intestados{
    @Override
    public void cambiarComponentes(Compu pc) {
        System.out.println("Encendiendo pc");
        List<String> programasAbiertos = List.of("Opera Gx", "Discord","Spotify","Fallout 2","microsoft edge","Warframe");
        Random random = new Random();

        int programas = random.nextInt(9)+1;
        double consumoRAM = pc.getRm().getConsumo();
        double consumoCPU = pc.getPro().getConsumo();

        for(int p = 0; p < programas;p++ ){
            System.out.println("ejecutando el programa: "+programasAbiertos.get(p));
            pc.getProgramasAbiertos().add(programasAbiertos.get(p));
            try {
                Thread.sleep(1500);
                consumoCPU += 5;
                pc.getPro().setConsumo(consumoCPU);
                consumoRAM += 5;
                pc.getRm().setConsumo(consumoRAM);
                pc.showInfo();
            }catch (InterruptedException exception){
                exception.printStackTrace();
            }
        }
        System.out.println("Inicio de sesion");
    }
}
