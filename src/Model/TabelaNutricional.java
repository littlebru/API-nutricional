package Model;

import java.util.List;

public class TabelaNutricional {
	
	private double valorEnergetico;
	private double carboidratos;
	private double proteinas;
	private double gordurasTrans;
	private double gordurasTotais;
	private double gordurasSaturadas;
	private double fibras;
	private double sodio;
	private List<String> vitaminas;
	
	// constructor
	public TabelaNutricional(double valorEnergetico, double carboidratos, double proteinas, double gordurasTrans,
			double gordurasTotais, double gordurasSaturadas, double fibras, double sodio, List<String> vitaminas) {
		this.valorEnergetico = valorEnergetico;
		this.carboidratos = carboidratos;
		this.proteinas = proteinas;
		this.gordurasTrans = gordurasTrans;
		this.gordurasTotais = gordurasTotais;
		this.gordurasSaturadas = gordurasSaturadas;
		this.fibras = fibras;
		this.sodio = sodio;
		this.vitaminas = vitaminas;
	}

	// getters
	public double getValorEnergetico() {
		return valorEnergetico;
	}
	public double getCarboidratos() {
		return carboidratos;
	}
	public double getProteinas() {
		return proteinas;
	}
	public double getGordurasTrans() {
		return gordurasTrans;
	}
	public double getGordurasTotais() {
		return gordurasTotais;
	}
	public double getGordurasSaturadas() {
		return gordurasSaturadas;
	}
	public double getFibras() {
		return fibras;
	}
	public double getSodio() {
		return sodio;
	}
	public List<String> getVitaminas() {
		return vitaminas;
	}	

}
