package br.com.tinnovaTest.telas;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import br.com.tinnovaTest.apoio.FrameSelenium;

public class TelaCadastro extends FrameSelenium {

	final static Log log = LogFactory.getLog(TelaCadastro.class);

	public void clicarBotaoAdicionar() throws Exception {
		try {
			String xpath = "//div[text()='Adicionar']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElemento(xpath);
			log.info("Botão Adicionar clicado na tela cadastro");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão Adicionar na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void clicarBotaoSair() throws Exception {
		try {
			String xpath = "//div[text()='Sair']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElemento(xpath);
			log.info("Botão Sair clicado na tela cadastro");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão Sair na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void validarExclusaoCadastro(String nome) throws Exception {
		try {
			String xpath = "//p[text()='" + nome + "']";
			this.aguardarElementoFicarVisivel(xpath);
			log.info("Cadastro de " + nome + " validado com sucesso na tela cadastro");
		} catch (Exception e) {
			String erro = "Erro ao validar o cadastro de " + nome + " na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}
	}

	public void clicarBotaoEditarCadastro(String nome) throws Exception {
		try {
			String xpath = "//p[text()='" + nome + "']/../../div[5]/div[2]";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElemento(xpath);
			log.info("Botão editar para o cadastro de " + nome + " clicado na tela cadastro");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão editar para o cadastro de " + nome + " na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}
	}

	public void validarCadastro(String nome) throws Exception {
		try {
			String xpath = "//p[text()='" + nome + "']";
			this.aguardarElementoFicarVisivel(xpath);
			log.info("Cadastro de " + nome + " validado com sucesso na tela cadastro");
		} catch (Exception e) {
			String erro = "Erro ao validar o cadastro de " + nome + " na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}
	}

	public void validarCadastroExcluido(String nome) throws Exception {
		try {
			String xpath = "//p[text()='" + nome + "']";
			if (!this.aguardarElementoFicarVisivel(xpath, 3)) {
				log.info("Cadastro de " + nome + " excluído com sucesso na tela cadastro");
			} else {
				String erro = "Erro ao excuir o cadastro de " + nome + " na tela cadastro";
				log.error(erro);
				throw new Exception(erro);
			}
			log.info("Cadastro de " + nome + " validado com sucesso na tela cadastro");
		} catch (Exception e) {
			String erro = "Erro ao excuir o cadastro de " + nome + " na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}
	}

	public void clicarBotaoAmpliarCadastro(String nome) throws Exception {
		try {
			String xpath = "//p[text()='" + nome + "']/../../div[5]/div[1]";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElemento(xpath);
			log.info("Botão ampliar para o cadastro de " + nome + " clicado na tela cadastro");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão ampliar para o cadastro de " + nome + " na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void clicarBotaoLixeira(String nome) throws Exception {
		try {
			String xpath = "//p[text()='" + nome + "']/../../div[5]/div[3]";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElemento(xpath);
			log.info("Botão lixeira para o cadastro de " + nome + " clicado na tela cadastro");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão lixeira para o cadastro de " + nome + " na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}
	}

}
