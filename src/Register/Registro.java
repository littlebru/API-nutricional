package Register;

import java.util.Arrays;
import java.util.List;

import Calculation.CalculaIMC;
import Calculation.CalculaPGC;
import Controller.Leitor;
import Model.Alimento;
import Model.GrupoNutricional;
import Model.Pessoa;
import Model.TabelaNutricional;

public class Registro {
	private Alimento novoItem;
	private Receita novaReceita;
	private Leitor leitor;

	public Pessoa cadastraUsuario() {
		
		// INSERÇÃO DOS DADOS DO USUARIO
		leitor = new Leitor();
		System.out.println("Informe seu nome: ");
		String nome = leitor.getTexto();

		leitor = new Leitor();
		System.out.println("Informe sua idade: ");
		int idade = leitor.getValorInteiro();
		
		leitor = new Leitor();
		System.out.println("Informe seu peso (Kg): ");
		double peso = leitor.getValorDecimal();
		
		leitor = new Leitor();
		System.out.println("Informe sua altura: ");
		double altura = leitor.getValorDecimal();
		
		leitor = new Leitor();
		String genero;
		do {
		System.out.println("Genero:\n [1]FEMININO\n [2]MASCULINO");
		switch(leitor.getValorInteiro()) {
		case 1:
			genero = "Feminino";
			break;
		case 2: 
			genero = "Masculino";
			break;
		default:
			System.out.println("Informe uma opção válida");
			genero = null;
			break;
		}}while(genero == null);
		
		System.out.println("\n CADASTRADO COM SUCESSO! ");
		
		return new Pessoa(nome, peso, idade, altura, genero);
	}
	
	public void cadastrarIMC(Pessoa p) {
		// CALCULANDO O IMC
		CalculaIMC imc = new CalculaIMC(p.getPeso(), p.getAltura());
		
		System.out.println("\n IMC CALCULADO COM SUCESSO!\n O RESULTADO FOI ARMAZENADO NO SEU PERFIL");
		
		// CADASTRANDO O IMC
		p.setImc(imc);
	}
	
	public void cadastrarPNG(Pessoa p) {
		leitor = new Leitor();
		System.out.println("Informe sua massa magra (Kg): ");
		double massaMagra = leitor.getValorDecimal();
		
		// CALCULANDO O PGC
		CalculaPGC pgc = new CalculaPGC(massaMagra, p.getGenero(), p.getIdade(), p.getPeso());
		
		System.out.println("\n PGC CALCULADO COM SUCESSO!\n O RESULTADO FOI ARMAZENADO NO SEU PERFIL");
		
		// CADASTRANDO O PGC
		p.setPgc(pgc);
	}
	
	public void cadastrarAlimento(Cardapio c) {
		GrupoNutricional gn = null;
		
		// INSERINDO INFORMAÇÕES BÁSICAS DO ALIMENTO
		leitor = new Leitor();
		System.out.println("Informe o nome do alimento: ");
		String nome = leitor.getTexto();
		
		leitor = new Leitor();
		System.out.println("Informe o peso (g): ");
		double peso = leitor.getValorDecimal();
		
		
		// DEFININDO O GRUPO NUTRICIONAL DO ALIMENTO, VITAMINAS E MINERAIS
		do {
			System.out.println("Informe o grupo do alimento:\n [1]GRUPO 01 (LEITE E DERIVADOS)\n [2]GRUPO 02 (CARNES, EMBUTIDOS, LEGUMINOSAS, OVOS...)\n [3]GRUPO 03 (FRUTAS E HORTALIÇAS)\n [4]GRUPO 04 (CEREAIS, GRÃOS, PÃES, MEL...)\n [5]GRUPO 05 (GORDURA ANIMAL E VEGETAL)");
			
			switch(leitor.getValorInteiro()) {
			case 1:
				gn = new GrupoNutricional("GRUPO 01", "Ricos em Cálcio, magnésio e vitamina B2");
				break;
			case 2: 
				gn = new GrupoNutricional("GRUPO 02", "Rico em Proteínas, ferro, Zinco, vitaminas B, B2 e B3");
				break;
			case 3:
				gn = new GrupoNutricional("GRUPO 03", "Regula as funções do organismo e é rico de vitaminas A,K, E e C");
				break;
			case 4: 
				gn = new GrupoNutricional("GRUPO 04", "Melhoram a flora intestinal");
				break;
			case 5:
				gn = new GrupoNutricional("GRUPO 05", "Fornecem energia para o organismo");
				break;
			}}while(gn == null);
		
		// CADASTRANDO ALIMENTO
		novoItem = new Alimento(nome, peso, gn);
		
		// CADASTRANDO ALIMENTO NO CARDAPIO
		c.setCardapioAlimentos(novoItem);
		
		System.out.println("ALIMENTO CADASTRADO COM SUCESSO!");
	}
	
	public void cadastraReceita(Cardapio c) {
		TabelaNutricional novaTabela;
		List<String> listaDeVitaminas = null;
		
		if(c.getCardapioAlimentos().isEmpty()) {
			System.out.println("\n---- NENHUM ALIMENTO FOI CADASTRADO ---- ");
			return;
		}
		
		leitor = new Leitor();
		System.out.println("NOME DA RECEITA: ");
		String nome = leitor.getTexto();
		
		leitor = new Leitor();
		System.out.println("QUANTAS PORÇÕES ESTA RECEITA RENDE? ");
		int porcao = leitor.getValorInteiro();
		
		leitor = new Leitor();
		System.out.println("TEMPO DE PREPARO (horas): ");
		int tempoDePreparo = leitor.getValorInteiro();
		
		leitor = new Leitor();
		System.out.println("MODO DE PREPARO: ");
		String modoDePreparo = leitor.getTexto();
		
		// INSERINDO INFORMAÇÕES NUTRICIONAIS DO ALIMENTO
		System.out.println("-------- INFORMAÇÕES NUTRICIONAIS --------");
		
		leitor = new Leitor();
		System.out.println("Valor Energético do produto: ");
		double valorEnergetico = leitor.getValorDecimal();
		
		leitor = new Leitor();
		System.out.println("quantidade de carboidratos: ");
		double carboidratos = leitor.getValorDecimal();
		
		leitor = new Leitor();
		System.out.println("quantidade de proteínas: ");
		double proteina	 = leitor.getValorDecimal();
		
		leitor = new Leitor();
		System.out.println("Quantidade de Fibras: ");
		double fibras = leitor.getValorDecimal();
		
		leitor = new Leitor();
		System.out.println("Quantidade de Gordura Trans: ");
		double gorduraTrans = leitor.getValorDecimal();
		
		leitor = new Leitor();
		System.out.println("Quantidade de Gorduras Saturadas: ");
		double gorduraSaturada = leitor.getValorDecimal();
		
		double gordurasTotais = gorduraTrans + gorduraSaturada;
		
		leitor = new Leitor();
		System.out.println("Quantidade de Sódio: ");
		double sodio = leitor.getValorDecimal();
		
		
		
		// CADASTRANDO TABELA NUTRICIONAL
		novaTabela = new TabelaNutricional(valorEnergetico, carboidratos, proteina, gorduraTrans, gordurasTotais, gorduraSaturada, fibras, sodio, listaDeVitaminas);
		
		// CADASTRANDO RECEITA
		novaReceita = new Receita(nome, porcao, tempoDePreparo, modoDePreparo, novaTabela);
		
		// cadastrar mais ingredientes
				boolean adicionar = true;
				String alimento;
				
				do {
					c.mostrarCardapioAlimentoCompactado();
					
					leitor = new Leitor();
					System.out.println("INFORME O ID DO ALIMENTO: ");
					int index =	leitor.getValorInteiro();
					
					alimento = c.getCardapioAlimentos().get(index).toString();
					
					leitor = new Leitor();
					System.out.println("QUAL A QUANTIDADE INDICADA PARA A RECEITA: ");
					String qtd =	leitor.getTexto();
					
					novaReceita.setIngredientes(alimento, qtd);
					
					leitor = new Leitor();
					System.out.println("ADICIONAR MAIS UM INGREDIENTE?\n [1] SIM\n [2] NÃO");
					int op = leitor.getValorInteiro();
					
					if(op == 2) adicionar = false;
				}while(adicionar);
		
			System.out.println("RECEITA CADASTRADA COM SUCESSO! ");
			
		// CADASTRANDO NO CARDAPIO
		c.setCardapioReceita(novaReceita);
	}
	
	public void CadastrarCombinacoes(Cardapio c) {
		Combinacao combinacao = new Combinacao();
		
		leitor = new Leitor();
		System.out.println("NOME DA COMBINAÇÃO: ");
		String nome = leitor.getTexto();
		
		// SETANDO VALOR DO NOME
		combinacao.setNome(nome);
		

		// cadastrar mais ingredientes
		boolean adicionar = true;
		Alimento alimento;
		
		do {
			c.mostrarCardapioAlimentoCompactado();
			
			leitor = new Leitor();
			System.out.println("INFORME O ID DO ALIMENTO: ");
			int index =	leitor.getValorInteiro();
			
			alimento = c.getCardapioAlimentos().get(index);

			combinacao.setAlimentoNaCombinacao(alimento);
			
			leitor = new Leitor();
			System.out.println("ADICIONAR MAIS UM INGREDIENTE?\n [1] SIM\n [2] NÃO");
			int op = leitor.getValorInteiro();
			
			if(op == 2) adicionar = false;
		}while(adicionar);
		
		c.setCombinacoes(combinacao);

		System.out.println("COMBINAÇÃO CADASTRADA COM SUCESSO !");
	}

}
