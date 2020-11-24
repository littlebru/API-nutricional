package Calculation;

public class CalculaIMC {
	
	private double imc;

	// getter
	public double getImc() {
		return imc;
	}
	// setter	
	public void setIMC(double imc) {
		this.imc = imc;
	}
	
	// constructor
	public CalculaIMC(double peso, double altura) {
		this.imc = peso / Math.pow(altura, 2);
		
		classificaImc();
	}
	
	public String classificaImc() {
		if (this.imc <= 18.5) {
			return "IMC: Abaixo Do Peso\n" ;
		}
		else if((this.imc >= 18.6) && (imc <= 24.9)) {
			return "IMC: Peso Normal\n";
		}
		else if((this.imc >= 25) && (imc <= 29.9)) {
			return "IMC: Sobrepeso\n";
		}
		else if((this.imc >= 30) && (imc <= 34.9)) {
			return "IMC: Obesidade Grau I\n";
		}
		else if((this.imc >= 35) && (imc <= 39.9)) {
			return "IMC: Obesidade Grau II\n";
		}
		else {
			return "IMC: Obesidade Grau III/ Mórbida\n";
		}
	}
}
