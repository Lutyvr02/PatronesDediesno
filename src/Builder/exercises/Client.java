package Builder.exercises;

public class Client {
    public static void main(String[] args) {

        ensamblador luty = new ensamblador();

        I9 i9 = new I9();
        luty.setBuild(i9);
        luty.ensamblarComputadora();
        Compu maquina1 = luty.getComputadoraEnsamblada();


        I7 i7 = new I7();
        luty.setBuild(i7);
        luty.ensamblarComputadora();
        Compu maquina2 = luty.getComputadoraEnsamblada();

        I5 i5 = new I5();
        luty.setBuild(i5);
        luty.ensamblarComputadora();
        Compu maquina3 = luty.getComputadoraEnsamblada();

        maquina1.showInf();
        maquina2.showInf();
        maquina3.showInf();


    }
}
