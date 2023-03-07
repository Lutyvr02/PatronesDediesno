package TareaParcial2.ej6;

public interface ichannel {
    ichannel suscribirte(programador dev);
    ichannel quitarsubscripcion(programador dev);
    void enviarde1a1(String mensaje, persona em, persona re );
    void enviar1aTodos(String mensaje, persona ty);
}
