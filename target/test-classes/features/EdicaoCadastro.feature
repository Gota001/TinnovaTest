#language: pt
Funcionalidade: Edição de usuários na aplicação Tinnova

@EdicaoDeUsuario
Cenário: Editar cadastro de usuário válido
	Dado que seja acessada a opção de cadastro na aplicação Tinnova
	Quando o usuário editar seus dados com nome: '<nome>', email: '<e-mail>', telefone: '<telefone>' e cpf: '<cpf>'
	E solicitar o atualização
	Então o cadastro '<nome>' é editado com sucesso
	
	Exemplos:
	| nome          | e-mail              | telefone     | cpf					   |
	| Joao da Silva | zedasilva@gmail.com | 1199453-3432 | 530.345.433.23  |  
	
@EdicaoDeUsuarioInvalido
Cenário: Editar cadastro de usuário válido
	Dado que seja acessada a opção de cadastro na aplicação Tinnova
	Quando o usuário editar seus dados com nome: '<nome>', email: '<e-mail>', telefone: '<telefone>' e cpf: '<cpf>'
	E solicitar o atualização
	Então o cadastro '<nome>' é editado com ressalva
	
	Exemplos:
	| nome          | e-mail              | telefone     | cpf					   |
	| Joao da Silva | $%$¨%$              | $%$¨%$       | $%$¨%$          |  