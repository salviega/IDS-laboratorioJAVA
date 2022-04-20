package com.sofka.IDS;

import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args) {
        Scanner cursor = new Scanner(System.in);
        int dia = Integer.parseInt(cursor.nextLine());
        switch (dia) {
            case 1:
                System.out.println("El lunes es un día laboral");
                break;
            case 2:
                System.out.println("El martes es un día laboral");
                break;
            case 3:
                System.out.println("El miércoles es un día laboral");
                break;
            case 4:
                System.out.println("El jueves es un día laboral");
                break;
            case 5:
                System.out.println("El viernes es un día laboral");
                break;
            case 6:
                System.out.println("El sábado no es un día laboral");
                break;
            case 7:
                System.out.println("El domingo no es un día laboral");
                break;
            default:
                System.out.println("Lo que digitaste no representa un día de la semana");
                break;
        }
    }
}
