package com.sofka.IDS.EjercicioDiesisiete;

public class Lavadora extends Electrodomestico{
    private int carga = 5;

    public Lavadora() {

    }

    public  Lavadora(int precio, int peso) {
        super.setPrecioBase(precio);
        super.setPeso(peso);
    }

    public Lavadora(int carga) {
        this.setCarga(carga);
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    public void precioFinal() {
        if (this.carga >= 30) {
            super.precioFinal();
            super.setPrecioBase((super.getPrecioBase() + 50));
        }
        super.precioFinal();
    }
}
