package br.com.generation.exercicios;

// 4. 1-	Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
// Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um n�mero: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("N�mero Par e Raiz quadrada:  " + Math.sqrt(numero));
		} else {
			System.out.println("N�mero �mpar e " + Math.pow(numero, 2));
		}
		
		
		ler.close();
	}

}
