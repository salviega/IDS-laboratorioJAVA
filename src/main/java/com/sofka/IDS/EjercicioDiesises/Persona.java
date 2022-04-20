package com.sofka.IDS.EjercicioDiesises;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private int DNI = generarDNI();
    private char sexo = 'H';
    private float peso = 0;
    private float altura = 0;

    public Persona() {

    }

    public Persona(String nombre, int edad, char sexo) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
        this.setPeso(peso);
        this.setAltura(altura);
    }

    public int calcularIMC() {
        final int delgado = -1;
        final int normal = 0;
        final int sobrepeso = 1;
        int IMC = (int) ((int) this.getPeso() / this.getAltura());
        if (IMC < 20) {
            return delgado;
        }
        if (20 <= IMC && IMC <= 25) {
            return normal;
        }
        if (IMC > 25) {
            return sobrepeso;
        }
        return IMC;

    }
    public boolean esMayorDeEdad() {
        final int mayorDeEdad = 18;
        if (this.getEdad() >= mayorDeEdad) {
            return true;
        } else {
            return false;
        }
    }
    public void comprobarSexo(char sexo) {
        if (this.getSexo() != sexo) {
            this.setSexo('H');
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", DNI='" + getDNI() + '\'' +
                ", sexo=" + getSexo() +
                ", peso=" + getPeso() +
                ", altura=" + getAltura() +
                '}';
    }

    public int generarDNI(){
        int min = 10000000;
        int max = 90000000;
        int random = (int) (Math.random() * (max - min) + min);
        return random;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
