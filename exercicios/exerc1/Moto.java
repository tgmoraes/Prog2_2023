package exercicios.exerc1;

class Moto {
	String modelo;
	int velocidade;
	double gasolina;
	
	void acelerar(int valor) {
		if (valor>0) {
			this.velocidade = this.velocidade + valor;
			this.gasolina = this.gasolina - (valor*0.1);
		}
	}
	void frear(int valor) {
		if(valor > this.velocidade) {
			this.velocidade = 0;
		} else {
			if(valor > 0) {
				this.velocidade = this.velocidade - valor; 
			}
		}
	}
	void abastecer(int gasol) {
		this.gasolina = this.gasolina + gasol;
	}
}
