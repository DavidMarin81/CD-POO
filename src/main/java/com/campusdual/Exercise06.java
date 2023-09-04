package com.campusdual;

import java.util.Calendar;

public class Exercise06 {
    public static void main(String[] args) {
        //Saber en que estacion estamos comprobando la fecha del pc
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        switch(month){
            case 1:
            case 2:
            case 3:
                System.out.println("Winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Spring");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Summer");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Autumn");
                break;
            default:
                throw new IllegalArgumentException("No existe el mes");
        }
    }
}
