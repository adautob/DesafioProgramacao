package br.com.desafio.questao02;

import java.util.Scanner;

public class VerificaSenha {

	public static void main(String[] args) {
		String senha;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma senha: ");
		
		senha = scanner.next();
		
		if (senha.length() < 6) {
			System.out.println("Sua senha é muito curta, tem apenas "+senha.length()+" caracteres");
			System.out.println("Digite mais "+(6-senha.length())+" caracteres");
		} else System.out.println("Sua senha esta ok");
		scanner.close();
	}
	

	
	private boolean temMaiuscula() {
		return false;
		
	}
	
	private boolean temMinuscula() {
		return false;
		
	}
	
	private boolean temCaracterEspecial() {
		return false;
	}
	

}
