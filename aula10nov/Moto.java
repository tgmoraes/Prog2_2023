package aula10nov;

public class Moto {
	private String modelo;
	private int velocidade;
	private double gasolina;
	
	public Moto() {
		this.velocidade = 0;
		this.gasolina   = 0;
	}
	
	public Moto(String modelo) {
		this();
		this.modelo = modelo;
	}
	
	public void setModelo(String novoModelo) {
		this.modelo = novoModelo;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public double getGasolina() {
		return this.gasolina;
	}
	
	public int getVelocidade() {
		return this.velocidade;
	}
	
	public void acelerar(int valor) {
		if(valor > 0) {
			//testa se tem gasolina para acelerar valor desejado
			if(this.gasolina > valor*0.1) {
				this.velocidade = this.velocidade + valor;
				this.gasolina = this.gasolina - 0.1*valor;
			} 
			else {
			//logica quando a gasolina é pouca (acelera até esvaziar o tanque)
				this.velocidade += this.gasolina*10;
				this.gasolina = 0;
			}
		}
	}
	
	public void frear(int vel) {
		if(vel > this.velocidade) {
			this.velocidade = 0;
		} else {
			if(vel > 0) {
				this.velocidade = this.velocidade - vel;
			}
		}
	}
	
	public void abastecer(int gasol) {
		if(gasol>0) {
			this.gasolina = this.gasolina + gasol;
		}
	}
	@Override
	public String toString() {
		return ("Moto: "+this.modelo + " - vel:"+this.velocidade + " - gasol no tanque: "+this.gasolina);
	}
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		else if (!o.getClass().isInstance(this)) {
			return false;
		}
		else {
			Moto par = (Moto)o;
			return this.modelo.equals(par.modelo) 
				   && this.velocidade == par.velocidade
				   && this.gasolina == par.gasolina;
		}
	}
}
