package br.com.desafio.questao01;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * 
 * @author Adauto
 * Algorítmo que imprime no console uma escada de tamanha N especificado pelo usuário
 *
 */
public class Escada {

	public static void main(String[] args) {
		Integer n; // Variável que recebe o tamanho da escada a ser digitado pelo usuário
		
		// Instancia objeto scanner, responsável por ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite o tamanho da escada: ");
		
		// Código dentro de Bloco TryCach para caso o 
		// usuário digite um valor errado, exceção seja tratada devidamente
		try {
			n = scanner.nextInt();
			
			// Código responsável por imprimir padrão de escada no console
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
