package br.com.tinnovaTest.func;

import br.com.tinnovaTest.telas.TelaCadastro;
import br.com.tinnovaTest.telas.TelaInicial;
import br.com.tinnovaTest.telas.popups.PopUpAtencao;
import br.com.tinnovaTest.telas.popups.PopUpExclusao;

public class ValidarCadastro {
	
	TelaInicial inicio = new TelaInicial();
	TelaCadastro cadastro = new TelaCadastro();
	PopUpAtencao atencao = new PopUpAtencao();
	PopUpExclusao exclusao = new PopUpExclusao();
	
	public void validarCadastro(String nome) throws Exception {
		cadastro.validarCadastro(nome);
	}
	
	public void validarErroCadastro(String nome) throws Exception {
		atencao.validarAtencaoCadastro();
		atencao.clicarBotaoOk();
		cadastro.validarCadastro(nome);
	}
	
	public void validarExclusaoCadastro(String nome) throws Exception {
		inicio.clicarBotaoEntrar();
		cadastro.validarCadastroExcluido(nome);
	}
}