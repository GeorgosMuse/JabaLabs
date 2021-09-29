package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	private static String leftPad( String aText, char aChar, int aWidth){
		int i;
		String res = aText;
		for (i = 0; i < aWidth - aText.length(); i++)
		res = res+aChar;
		return res;
	}
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setName("piotr Gołabek");

		 System.out.printf("%s%n",Account.translit("Морозов Андрей"));
	}

}
