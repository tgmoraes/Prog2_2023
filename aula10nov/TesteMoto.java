package aula10nov;

public class TesteMoto {
	public static void main(String[] args) {
		Moto m = new Moto("biz");
		Moto m2 = new Moto();
		m2.setModelo("biz");
		m2.abastecer(10);
		m2.acelerar(10);
		m.abastecer(10);
		m.acelerar(10);

		
		Moto m3 = new Moto("ybr");
		Moto mIden;

		mIden = m3;
		mIden.abastecer(20);
		mIden.acelerar(30);
		
		System.out.println("===========testes toString=========");
		System.out.println(m.toString());
		System.out.println(m);

		System.out.println("===========testes igualdade e identidade=========");
		//mIden é identico a m3 pois referencia mesmo espaco de memoria
		System.out.println(mIden.equals(m3)==true);
		//m não é identico a m2 apesar de ser igual
		System.out.println((m==m2)==false);			  
		//m é igual a m2 apesar de não ser identico
		System.out.println(m.equals(m2)==true);	  
		//m não é igual a m3 
		System.out.println(m.equals(m3)==false);
		Moto mNull = null;
		// m não é igual a null
		System.out.println(m.equals(mNull)==false);
		// m não é igual a String "oi"
		System.out.println(m.equals("oi")==false);
		
		System.out.println("===========testes velocidade e gasolina=========");
		System.out.println(m.getVelocidade()==10);
		System.out.println(m.getGasolina()==9);

		m.acelerar(-10);
		System.out.println(m.getVelocidade()==10);
		System.out.println(m.getGasolina()==9);

		m.acelerar(110); // consegue acelerar só 90 por que tem 9 litros de gasolina
		System.out.println(m.getVelocidade()==100);
		System.out.println(m.getGasolina()==0);

		m.frear(5);
		System.out.println(m.getVelocidade() == 95);
		m.frear(125); // até parar
		
		System.out.println(m.getVelocidade() == 0);
		m.acelerar(5); //sem gasolina não aumenta velociadde

		System.out.println(m.getVelocidade() == 0);
	}
}
