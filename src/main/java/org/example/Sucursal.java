package org.example;

public class Sucursal {
    private int idSucursal;
    private String nombre;
    private Region region;

    public Sucursal() {
    }

    public Sucursal(String nombre, Region region, int idSucursal) {
        this.nombre = nombre;
        this.region = region;
        this.idSucursal = idSucursal;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
