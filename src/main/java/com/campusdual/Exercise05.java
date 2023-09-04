package com.campusdual;

import com.campusdual.util.Input;

public class Exercise05 {

    public static void addOrEven(){
        int value = Input.integer("Escribe un numero par o impar");
    }

    public static void main(String[] args) {
        //Comprobar si un numero es positivo o negativo
        positiveOrNegative();

        //Comprobar si un numero es multiplo de otro
        multipleOf();

        //Comprobar que un numero es menor que otro
        lowerThan();
    }

    public static void positiveOrNegative(){
        System.out.println("== POSITIVO o NEGATIVO ==");
        int value = Input.integer("Escribe un numero positivo o negativo: \n");
        if (value >= 0){
            System.out.printf("El numero %s es positivo\n", value);
        } else {
            System.out.printf("El numero %s es negativo\n", value);
        }
    }

    public static void multipleOf(){
        System.out.println("== MULTIPLOS ==");
        int value1 = Input.integer("Escribe un numero: \n");
        int value2 = Input.integer("Escribe otro numero: \n");
        if ((value1 % value2) == 0){
            System.out.printf("El numero %s es multiplo del numero %s\n", value1, value2);
        } else {
            System.out.printf("El numero %s no es multiplo del numero %s\n", value1, value2);
        }
    }

    public static void lowerThan(){
        System.out.println("== MAYOR o MENOR ==");
        int value1 = Input.integer("Escribe un numero: \n");
        int value2 = Input.integer("Escribe otro numero: \n");
        if (value1 > value2){
            System.out.printf("El numero %s es mayor que el numero %s\n", value1, value2);
        } else {
            System.out.printf("El numero %s es menor que el numero %s\n", value1, value2);
        }
    }
}
