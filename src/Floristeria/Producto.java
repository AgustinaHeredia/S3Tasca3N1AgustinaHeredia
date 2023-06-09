package Floristeria;

public abstract class Producto {
    private String descripcion;
    private double precio;

    public Producto(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
    @Override
    public String toString() {
        return "Producto: " + descripcion + ", precio: " + precio  + "]";
    }
   
}
