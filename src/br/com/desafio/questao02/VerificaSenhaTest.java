package br.com.desafio.questao02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VerificaSenhaTest {

	@Test
	public void testQtosCarateresFaltam() {
		int resultadoEsperado = 2;
		int resultadoAtual = VerificaSenha.qtosCarateresFaltam("arsd");
		
		assertEquals(resultadoEsperado, resultadoAtual);
	}

}
