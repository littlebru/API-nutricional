package Model;

import Calculation.*;

public class Pessoa {
	
	private String nome;
	private double peso;
	private int idade;
	private double altura;
	private String genero;
	
	private CalculaIMC imc;
	private CalculaPGC pgc;
	
	public Pessoa(String nome, double peso, int idade, double altura, String genero) {
		this.nome = nome;
		this.peso = peso;
		this.idade = idade;
		this.altura = altura;
		this.genero = genero;
		this.imc = new CalculaIMC(peso, altura);
		this.pgc = new CalculaPGC(0.0, genero, idade, peso);
	}
	/*-------- Getters da classe---------*/
	public String getNome() {
		return nome;
	}
	public double getPeso() {
		return peso;
	}
	public double getAltura() {
		return altura;
	}
	public int getIdade() {
		return idade;
	}
	public String getGenero() {
		return genero;
	}
	
	public void setImc(CalculaIMC imc) {
		this.imc = imc;
	}
	public void setPgc(CalculaPGC pgc) {
		this.pgc = pgc;
	}
	
	@Override
	public String toString() {
		System.out.println("---- "+ this.nome.toUpperCase() + " ----\n" +
					"IDADE: " + this.idade + "\n" +
					"GÊNERO " + this.genero + "\n" +
					"PESO: " + this.peso + "\n" +
					"ALTURA: " + this.altura + "\n");
		
		if(this.imc == null && this.pgc == null) {
			return "IMC: 0.0" +
					"\nSITUAÇÃO: NÃO CALCULADO" +
					"\nPNG: 0.0" +
					"\nSITUAÇÃO: NÃO CALCULADO";
		}
		
		else if(this.imc == null && this.pgc != null) {
			return "\nIMC: 0.0" +
					"\nSITUAÇÃO: NÃO CALCULADO" +
					"\nPNG: " + this.pgc.getPgc() + "\n" +
					"SITUAÇÃO: " + this.pgc.classificaPgc(this.genero, this.idade) + "\n";
		}
		
		else if(this.imc != null && this.pgc == null) {
			return  "\nIMC: " + this.imc.getImc() + "\n" +
					"SITUAÇÃO: " + this.imc.classificaImc() + "\n" +
					"\nPNG: 0.0" +
					"\nSITUAÇÃO: NÃO CALCULADO";
		}
		
		return "\nIMC: " + this.imc.getImc() + "\n" +
				"SITUAÇÃO: " + this.imc.classificaImc() + "\n" +
				"\nPNG: " + this.pgc.getPgc() + "\n" +
				"SITUAÇÃO: " + this.pgc.classificaPgc(this.genero, this.idade) + "\n";
	}
	
}
