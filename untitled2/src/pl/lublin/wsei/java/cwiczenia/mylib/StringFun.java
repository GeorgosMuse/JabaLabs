package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class StringFun {

    public static boolean isPalindrome(String word) {
        word = word.replaceAll("[^a-zA-z]", "").toLowerCase();
        StringBuilder B = new StringBuilder(word);
        String AD = B.reverse().toString();
        if (AD.equals(word)) {
            return true;
        } else
            return false;

    }

    public static String anarchize(String word) {
        String resultat = "";
        char[] Tabel = word.toCharArray();

        if (Character.isUpperCase(Tabel[0])) {
            resultat = resultat+ Character.toLowerCase(Tabel[0]);
            for (int x=1; x<Tabel.length; x++) {
                if (x % 2 !=0) Tabel[x] = Character.toUpperCase(Tabel[x]);
                else Tabel[x] = Character.toLowerCase(Tabel[x]);
                resultat= resultat + Tabel[x];
            }
        }

        if (Character.isLowerCase(Tabel[0])) {
            resultat = resultat+ Character.toUpperCase(Tabel[0]);
            for (int x=1; x<Tabel.length; x++) {
                if (x % 2 ==0) Tabel[x] = Character.toUpperCase(Tabel[x]);
                else Tabel[x] = Character.toLowerCase(Tabel[x]);
                resultat= resultat + Tabel[x];
            }
        }
        System.out.println(resultat);
        return resultat;
    }

    public static String camelize(String word){
        word = word.toLowerCase();
        String Add = "";
        String[] TabelaString = word.split("_");
        for (int x=0; x<TabelaString.length; x++) {
            if (x == 0) {
                Add = Add + TabelaString[x];
            }
            else {
                TabelaString[x] = StringUtils.capitalize(TabelaString[x]);
                Add = Add + TabelaString[x];
            }
        }
        System.out.println(Add);
        return Add;
    }

    public static String decamelize(String word){
        char[] morearrays = word.toCharArray();
        String y = "";
        for (int x = 0; x< morearrays.length; x++){
            y = y + Character.toLowerCase(morearrays[x]);
            if (x + x < morearrays.length && Character.isUpperCase(morearrays[x + x])) {
                y = y + " ";
            }
        }

        System.out.println(y);
        return y;
    }

    public static String shuffle(String word){
        List<Character> charlist = new LinkedList<>();
        for (char x:word.toCharArray()) {
            charlist.add(x);
        }
        StringBuilder y = new StringBuilder();
        for (int ind = 0; ind<word.length(); ind++) {
            int randomP = new Random().nextInt(charlist.size());
            y.append(charlist.get(randomP));
            charlist.remove(randomP);
        }
        System.out.println(y.toString());
        return y.toString();
    }


}
