package Register;

import java.util.HashMap;
import java.util.Map;

import Model.GrupoNutricional;
import Model.TabelaNutricional;

public class Receita {
	
	private String nome;
	private Map<String, String> ingredientes = new HashMap<String, String>(); 
	private int porcoes;
	private int tempoDePreparo;
	private String modoDePreparo;
	private TabelaNutricional infoNutricional;
	
	public Receita(String nome, int porcoes, int tempoDePreparo, String modoDePreparo,
			TabelaNutricional infoNutricional) {
		this.nome = nome;
		this.porcoes = porcoes;
		this.tempoDePreparo = tempoDePreparo;
		this.modoDePreparo = modoDePreparo;
		this.infoNutricional = infoNutricional;
	}
	
	
	
	// setter
	public void setIngredientes(String ingrediente, String quantidade) {
		this.ingredientes.put(ingrediente, quantidade);
	}
	
	// getter
	
	public TabelaNutricional getInfoNutricional() {
		return infoNutricional;
	}
	public String getNome() {
		return nome;
	}
	public Map<String, String> getIngredientes() {
		return ingredientes;
	}
	public int getPorcoes() {
		return porcoes;
	}
	public int getTempoDePreparo() {
		return tempoDePreparo;
	}
	public String getModoDePreparo() {
		return modoDePreparo;
	}
	
	
	

}