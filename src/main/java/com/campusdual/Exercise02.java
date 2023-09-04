package com.campusdual;

public class Exercise02 {
    public static void main(String[] args) {
        //Calcular area y longitud de una circunferencia
        int radio = 15;
        double area = Math.PI * Math.pow(radio, 2);
        double longitud = 2 * Math.PI * radio;
        System.out.printf("Radio: %s \nArea: %s, \nLongitud: %s", radio, area, longitud);
    }
}
