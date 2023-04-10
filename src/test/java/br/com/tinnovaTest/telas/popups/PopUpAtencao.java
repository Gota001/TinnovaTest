package br.com.tinnovaTest.telas.popups;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import br.com.tinnovaTest.apoio.FrameSelenium;

public class PopUpAtencao extends FrameSelenium {

	final static Log log = LogFactory.getLog(PopUpAtencao.class);


	public void clicarBotaoOk() throws Exception {
		try {
			String xpath = "//button[text()='OK']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElemento(xpath);
			log.info("Botão Ok clicado no pop-up de atenção");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão Ok no pop-up de atenção";
			log.error(erro);
			throw new Exception(erro);
		}

	}
	
	public void validarAtencaoCadastro() throws Exception {
		try {
			String xpath = "//div[text()='Todos os campos devem ser preenchidos']";
			this.aguardarElementoFicarVisivel(xpath);
			log.info("Mensagem 'Todos os campos devem ser preenchidos' validado com sucesso no pop-up de atenção");
		} catch (Exception e) {
			String erro = "Erro ao validar a mensagem 'Todos os campos devem ser preenchidos' no pop-up de atenção";
			log.error(erro);
			throw new Exception(erro);
		}
	}
}
