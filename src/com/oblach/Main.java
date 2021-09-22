package com.oblach;

import sun.rmi.runtime.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        cut(Objects.requireNonNull(in()));
        sort(new int[]{0,5,8,9,2,4,1,6});
        replace(Objects.requireNonNull(in()),
                Objects.requireNonNull(in()),
                Objects.requireNonNull(in()));

    }

    private static void cut(String stroke){
        char []simvols=stroke.toCharArray();

        for(int i=0;i<simvols.length-1;i++){
            if(simvols[i]==simvols[i+1])
                simvols[i]=0;
        }

        out(simvols);
    }

    private static void sort(int[] mas){
        for (int i = 0; i < mas.length; i++) {
            int value = mas[i];
            int g = i - 1;
            for (; g >= 0; g--)
                if (value < mas[g])
                    mas[g + 1] = mas[g];
                 else
                    break;
            mas[g + 1] = value;
        }
        out(mas);
    }

    private static void replace(String stroke, String subStroke, String replacement){
        stroke = stroke.replaceAll(subStroke.toLowerCase(), replacement.toLowerCase());
        out(stroke);
    }


    /*   Для удобства вывода,
     что бы не писать каждый раз System.out.println/print*/

    private static void out(String text){
        System.out.println(text);
    }

    private static void out(String[] text){
        for (String s : text) System.out.println(s);
    }

    private static void out(int text){
        System.out.println(text);
    }

    private static void out(int[] text){
        for (int j : text) System.out.println(j);
    }

    private static void out(char[] text){
        for (char j : text) System.out.print(j);
        System.out.println("");
    }

    private static String in(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return  br.readLine();
        } catch (IOException e) {
            Log.getLog("Input Error",e.getMessage(),true);
            return null;
        }
    }

    private static Integer inInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return  Integer.getInteger(br.readLine());
        } catch (IOException e) {
            Log.getLog("Input Error",e.getMessage(),true);
            return null;
        }
    }

}
