package Calculation;

import java.util.Arrays;
import java.util.List;

import Model.Pessoa;

public class CalculaPGC {
	
	private double pgc;
	private List<String> mensagem = Arrays.asList("Nivel de gordura está dentro da média", "Nivel de gordura está acima da média", "Nivel de gordura está muito alto");

	// getter
	public double getPgc() {
		return pgc;
	}
	// setter
	public void setPgc(double pgc) {
		this.pgc = pgc;
	}
	
	// constructor
	public CalculaPGC(double massaMagra, String genero, int idade, double peso) {
		double gorduraCorporal = peso - massaMagra;
		
		this.pgc =  ((gorduraCorporal)/peso)* 100;
		
		classificaPgc(genero, idade);
	}
	
	public String classificaPgc(String genero, int idade) {
		// caso FEMININO
		if(genero.equals("Feminino")) {
			if (idade <= 25) {
				if(this.pgc <= 16.0) {
					return mensagem.get(0);
				}
				else if (this.pgc <= 22) {
					return mensagem.get(1);
				}
				else {
					return mensagem.get(2);
				}
				
			}
			else if(idade <= 45) {
				if(this.pgc <= 19.0) {
					return mensagem.get(0);
				}
				else if (this.pgc <= 26) {
					return mensagem.get(1);
				}
				else {
					return mensagem.get(2);
				}
			}
			else if(idade <= 55) {
				if(this.pgc <= 21.0) {
					return mensagem.get(0);
				}
				else if (this.pgc <= 28) {
					return mensagem.get(1);
				}
				else {
					return mensagem.get(2);
				}
			}
			else {
				if(this.pgc <= 22.0) {
					return mensagem.get(0);
				}
				else if (this.pgc <= 29) {
					return mensagem.get(1);
				}
				else {
					return mensagem.get(2);
				}
				
			}
		}
		else {
			if (idade <= 25) {
				if(this.pgc <= 6.0) {
					return mensagem.get(0);
				}
				else if (this.pgc <= 13) {
					return mensagem.get(1);
				}
				else {
					return mensagem.get(2);
				}
				
			}
			else if(idade <= 45) {
				if(this.pgc <= 14.0) {
					return mensagem.get(0);
				}
				else if (this.pgc <= 21) {
					return mensagem.get(1);
				}
				else {
					return mensagem.get(2);
				}
			}
			else if(idade <= 55) {
				if(this.pgc <= 16.0) {
					return mensagem.get(0);
				}
				else if (this.pgc <= 23) {
					return mensagem.get(1);
				}
				else {
					return mensagem.get(2);
				}
			}
			else {
				if(this.pgc >= 18.0) {
					return mensagem.get(0);
				}
				else if (this.pgc <= 23) {
					return mensagem.get(1);
				}
				else {
					return mensagem.get(2);
				}
				
			}
		}
		
	}
	
}
