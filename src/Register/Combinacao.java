package Register;

import java.util.ArrayList;
import java.util.List;

import Model.Alimento;

public class Combinacao {
	private String nome;
	private List<Alimento> combinacoes = new ArrayList<Alimento>();
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAlimentoNaCombinacao(Alimento a) {
		combinacoes.add(a);
	}
	
	public List<Alimento> getCombinacoes(){
		return combinacoes;
	}
	
	public String getNomeCombinacao() {
		return nome;
	}
	
}
