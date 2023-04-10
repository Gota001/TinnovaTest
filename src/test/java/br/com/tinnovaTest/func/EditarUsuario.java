package br.com.tinnovaTest.func;

import br.com.tinnovaTest.telas.TelaCadastro;
import br.com.tinnovaTest.telas.TelaDados;
import br.com.tinnovaTest.telas.TelaInicial;
import br.com.tinnovaTest.telas.popups.PopUpAtencao;

public class EditarUsuario {
	
	TelaInicial inicio = new TelaInicial();
	TelaCadastro cadastro = new TelaCadastro();
	TelaDados dados = new TelaDados();
	PopUpAtencao atencao = new PopUpAtencao();

	public void editarDados(String nome, String email, String telefone, String cpf) throws Exception {
		cadastro.clicarBotaoEditarCadastro(nome);
		dados.inserirNome(nome);
		dados.inserirEmail(email);
		dados.inserirCpf(cpf);
		dados.inserirTelefone(telefone);
	}
	
	public void atualizarCadastro() throws Exception {
		dados.clicarBotaoAtualizar();
	}
	
}
