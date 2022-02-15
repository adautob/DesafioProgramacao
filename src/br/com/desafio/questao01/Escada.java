package br.com.desafio.questao01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Escada {

	public static void main(String[] args) {
		Integer n; //tamanho
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da escada: ");
		try {
			n = scanner.nextInt();
			for (int i = 1; i <= n; i++) {
				for (int j = n - 1; j >= i; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} catch (InputMismatchException e) {
			System.out.println("Erro: "+ e.getMessage());
			System.out.println("Você digitou um número inválido!");
		} finally {
			scanner.close();
		}
		
	}

}
