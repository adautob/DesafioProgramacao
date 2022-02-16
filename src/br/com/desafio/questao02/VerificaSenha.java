package br.com.desafio.questao02;

import java.util.Scanner;

/**
 * 
 * @author Adauto;
 * 
 *         Classe para verificar se senha informada pelo usuário é segura; Para
 *         uma senha ser considerada segura ela deve: Ter no mínimo 6
 *         caracteres; Ter no mínimo 1 dígito; Ter no mínimo 1 letra maiúscula;
 *         Ter no mínimo 1 letra minúscula; Ter no mínimo um dos seguintes
 *         caracteres especiais: !@#$%^&*()-+
 *
 */
public class VerificaSenha {

	public static void main(String[] args) {
		String senha;
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nDigite uma senha: ");

		senha = scanner.next();

		verificaTamanho(senha);

		if (!temDigito(senha))
			System.out.println("\nA senha deve conter pelo menos dígito!");

		if (!temMaiuscula(senha))
			System.out.println("\nA senha deve conter pelo menos uma letra maiúscula!");

		if (!temMinuscula(senha))
			System.out.println("\nA senha deve conter pelo menos uma letra minúscula!");

		if (!temCaracterEspecial(senha))
			System.out.println("\nA senha deve conter pelo menos um dos seguintes caracteres: !@#$%^&*()-+");

		scanner.close();
	}

	/**
	 * Método que verifica se a senha tem o tamanho mímo de 6 caracteres e exibe mensagem ao usuário
	 * @param senha
	 */
	private static void verificaTamanho(String senha) {
		if (senha.length() < 6) {
			System.out.println("\nSua senha é muito curta, tem apenas " + senha.length() + " caracteres");
			System.out.println("Digite mais " + (6 - senha.length()) + " caracteres");
		} else
			System.out.println("\nTamanho da senha ok");
	}

	
	/**
	 * Método que retorna True se a senha contém pelo menos um dígito
	 * @param senha
	 * @return
	 */
	private static boolean temDigito(String senha) {
		boolean r = false;
		String digitos = "0123456789";
		for (int i = 0; i < senha.length(); i++) {
			for (int j = 0; j < digitos.length(); j++) {
				if (senha.charAt(i) == digitos.charAt(j))
					r = true;
			}
		}
		return r;
	}

	/**
	 * Método que retorna True se a senha contém pelo menos uma letra maiúscula
	 * @param senha
	 * @return
	 */
	private static boolean temMaiuscula(String senha) {
		boolean r = false;
		for (int i = 0; i < senha.length(); i++) {
			if (Character.isUpperCase(senha.charAt(i)))
				r = true;
		}
		return r;
	}

	
	/**
	 * Método que retorna True se a senha contém pelo menos uma letra minúscula
	 * @param senha
	 * @return
	 */
	private static boolean temMinuscula(String senha) {
		boolean r = false;
		for (int i = 0; i < senha.length(); i++) {
			if (Character.isLowerCase(senha.charAt(i)))
				r = true;
		}
		return r;
	}

	
	/**
	 * Método que retorna True se a senha contém pelo menos um caracter especial
	 * @param senha
	 * @return
	 */
	private static boolean temCaracterEspecial(String senha) {
		boolean r = false;
		String caracter = "!@#$%^&*()-+";
		for (int i = 0; i < senha.length(); i++) {
			for (int j = 0; j < caracter.length(); j++) {
				if (senha.charAt(i) == caracter.charAt(j))
					r = true;
			}
		}
		return r;
	}

}
