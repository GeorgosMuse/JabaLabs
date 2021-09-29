package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;


public class isAnarchised {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Podaj tekst do anarchenia (0, jak Ci znudzi): ");
            String tekst = scn.next();
            if (tekst.equals("0")) break;
            System.out.print("Anarchiczny tekst: " + StringFun.anarchize(tekst));
        } while (true);
    }
}
