package com.sebas.proyecto.ejercicio3;

import java.util.Scanner;

public class Main{


    public static void main(String[] args) {

        try{

            Scanner scanner = new Scanner(System.in);
            int i = 1;
            while(scanner.hasNextLine()){
                String cadena = scanner.nextLine();
                System.out.println(i++ +" "+cadena);

            }
        }catch(Exception e){
            System.out.println("El archivo no existe…");
        }
    }
}
