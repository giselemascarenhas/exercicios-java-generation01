package br.com.generation.exercicios;

// 1. Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o 1º Número: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite o 2º Número: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o 3º Número: ");
		n3 = ler.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("Maior número: \n" + n1);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("Maior número: \n" + n2);
		}
		else if(n3 > n1 && n3 > n2) {
			System.out.println("Maior número: " + n3);

		ler.close();
		
		}
	}
}
