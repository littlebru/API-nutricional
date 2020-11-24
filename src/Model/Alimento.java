package Model;

public class Alimento {
	
	private String nome;
	private double peso;
	private GrupoNutricional grupoNutricional;
	
	public Alimento(String nome, double peso, GrupoNutricional grupoNutricional) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.grupoNutricional = grupoNutricional;
	}
	
	public String getNome() {
		return nome;
	}
	public double getPeso() {
		return peso;
	}
	public GrupoNutricional getGrupoNutricional() {
		return grupoNutricional;
	}
	
	

}
