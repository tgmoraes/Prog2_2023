package exercicios.exerc1;

public class TesteMoto {
	public static void main(String[] args) {
		Moto m = new Moto();
		m.gasolina = 10;
		m.velocidade = 0;
		m.modelo = "CG Titan";
		
		m.acelerar(10);
		
		System.out.println(m.velocidade==10);
		System.out.println(m.gasolina==9);
		
		m.acelerar(-10);
		System.out.println(m.velocidade==10);
		System.out.println(m.gasolina==9);

		m.frear(5);
		System.out.println(m.velocidade==5);
		System.out.println(m.gasolina==9);

		m.frear(15);
		System.out.println(m.velocidade==0);
		System.out.println(m.gasolina==9);

	}
}
