package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

public class isDecamelizedTest {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("Podaj tekst do decamelize (0, jak Ci znudzi): ");
            String tekst = scn.next();
            if (tekst.equals("0")) break;
            System.out.println("decomelized text: " + StringFun.decamelize(tekst));
        } while (true);
    }
}
