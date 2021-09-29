package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

public class isShuffledTest {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("Podaj tekst do shaffle (0, jak Ci znudzi): ");
            String tekst = scn.next();
            if (tekst.equals("0")) break;
            System.out.println("Shuffled text: " + StringFun.shuffle(tekst));
        } while (true);
    }
}
