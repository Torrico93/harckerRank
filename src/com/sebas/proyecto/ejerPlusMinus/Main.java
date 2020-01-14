package com.sebas.proyecto.ejerPlusMinus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main{


        public  static void main (String [] args) {

            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] array;
            array = new int[n];

            //long [] arra = {-4, 3, -9, 0, 4, 1 };
           plusMinus (array);

        }


    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        double contadorPositivos = 0;
        double contadorNegativos = 0;
        double contadorCeros = 0;

        for(double i = 0 ; i<arr.length; i++){

            if(arr[(int) i]>0){
                contadorPositivos++;
            }
            else if (arr[(int) i]<0){
                contadorNegativos++;
            }
            else{
                contadorCeros++;
            }
        }
        System.out.println(contadorPositivos/arr.length);
        System.out.println(contadorNegativos/arr.length);
        System.out.println(contadorCeros/arr.length);

    }

}










