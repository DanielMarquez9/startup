package com.startup.servlets;

public class Proveedor {
    private int id;
    private String nombre;
    private String vehiculo;

    public Proveedor(int id, String nombre, String vehiculo) {
        this.id = id;
        this.nombre = nombre;
        this.vehiculo = vehiculo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVehiculo() {
        return vehiculo;
    }
}
