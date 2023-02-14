package abstractfactory.homework;

public class Factorydepasaje {
    public static Pasaje make(String type){

        Pasaje pas;
        switch (type.toLowerCase()) {
            case "standard1" -> {
                pas = new Standard();
                ((Standard)pas).setAvion(new Aviones("tyty", "1 pasajero", "juan 3000", "70 asientos"));
                ((Standard)pas).setPasajero(new Pasajeros("Luis",9641));
                ((Standard)pas).setOrigen(new Origenviaje("Peru","Lima", "Aeropuerto san pedro"));
                ((Standard)pas).setDestino(new Destinoviaje("Argentina", "Buenos Aires", "Aeropuerto san cristobal"));
                pas.setNumeroAsiento(14);
                pas.setNumeroVuelo(672);
                ((Standard)pas).setCostoPasaje(200);
            }
            case "standard2" -> {
                pas = new Standard();
                ((Standard)pas).setAvion(new Aviones("tyty", "1 pasajero", "juan 300", "70 asientos"));
                ((Standard)pas).setPasajero(new Pasajeros("Luis",9641));
                ((Standard)pas).setOrigen(new Origenviaje("Peru","Lima", "Aeropuerto san pedro"));
                ((Standard)pas).setDestino(new Destinoviaje("Argentina", "Buenos Aires", "Aeropuerto san cristobal"));
                pas.setNumeroAsiento(14);
                pas.setNumeroVuelo(672);
                ((Standard)pas).setCostoPasaje(200);
            }
            case "humilde1" -> {
                pas = new Humilde();
                ((Humilde)pas).setAvion(new Aviones("tyty", "1 pasajero", "juan 300", "70 asientos"));
                ((Humilde)pas).setPasajero(new Pasajeros("Luis",9641));
                ((Humilde)pas).setOrigen(new Origenviaje("Peru","Lima", "Aeropuerto san pedro"));
                ((Humilde)pas).setDestino(new Destinoviaje("Argentina", "Buenos Aires", "Aeropuerto san cristobal"));
                pas.setNumeroVuelo(45312);
                pas.setNumeroAsiento(321231);
                ((Humilde)pas).setCostoPasaje(113250);
                ((Humilde)pas).setDescuento(3012312);
                ((Humilde)pas).setMotivoDescuento("Por ser cool");
            }
            case "humilde2" -> {
                pas = new Humilde();
                ((Humilde)pas).setAvion(new Aviones("tyty", "1 pasajero", "juan 300", "70 asientos"));
                ((Humilde)pas).setPasajero(new Pasajeros("Luis",9641));
                ((Humilde)pas).setOrigen(new Origenviaje("Peru","Lima", "Aeropuerto san pedro"));
                ((Humilde)pas).setDestino(new Destinoviaje("Argentina", "Buenos Aires", "Aeropuerto san cristobal"));
                pas.setNumeroVuelo(45312);
                pas.setNumeroAsiento(321233451);
                ((Humilde)pas).setCostoPasaje(113250);
                ((Humilde)pas).setDescuento(3012312);
                ((Humilde)pas).setMotivoDescuento("Por ser cool");
            }

            case "infantes1" -> {
                pas = new Infantes();
                ((Infantes)pas).setAvion(new Aviones("tyty", "1 pasajero", "juan 300", "70 asientos"));
                ((Infantes)pas).setPasajero(new Pasajeros("Luis",9641));
                ((Infantes)pas).setOrigen(new Origenviaje("Peru","Lima", "Aeropuerto san pedro"));
                ((Infantes)pas).setDestino(new Destinoviaje("Argentina", "Buenos Aires", "Aeropuerto san cristobal"));
                pas.setNumeroVuelo(3123123);
                pas.setNumeroAsiento(13212312);
                ((Infantes)pas).setCostoEspecial(123123);
            }
            case "infantes2" -> {
                pas = new Infantes();
                ((Infantes)pas).setAvion(new Aviones("tyty", "1 pasajero", "juan 300", "70 asientos"));
                ((Infantes)pas).setPasajero(new Pasajeros("Luis",9641));
                ((Infantes)pas).setOrigen(new Origenviaje("Peru","Lima", "Aeropuerto san pedro"));
                ((Infantes)pas).setDestino(new Destinoviaje("Argentina", "Buenos Aires", "Aeropuerto san cristobal"));
                pas.setNumeroVuelo(3123123);
                pas.setNumeroAsiento(13212312);
                ((Infantes)pas).setCostoEspecial(1231);
            }
            default -> {
                pas = new Standard();
                ((Standard)pas).setAvion(new Aviones("tyty", "1 pasajero", "juan 300", "70 asientos"));
                ((Standard)pas).setPasajero(new Pasajeros("Luis",9641));
                ((Standard)pas).setOrigen(new Origenviaje("Peru","Lima", "Aeropuerto san pedro"));
                ((Standard)pas).setDestino(new Destinoviaje("Argentina", "Buenos Aires", "Aeropuerto san cristobal"));
                pas.setNumeroAsiento(14132123);
                pas.setNumeroVuelo(123672);
                ((Standard)pas).setCostoPasaje(20013123);
            }
        }
        return pas;
    }
}
