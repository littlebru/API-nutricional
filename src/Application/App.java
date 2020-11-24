package Application;

import Calculation.*;
import Model.Pessoa;
import Register.Cardapio;
import Register.Registro;
import View.Menu;

public class App {
	
	public static void main(String[] args) {
		Cardapio cardapio = new Cardapio();
		Registro registro = new Registro();
		Pessoa usuario = null;
		Menu menu = new Menu();
		
		int opInterna;
		int opcao = 0;
		
		
		do {
			opcao = menu.printMenu();
			
			switch(opcao) {
			case 0:// ------------ FECHAR PROGRAMA
				opInterna = menu.fecharPrograma();
				if(opInterna == 1) {
					System.out.println("\n\nPROGRAMA ENCERRADO");
					System.exit(0);
					}
				else continue;
				
			case 1: // ------------ PERFIL
				
				opInterna = menu.opPerfil();
				
				do {
					// USUARIO NÃO CADASTRADO
					if(usuario == null && opInterna == 1 || opInterna == 2) {
							System.out.println("\n---- VOCE NÃO ESTA CADASTRADO! -----\n");
							opInterna = menu.opCadastro();
							if(opInterna == 1) {
								usuario = registro.cadastraUsuario();
								
								break;}
						}
					
					// USUÁRIO CADASTRADO - LISTAR AS INFORMAÇÕES
					if(opInterna == 1) {
						System.out.println(usuario.toString());
						break;}
	
					// CALCULADORA DE IMC E PGC 
					else if(opInterna == 2) {
						opInterna = menu.opCalculadora();
							
							// CALCULA IMC
							if(opInterna == 1) {
								registro.cadastrarIMC(usuario);
								break;
							}
							
							// CALCULA PGC
							else {
								registro.cadastrarPNG(usuario);
								break;
								}
					}
				}while(opInterna != 0);
					
				break;
				
			case 2: // ------------ CARDÁPIO
				opInterna = menu.opCardapio();
				
				// VOLTAR
				if(opInterna == 0) continue;	// VOLTAR

				// RECEITAS 
				if(opInterna == 1) {
						opInterna = menu.opReceitas();
						
						if(opInterna == 0) continue;	// VOLTAR
	
						// RECEITAS DETALHADAS
						if(opInterna == 1) {
							cardapio.mostrarCardapioReceitasDetalhado(); 
							break;}
	
						// RECEITAS COMPACTADAS
						else {
							cardapio.mostrarCardapioReceitasCompacto();
							break;}
					}
				else if(opInterna == 2) 
				{
					opInterna = menu.opCombinacoes();
					
					if(opInterna == 0) continue;	// VOLTAR
					
					if(opInterna == 1) {	// INFORMAÇÕES COMPACTADAS
						cardapio.mostraCombinacoesCompacto();
						break;
					}
					
					else {	// INFORMAÇÕES DETALHADASs
						cardapio.mostraCombinacoesDetalhado();
					}
					
					break;
				}
				
				else {
					opInterna = menu.opAlimentos(); 
		
					if(opInterna == 0) continue;	// VOLTAR
					
					// NOME, PESO DOS ALIMENTOS
					if(opInterna == 1) {
						cardapio.mostrarCardapioAlimentoCompactado();
						break;}

					// INFORMAÇÕES DETALHADAS DOS ALIMENTOS
					else {cardapio.mostrarCardapioAlimentoDetalhado();
						break;
					}
					
				}
			
			case 3:	// ------------ CADASTRAR NOVOS ALIMENTOS, RECEITAS, COMBINAÇÕES
				opInterna = menu.opColaboracao();
				
				if(opInterna == 0) continue;	// VOLTAR
				
				// CADASTRA NOVO ALIMENTO
				if(opInterna == 1) {
					registro.cadastrarAlimento(cardapio);
					break;}
				// CADASTRA NOVA RECEITA
				else if(opInterna == 2) {
					registro.cadastraReceita(cardapio);
					break;}
				// CADASTRA NOVA COMBINAÇÃO
				else {
					registro.CadastrarCombinacoes(cardapio);
					break;
				}
				
			default:
				System.out.println("Informe um valor válido");
				break;
			}
		}while(opcao < 5);
		
	}
}
