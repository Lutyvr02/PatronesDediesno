package abstractfactory.homework;

public class Client {
    public static void main(String[] args) {

        System.out.println("---------------------------------------");

        System.out.println("Pasajes Standard >>>>>");

        String pasajeStandard1 = "PasajeStandard1";
        String pasajeStandard2 = "PasajeStandard2";
        Factorydepasaje.make(pasajeStandard1).showInfoPasaje();
        Factorydepasaje.make(pasajeStandard2).showInfoPasaje();

        System.out.println("Pasajes Solidarios >>>>>");

        String pasajeSolidario1 = "PasajeSolidario1";
        String pasajeSolidario2 = "PasajeSolidario2";
        Factorydepasaje.make(pasajeSolidario1).showInfoPasaje();
        Factorydepasaje.make(pasajeSolidario2).showInfoPasaje();

        System.out.println("Pasajes de Infantes >>>>>");

        String pasajeInfante1 = "PasajeInfantes1";
        String pasajeInfante2 = "PasajeInfantes2";
        Factorydepasaje.make(pasajeInfante1).showInfoPasaje();
        Factorydepasaje.make(pasajeInfante2).showInfoPasaje();


        System.out.println("---------------------------------------");
    }
}
