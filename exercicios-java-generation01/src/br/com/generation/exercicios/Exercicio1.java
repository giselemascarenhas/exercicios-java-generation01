package br.com.generation.exercicios;

// 1. Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o 1� N�mero: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite o 2� N�mero: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o 3� N�mero: ");
		n3 = ler.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("Maior n�mero: \n" + n1);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("Maior n�mero: \n" + n2);
		}
		else if(n3 > n1 && n3 > n2) {
			System.out.println("Maior n�mero: " + n3);

		ler.close();
		
		}
	}
}
