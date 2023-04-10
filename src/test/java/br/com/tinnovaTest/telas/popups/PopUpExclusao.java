package br.com.tinnovaTest.telas.popups;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import br.com.tinnovaTest.apoio.FrameSelenium;

public class PopUpExclusao extends FrameSelenium {


	final static Log log = LogFactory.getLog(PopUpExclusao.class);


	public void clicarBotaoSim() throws Exception {
		try {
			String xpath = "//button[text()='Sim']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElemento(xpath);
			log.info("Botão Ok clicado no pop-up de atenção");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão Ok no pop-up de atenção";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void clicarBotaoNao() throws Exception {
		try {
			String xpath = "//button[text()='Não']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElemento(xpath);
			log.info("Botão Ok clicado no pop-up de atenção");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão Ok no pop-up de atenção";
			log.error(erro);
			throw new Exception(erro);
		}

	}
}
