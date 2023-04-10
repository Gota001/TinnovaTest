#language: pt
Funcionalidade: Cadastro de usuários na aplicação Tinnova

@CadastroDeUsuario
Cenário: Cadastro de usuário válido
	Dado que seja acessada a opção de cadastro na aplicação Tinnova
	Quando o usuário inserir seus dados com nome: '<nome>', email: '<e-mail>', telefone: '<telefone>' e cpf: '<cpf>'
	E solicitar o cadastro
	Então o cadastro '<nome>' é efetivado com sucesso
	
	Exemplos:
	| nome         | e-mail       | telefone  | cpf					   |
	| Jose da Silva| ze5@mail.com | 9453-3432 | 430.345.433.23 |
	
	
@CadastroUsuarioInvalido
Cenário: Cadastro de usuário inválido
	Dado que seja acessada a opção de cadastro na aplicação Tinnova
	Quando o usuário inserir seus dados com nome: '<nome>', email: '<e-mail>', telefone: '<telefone>' e cpf: '<cpf>'
	E solicitar o cadastro
	Então o cadastro '<nome>' é efetivado com ressalva
	
	Exemplos:
	| nome         | e-mail       | telefone  | cpf					   |
	| invalid      | invalid      | invalid   | invalid        |