package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

public class isCamelizedTest {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("Podaj tekst do camelize (0, jak Ci znudzi): ");
            String text = scn.next();
            if (text.equals("0")) break;
            System.out.println("Camelized tekst: "+ text + " " + (StringFun.camelize(text)));
        } while (true);
    }
}
