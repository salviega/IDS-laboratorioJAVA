package com.sofka.IDS;

import java.util.Scanner;

public class EjercicioQuince {
    public static void main(String[] args) {
        boolean x = true;
        while (x) {
            try {
                System.out.println("****** GESTION CINEMATOGRÁFICA ********");
                System.out.println("1-NUEVO ACTOR");
                System.out.println("2-BUSCAR ACTOR");
                System.out.println("3-ELIMINAR ACTOR");
                System.out.println("4-MODIFICAR ACTOR");
                System.out.println("5-VER TODOS LOS ACTORES");
                System.out.println("6- VER PELICULAS DE LOS ACTORES");
                System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                System.out.println("8-SALIR");
                System.out.println("****** ****** *************** ******** \n");
                System.out.println("Escribe el número que corresponda a la opción del menú: ");
                Scanner cursor = new Scanner(System.in);
                int opcion = Integer.parseInt(cursor.nextLine());
                switch (opcion) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        System.out.println("Saliste del programa");
                        x = false;
                        break;
                    default:
                        System.out.println("OPCION INCORRECTO \n");
                        break;
                }
            } catch (Exception e) {
                System.out.println("OPCION INCORRECTO \n");
            }
        }
    }
}
