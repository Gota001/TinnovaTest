package br.com.tinnovaTest.func;

import br.com.tinnovaTest.telas.TelaCadastro;
import br.com.tinnovaTest.telas.TelaDados;
import br.com.tinnovaTest.telas.TelaInicial;

public class CadastrarUsuario {

	TelaInicial inicio = new TelaInicial();
	TelaCadastro cadastro = new TelaCadastro();
	TelaDados dados = new TelaDados();
	
	public void acessarCadastro() throws Exception {
		inicio.clicarBotaoEntrar();
	}
	

	public void inserirDados(String nome, String email, String telefone, String cpf) throws Exception {
		cadastro.clicarBotaoAdicionar();
		dados.inserirNome(nome);
		dados.inserirEmail(email);
		dados.inserirCpf(cpf);
		dados.inserirTelefone(telefone);
	}

	public void finalizarCadastro() throws Exception {
		dados.clicarBotaoGuardar();
	}

}
