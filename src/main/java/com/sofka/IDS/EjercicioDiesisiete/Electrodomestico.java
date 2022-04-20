package com.sofka.IDS.EjercicioDiesisiete;

import java.util.ArrayList;
import java.util.List;

public class Electrodomestico {
    private int precioBase = 100;
    private String color = "blanco";
    private char consumoEnergetico = 'F';
    private int peso = 5;

    public Electrodomestico() {

    }

    public Electrodomestico(int precioBase, int peso) {
        this.setPrecioBase(precioBase);
        this.setPeso(peso);
    }

    public  Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.setPrecioBase(precioBase);
        this.setColor(color);
        this.setConsumoEnergetico(consumoEnergetico);
        this.setPeso(peso);
    }


    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void comprbarConsumoEnergetico(char letra) {
        Character[] letras = {'A','B','C','D','E','F'};
        for (char color : letras) {
            if (color == letra) {
             return;
            }
        }
        this.setConsumoEnergetico('F');
    }

    public void comprobarColor(String nuevoColor) {
        String[] colors = {"blanco","negro","rojo","azul","gris"};
        for (String color : colors) {
            if (color == nuevoColor) {
                return;
            }
        }
        this.setColor("blanco");
    }

    public void precioFinal() {
        switch (this.consumoEnergetico) {
            case 'A':
                this.setPrecioBase((this.getPrecioBase() + 100));
                break;
            case 'B':
                this.setPrecioBase((this.getPrecioBase() + 80));
                break;
            case 'C':
                this.setPrecioBase((this.getPrecioBase() + 60));
                break;
            case 'D':
                this.setPrecioBase((this.getPrecioBase() + 50));
                break;
            case 'E':
                this.setPrecioBase((this.getPrecioBase() + 30));
                break;
            case 'F':
                this.setPrecioBase((this.getPrecioBase() + 10));
                break;
            default:
                break;
        }
        if (0 < this.peso || this.peso <= 19 ) {
            this.setPrecioBase((this.getPrecioBase() + 10));
        }
        if (20 <= this.peso || this.peso <= 49 ) {
            this.setPrecioBase((this.getPrecioBase() + 50));
        }
        if (50 < this.peso || this.peso <= 79 ) {
            this.setPrecioBase((this.getPrecioBase() + 80));
        }
        if (this.peso > 79 ) {
            this.setPrecioBase((this.getPrecioBase() + 100));
        }

    }
}
