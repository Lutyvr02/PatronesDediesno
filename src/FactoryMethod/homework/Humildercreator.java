package FactoryMethod.homework;
/*numero vuelo
  destino (pais, ciudad, aeropuerto)
  origen (pais, ciudad, aeropuerto)
  avion (marca,capacidad, modelo, numerodeAsientos)
  pasajero (nombre,ci)
  numero asiento
  costo de pasaje*/
public class Humildercreator extends CreatorAlgo{

    @Override
    public IAlgo create() {
        Humilde hum = new Humilde();
        Base bas = new Base();

        bas.setNumerovuelo(123123);
        bas.setAsiento(123123);
        bas.setCosto(123213);

        hum.setBase(bas);

        destino dest = new destino();

        dest.setAeropuerto("Pedros air");
        dest.setCiudad("La paz");
        dest.setPais("Bolivia");

        origen orin = new origen();

        orin.setAeropuerto("Juans air");
        orin.setCiudad("San Petesburgo");
        orin.setPais("Rusia");

        avion avia = new avion();

        avia.setNumasientos(300);
        avia.setCapacidad(200);
        avia.setMarca("Lutys air");
        avia.setModelo("123123- fdasdhasda- 12312");
        avia.setCapacidad(23123);

        pasajero pasa = new pasajero();

        pasa.setCI(123123);
        pasa.setNombre("Luciano Vargas Ramirez");

        hum.setDescuento(100);
        hum.setRazon("Por se cool");

        hum.setDes(dest);
        hum.setAvi(avia);
        hum.setOri(orin);
        hum.setPas(pasa);

        return hum;
    }
}