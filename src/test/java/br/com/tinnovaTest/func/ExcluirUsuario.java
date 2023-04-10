package br.com.tinnovaTest.func;

import br.com.tinnovaTest.telas.TelaCadastro;
import br.com.tinnovaTest.telas.TelaDados;
import br.com.tinnovaTest.telas.TelaInicial;
import br.com.tinnovaTest.telas.popups.PopUpExclusao;

public class ExcluirUsuario {
	
	TelaInicial inicio = new TelaInicial();
	TelaCadastro cadastro = new TelaCadastro();
	TelaDados dados = new TelaDados();
	PopUpExclusao exclusao = new PopUpExclusao();
	
	public void excluirUsuario(String nome) throws Exception {
		cadastro.clicarBotaoLixeira(nome);

	}
	
	public void confirmarExclusao() throws Exception {
		exclusao.clicarBotaoSim();
	}	

}
