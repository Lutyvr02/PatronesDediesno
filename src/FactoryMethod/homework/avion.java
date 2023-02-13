package FactoryMethod.homework;
//  avion (marca,capacidad, modelo, numerodeAsientos)
public class avion {

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String marca;
    private int capacidad;
    private String modelo;

    public void setNumasientos(int numasientos) {
        this.numasientos = numasientos;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumasientos() {
        return numasientos;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getMarca() {
        return marca;
    }

    private int numasientos;

    public void showAlgo() {
        System.out.println("Marca: "+marca+", Capacidad: "+capacidad+", Modelo: "+modelo+", Numero de asientos: "+numasientos);
    }
}
