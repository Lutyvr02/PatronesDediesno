package FactoryMethod.homework;
/*numero vuelo
  destino (pais, ciudad, aeropuerto)
  origen (pais, ciudad, aeropuerto)
  avion (marca,capacidad, modelo, numerodeAsientos)
  pasajero (nombre,ci)
  numero asiento
  costo de pasaje*/
public class InfanterCreator extends CreatorAlgo{

    @Override
    public IAlgo create() {
        Infante espe = new Infante();
        Base bas = new Base();

        bas.setNumerovuelo(123123);
        bas.setAsiento(123123);
        bas.setCosto(123213);

        espe.setBase(bas);

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

        espe.setEspecial(123123);

        espe.setDes(dest);
        espe.setAvi(avia);
        espe.setOri(orin);
        espe.setPas(pasa);

        return espe;
    }
}