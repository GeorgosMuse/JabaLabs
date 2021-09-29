package pl.lublin.wsei.java.cwiczenia.mylib;

import java.util.Random;

public class StrongPasswordGenerator {
    private final String smallLetters = "qwertyuiopasdfghjklzxcvbnm";
    private final String bigLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private final String symbols = "!@#$%^&*()-_=+[{]}|;:',<.>/?";
    private final String numbers = "1234567890";
    private int length;
    private boolean SmallLetters;
    private boolean BigLetters;
    private boolean Numbers;
    private boolean Symbols;

    public StrongPasswordGenerator(int length, boolean SmallLetters, boolean BigLetters, boolean Numbers, boolean Symbols) {
        this.length = length;
        this.SmallLetters = SmallLetters;
        this.BigLetters = BigLetters;
        this.Numbers = Numbers;
        this.Symbols = Symbols;
    }
    public char[] generator() {
        char[] password = new char[length];
        Random x = new Random();
        String combo= "";
        if (SmallLetters == true) combo = combo + smallLetters;
        if (BigLetters == true) combo = combo + bigLetters;
        if (Numbers == true) combo = combo + numbers;
        if (Symbols == true) combo = combo + symbols;

        for (int y = 0; y < length; y++){
            password[y] = combo.charAt(x.nextInt(combo.length()));
        }
        return password;
    }
    public static void main(String[] args) {
        char[] pass = new StrongPasswordGenerator(15, true, true, true, false).generator();
        System.out.println(pass);
    }
}
