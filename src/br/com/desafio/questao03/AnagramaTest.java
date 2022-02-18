package br.com.desafio.questao03;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnagramaTest {

	@Test
	public void testQtdeParesAnagramas() {
		int resultadoEsperado = 3;
		int resultadoAtual = Anagrama.qtdeParesAnagramas("ifailuhkqq");
		
		assertEquals(resultadoEsperado, resultadoAtual);
		
	}

}
