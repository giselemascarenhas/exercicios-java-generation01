package br.com.generation.exercicios;

// 4. 1-	Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
// Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Número Par e Raiz quadrada:  " + Math.sqrt(numero));
		} else {
			System.out.println("Número Ímpar e " + Math.pow(numero, 2));
		}
		
		
		ler.close();
	}

}
