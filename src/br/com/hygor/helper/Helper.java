package br.com.hygor.helper;

import java.util.Locale;
import java.util.Scanner;

public class Helper {

    public static final Scanner input = new Scanner(System.in);

    public static void print(String s){
        System.out.print(s);
    }

    public static void println(String s){
        System.out.println(s);
    }

    public static void setLocation(){
        Locale.setDefault(Locale.US);
    }
}
