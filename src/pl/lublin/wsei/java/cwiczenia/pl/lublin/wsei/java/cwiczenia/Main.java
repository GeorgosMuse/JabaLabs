package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		int num1=0, num2=0 ;
		Scanner input = new Scanner(System.in);
		do {
System.out.print("Podaj liczbę #1");
num1 = input.nextInt();
if (num1 == 0) break;

System.out.print("Podaj liczbę #2");
num2 = input.nextInt();
if (num2 == 0) break;
System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1+num2);
		} while (true) ;
			
		
    }
}
