package com.sebas.proyecto.ejercicio1;

import java.util.Scanner;



public class Solution{

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for( int l = 0 ; l< n ; l++){
                Math.pow(2,l);
            }
        }
        in.close();
    }
}
