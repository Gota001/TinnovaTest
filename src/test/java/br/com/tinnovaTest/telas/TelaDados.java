package br.com.tinnovaTest.telas;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.tinnovaTest.apoio.FrameSelenium;

public class TelaDados extends FrameSelenium {

	final static Log log = LogFactory.getLog(TelaDados.class);

	public void inserirNome(String nome) throws Exception {
		try {
			String xpath = "//input[@placeholder='Digite seu nome']";
			this.aguardarElementoFicarVisivel(xpath);
			this.limparInput(xpath);
			this.digitaTexto(xpath, nome);
			log.info(nome + " inserido no campo nome na tela dados");
		} catch (Exception e) {
			String erro = "Erro ao inserir " + nome + "no campo nome na tela dados";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void inserirEmail(String email) throws Exception {
		try {
			String xpath = "//input[@placeholder='Digite seu e-mail']";
			this.aguardarElementoFicarVisivel(xpath);
			this.limparInput(xpath);
			this.digitaTexto(xpath, email);
			log.info(email + " inserido no campo e-mail na tela dados");
		} catch (Exception e) {
			String erro = "Erro ao inserir " + email + "no campo e-mail na tela dados";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void inserirCpf(String cpf) throws Exception {
		try {
			String xpath = "//input[@placeholder='Digite seu CPF']";
			this.aguardarElementoFicarVisivel(xpath);
			this.limparInput(xpath);
			this.digitaTexto(xpath, cpf);
			log.info(cpf + " inserido no campo cpf na tela dados");
		} catch (Exception e) {
			String erro = "Erro ao inserir " + cpf + "no campo cpf na tela dados";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void inserirTelefone(String tel) throws Exception {
		try {
			String xpath = "//input[@placeholder='Digite seu telefone']";
			this.aguardarElementoFicarVisivel(xpath);
			this.limparInput(xpath);
			this.digitaTexto(xpath, tel);
			log.info(tel + " inserido no campo telefone na tela dados");
		} catch (Exception e) {
			String erro = "Erro ao inserir " + tel + "no campo telefone na tela dados";
			log.error(erro);
			throw new Exception(erro);
		}

	}
	
	public void clicarBotaoGuardar() throws Exception {
		try {
			String xpath = "//div[text()='GUARDAR']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElemento(xpath);
			log.info("Botão guardar clicado na tela dados");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão guardar na tela dados";
			log.error(erro);
			throw new Exception(erro);
		}

	}
	
	public void clicarBotaoAtualizar() throws Exception {
		try {
			String xpath = "//div[text()='ATUALIZAR']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElemento(xpath);
			log.info("Botão atualizar clicado na tela dados");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão atulizar na tela dados";
			log.error(erro);
			throw new Exception(erro);
		}

	}
	
	public void clicarBotaoVoltar() throws Exception {
		try {
			String xpath = "//div[text()='VOLTAR']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElemento(xpath);
			log.info("Botão voltar clicado na tela dados");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão voltar na tela dados";
			log.error(erro);
			throw new Exception(erro);
		}

	}
}
