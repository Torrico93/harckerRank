package com.sebas.proyecto.ejercicio4;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution{

    private static int B;
    private static int H;
    private static boolean flag;
       static{
            Scanner scanner = new Scanner(System.in);
            B = scanner.nextInt();
            H = scanner.nextInt();
        if(flag== false && B>0 && H>0) {
            int area = B*H;
            System.out.println(area);
        }else {

            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        boolean flag = false;
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}
