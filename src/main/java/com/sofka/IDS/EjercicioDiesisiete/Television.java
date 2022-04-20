package com.sofka.IDS.EjercicioDiesisiete;

public class Television extends Electrodomestico{
    private int resolucion = 20;
    private boolean sintonizadorTDT = false;

    public Television() {

    }
    public Television(int precio, int peso) {
        super.setPrecioBase(precio);
        super.setPeso(peso);
    }

    public Television(int resolucion, boolean sintonizadorTDT) {
        this.setResolucion(resolucion);
        this.setSintonizadorTDT(sintonizadorTDT);
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void precioFinal() {
        if (this.resolucion >= 40) {
            super.setPrecioBase((int) (super.getPrecioBase() + (super.getPrecioBase() * 0.30)));
        }
        if (sintonizadorTDT == true) {
            super.setPrecioBase((super.getPrecioBase() + 50));
        }
        super.precioFinal();
    }
}
