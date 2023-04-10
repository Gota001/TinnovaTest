package br.com.tinnovaTest.steps;

import br.com.tinnovaTest.func.CadastrarUsuario;
import br.com.tinnovaTest.func.EditarUsuario;
import br.com.tinnovaTest.func.ExcluirUsuario;
import br.com.tinnovaTest.func.ValidarCadastro;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;

public class Steps {
	
	CadastrarUsuario cadastro = new CadastrarUsuario();
	ValidarCadastro validacao = new ValidarCadastro();
	EditarUsuario edicao = new EditarUsuario();
	ExcluirUsuario exclusao = new ExcluirUsuario();
	
	@Dado("que seja acessada a opção de cadastro na aplicação Tinnova")
	public void que_seja_acessada_a_opção_de_cadastro_na_aplicação_tinnova() throws Exception {
	    cadastro.acessarCadastro();
	}

	@Quando("o usuário inserir seus dados com nome: {string}, email: {string}, telefone: {string} e cpf: {string}")
	public void o_usuário_inserir_seus_dados_com_nome_email_telefone_e_cpf(String nome, String email, String tel, String cpf) throws Exception {
		cadastro.inserirDados(nome, email, tel, cpf);
	}

	@Quando("solicitar o cadastro")
	public void solicitar_o_cadastro() throws Exception {
	    cadastro.finalizarCadastro();
	}

	@Então("o cadastro {string} é efetivado com sucesso")
	public void o_cadastro_é_efetivado_com_sucesso(String nome) throws Exception {
	    validacao.validarCadastro(nome);
	}
	
	@Então("o cadastro {string} é efetivado com ressalva")
	public void o_cadastro_é_efetivado_com_ressalva(String nome) throws Exception {
	    validacao.validarErroCadastro(nome);
	}
	
	@Quando("o usuário editar seus dados com nome: {string}, email: {string}, telefone: {string} e cpf: {string}")
	public void o_usuário_editar_seus_dados_com_nome_email_telefone_e_cpf(String nome, String email, String tel, String cpf) throws Exception {
	    edicao.editarDados(nome, email, tel, cpf);
	}

	@Quando("solicitar o atualização")
	public void solicitar_o_atualização() throws Exception {
	    edicao.atualizarCadastro();
	}

	@Então("o cadastro {string} é editado com sucesso")
	public void o_cadastro_é_editado_com_sucesso(String nome) throws Exception {
		validacao.validarCadastro(nome);
	}

	@Então("o cadastro {string} é editado com ressalva")
	public void o_cadastro_é_editado_com_ressalva(String nome) throws Exception {
	    validacao.validarErroCadastro(nome);
	}
	
	@Quando("o usuário solicitar a exlusão do cadastroo com nome: {string}")
	public void o_usuário_solicitar_a_exlusão_do_cadastroo_com_nome(String nome) throws Exception {
	    exclusao.excluirUsuario(nome);
	}

	@Quando("confirmar a exclusão")
	public void confirmar_a_exclusão() throws Exception {
	    exclusao.confirmarExclusao();
	}

	@Então("o cadastro {string} é excluido com sucesso")
	public void o_cadastro_é_excluido_com_sucesso(String nome) throws Exception {
	    validacao.validarExclusaoCadastro(nome);
	}
}
