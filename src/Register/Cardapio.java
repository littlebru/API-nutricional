package Register;

import java.util.ArrayList;
import java.util.List;

import Model.Alimento;

public class Cardapio {
	
	private List<Alimento> cardapioAlimentosUnicos = new ArrayList<Alimento>();
	private List<Receita> cardapioReceitas = new ArrayList<Receita>();
	private List<Combinacao> cardapioCombinacoes = new ArrayList<Combinacao>();
	
	public List<Alimento> getCardapioAlimentos() {
		return cardapioAlimentosUnicos;
	}
	
	public void setCardapioReceita(Receita a) {
		this.cardapioReceitas.add(a);
	}

	public void setCardapioAlimentos(Alimento a) {
		this.cardapioAlimentosUnicos.add(a);
	}
	
	public void setCombinacoes(Combinacao c) {
		this.cardapioCombinacoes.add(c);
	}
	
	public void mostrarCardapioReceitasCompacto() {
		if(cardapioReceitas.isEmpty()) {
			System.out.println("\nNENHUMA RECEITA FOI CADASTRADA");
			return;
		}
		
		System.out.println("------------ RECEITA ------------");
		
		for(Receita r : cardapioReceitas) {
			System.out.println("["+ cardapioReceitas.indexOf(r) +"]-- " + r.getNome().toUpperCase());
			System.out.println("Tempo de Preparo: " + r.getTempoDePreparo());
			System.out.println("Porções: " + r.getPorcoes());
		}
	}
	
	public void mostrarCardapioReceitasDetalhado() {
		if(cardapioReceitas.isEmpty()) {
			System.out.println("\nNENHUMA RECEITA FOI CADASTRADA");
			return;
		}
		
		System.out.println("------------ RECEITA ------------");
		for(Receita r: cardapioReceitas) {
			System.out.println("-"+ cardapioReceitas.indexOf(r) +"- " + r.getNome().toUpperCase());
			System.out.println("Modo de preparo: \n" + r.getModoDePreparo());
			// falta pegar os ingredientes (eles eles estão dentro de um dicionario)
			
			System.out.println("\n----- INFORMAÇÕES NUTRICIONAIS");
			System.out.println("Carboidratos: " + r.getInfoNutricional().getCarboidratos());
			System.out.println("Fibras: " + r.getInfoNutricional().getFibras());
			System.out.println("Proteínas: " + r.getInfoNutricional().getProteinas());
			System.out.println("Sódio: " + r.getInfoNutricional().getSodio());
			System.out.println("Valor Energético: " + r.getInfoNutricional().getValorEnergetico());
			System.out.println("Gordura Trans: " + r.getInfoNutricional().getGordurasTrans());
			System.out.println("Gordura Saturada: " + r.getInfoNutricional().getGordurasSaturadas());
			System.out.println("Gorduras Totais: " + r.getInfoNutricional().getGordurasTotais());
			System.out.println("-- Vitaminas e Minerais");
			for(String v: r.getInfoNutricional().getVitaminas()) {
				System.out.println(v);
			}
			System.out.println("\nTempo de Preparo: " + r.getTempoDePreparo());
			System.out.println("Porções: " + r.getPorcoes());
			System.out.println("----------------------------------");
		}
		
	}
	
	public void mostrarCardapioAlimentoDetalhado() {
		if(cardapioAlimentosUnicos.isEmpty()) {
			System.out.println("\nNENHUM ALIMENTO FOI CADASTRADO");
			return;
		}
		
		System.out.println("------------ ALIMENTOS DETALHADOS ------------");
		for(Alimento a: cardapioAlimentosUnicos) {
			System.out.println("\n ["+cardapioAlimentosUnicos.indexOf(a)+"]" + a.getNome().toUpperCase());
			System.out.println("Peso: " + a.getPeso() + "g");
			System.out.println("Grupo Nutricional: " + a.getGrupoNutricional().getNome());
			System.out.println("Benefícios: " + a.getGrupoNutricional().getBeneficios());
			System.out.println("----------------------------------");
		}
	}
		
		public void mostrarCardapioAlimentoCompactado() {
			
			if(cardapioAlimentosUnicos.isEmpty()) {
				System.out.println("\nNENHUM ALIMENTO FOI CADASTRADO");
				return;
			}
			
			System.out.println("------------ ALIMENTOS ------------");
			for(Alimento a: cardapioAlimentosUnicos) {
				System.out.println("\n ["+cardapioAlimentosUnicos.indexOf(a)+"]" + a.getNome().toUpperCase());
				System.out.println("Peso: " + a.getPeso() + "g");
				System.out.println("----------------------------------");
			}
	}
		
		public void mostraCombinacoesCompacto() {
			if(cardapioCombinacoes.isEmpty()) {
				System.out.println("\nNENHUMA COMBINAÇÃO FOI CADASTRADA");
				return;
			}
			
			System.out.println("------------ COMBINAÇÕES ------------");
			
			for(Combinacao c: cardapioCombinacoes) {
				System.out.println("\n ["+cardapioCombinacoes.indexOf(c)+"]" + c.getNomeCombinacao().toUpperCase());
				
				System.out.println("------------ INGREDIENTES");
				
				for(Alimento a: c.getCombinacoes()) {
					System.out.println("\n" + a.getNome());
				}
				System.out.println("----------------------------------");
			}
		}

		public void mostraCombinacoesDetalhado() {
			if(cardapioCombinacoes.isEmpty()) {
				System.out.println("\nNENHUMA COMBINAÇÃO FOI CADASTRADA");
				return;
			}
			
			System.out.println("------------ COMBINAÇÕES ------------");
			
			for(Combinacao c: cardapioCombinacoes) {
				System.out.println("\n ["+cardapioCombinacoes.indexOf(c)+"]" + c.getNomeCombinacao().toUpperCase());
				
				System.out.println("------------ INGREDIENTES");
				
				for(Alimento a: c.getCombinacoes()) {
					System.out.println("\n" + a.getNome());
					System.out.println(a.getGrupoNutricional().getNome());
					System.out.println(a.getGrupoNutricional().getBeneficios());
				}
				System.out.println("----------------------------------");
			}
		}

}
