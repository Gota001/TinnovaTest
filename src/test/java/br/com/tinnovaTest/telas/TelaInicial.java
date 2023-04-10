package br.com.tinnovaTest.telas;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.tinnovaTest.apoio.DataFormater;
import br.com.tinnovaTest.apoio.FrameSelenium;

public class TelaInicial  extends FrameSelenium {

	final static Log log = LogFactory.getLog(TelaInicial.class);

	public void clicarBotaoEntrar() throws Exception {
		try {
			String xpath = "//div[text()='Entrar']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElemento(xpath);
			log.info("Botão Entrar clicado na tela de cadastro");
		} catch (Exception e) {
			String erro = "erro ao clicar no botão entrar na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}

	}

}
