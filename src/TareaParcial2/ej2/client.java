package TareaParcial2.ej2;

public class client {
    public static void main(String[] args) {
        cadedemand cadena = new cadedemand();

        cadena.orden(new ordenes("reuniones importantes","Reuniones con los generales de otros ejercitos"));
        cadena.orden(new ordenes("disiplinar a los precos", "enseñarles la dureza del ejercito"));
        cadena.orden(new ordenes("desbloqueos", "limpiar las calles"));
        cadena.orden(new ordenes("Limpiar", "Limpiar los vehiculos"));
    }
}
