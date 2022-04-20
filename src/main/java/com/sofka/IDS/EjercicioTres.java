package com.sofka.IDS;

public class EjercicioTres {
    public static int calcularRadio(int radio){
        int area = (int) Math.PI*(radio^2);
        return area;
    }
    public static void main(String[] args) {
        int radio = 5;
        System.out.println(calcularRadio(radio));
    }
}
