#language: pt
Funcionalidade: Exclusão de usuários na aplicação Tinnova

@ExclusaoDeUsuario
Cenário: Editar cadastro de usuário válido
	Dado que seja acessada a opção de cadastro na aplicação Tinnova
	Quando o usuário solicitar a exlusão do cadastroo com nome: '<nome>'
	E confirmar a exclusão
	Então o cadastro '<nome>' é excluido com sucesso
	
	Exemplos:
	| nome              |
	| Joao da Silva     | 
	