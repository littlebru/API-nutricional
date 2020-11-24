package View;

import Controller.Leitor;

public class Menu {
	Leitor leitor = new Leitor();

	int op;

	public int opcaoInvalida(int min, int max, int opcao) {
		System.out.print("\n\nINFORME SUA OPÇÃO: ");
		opcao = leitor.getValorInteiro();

		while (opcao < min || opcao > max) {
			System.out.println("\nVALOR INVÁLIDO! ESCOLHA NOVAMENTE.");

			System.out.print("OPÇÃO: ");
			opcao = leitor.getValorInteiro();
		}
		return opcao;
	}

	
	public int printMenu() {
		System.out.println("\n\n_____MENU_____");
		System.out.println("[1] MEU PERFIL");
		System.out.println("[2] CARDÁPIO");
		System.out.println("[3] COLABORAÇÃO\n");
		System.out.println("[0] FECHAR");
		op = opcaoInvalida(0, 3, op); // valores maiores do que as opções

		return op;
	}
	
	public int opCadastro() {
		System.out.println("\n\n_____NÃO CADASTRADO_____");
		System.out.println("[1] CADASTRAR");
		System.out.println("[0] CANCELAR");
		op = opcaoInvalida(0, 1, op); // valores maiores do que as opções

		return op;
	}
	
  //[1] PERFIL DO USUARIO
	public int opPerfil() {
		System.out.println("\n\n_____MEU PERFIL_____");
		System.out.println("[1] MINHAS INFORMAÇÕES");
		System.out.println("[0] VOLTAR");
		op = opcaoInvalida(0, 1, op); // valores maiores do que as opções

		return op;
	}
	
  // [1.2] CALCULADORA DE PESO
	public int opCalculadora() {
		System.out.println("\n\n_____CALCULADORA_____");
		System.out.println("[1] CALCULADORA DE IMC");
		System.out.println("[2] CALCULADORA DE PGC");
		op = opcaoInvalida(1, 2, op); // valores maiores do que as opções

		return op;
	}

  // [2] CARDÁPIO
	public int opCardapio() {
		System.out.println("\n\n_____CARDÁPIO_____");
		System.out.println("[1] RECEITAS COMPLETAS");
		System.out.println("[2] COMBINAÇÕES");
		System.out.println("[3] ALIMENTOS CADASTRADOS\n");
		System.out.println("[0] VOLTAR");
		op = opcaoInvalida(0, 3, op); // valores maiores do que as opções

		return op;
	}
	
	public int opReceitas() {
		System.out.println("\n\n_____RECEITAS_____");
		System.out.println("[1] RECEITAS COMPLETAS");
		System.out.println("[2] RECEITAS COMPACTADAS\n");
		System.out.println("[0] VOLTAR");
		op = opcaoInvalida(0, 2, op); // valores maiores do que as opções

		return op;
	}
	
	public int opAlimentos() {
		System.out.println("\n\n_____ALIMENTOS_____");
		System.out.println("[1] ALIMENTOS ");
		System.out.println("[2] INFORMAÇÃO COMPLETA DOS ALIMENTOS \n");
		System.out.println("[0] VOLTAR");
		op = opcaoInvalida(0, 2, op); // valores maiores do que as opções

		return op;
	}
	
	public int opCombinacoes() {
		System.out.println("\n\n_____COMBINAÇÕES_____");
		System.out.println("[1] COMBINAÇÕES ");
		System.out.println("[2] INFORMAÇÃO COMPLETA DAS COMBINAÇÕES \n");
		System.out.println("[0] VOLTAR");
		op = opcaoInvalida(0, 2, op); // valores maiores do que as opções

		return op;
	}
	

  // [4] COLABORAR COM O CADASTRAMENTO
  // Adicionar mais alimentos/ receita/ combinação
	public int opColaboracao() {
		System.out.println("\n\n_____COLABORAÇÃO_____");
		System.out.println("[1] CADASTRAR NOVO ALIMENTO");
		System.out.println("[2] CADASTRAR NOVA RECEITA");
		System.out.println("[3] CRIAR NOVA COMBINAÇÃO\n");
		System.out.println("[0] VOLTAR");
		op = opcaoInvalida(0, 3, op); // valores maiores do que as opções

		return op;
	}
	
	public int fecharPrograma() {
		System.out.println("\n\nVOCE SELECIONOU FECHAR O PROGRAMA");
		System.out.println("DESEJA CONTINUAR?");
		System.out.println("[1] SIM");
		System.out.println("[2] CANCELAR");
		
		op = opcaoInvalida(1, 2, op); // valores maiores do que as opções
		
		return op;
	}
}
