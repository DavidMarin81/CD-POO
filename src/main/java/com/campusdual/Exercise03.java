package com.campusdual;

public class Exercise03 {
    public static void main(String[] args) {
        int value = getValue();
        printValue(value);
    }

    //Metodo (Devuelve el valor)
    public static int getValue(){
        return 4;
    }

    //Procedimiento (No devuelve un valor)
    public static void printValue(int value){
        System.out.printf("Value: " + value);
    }
}

