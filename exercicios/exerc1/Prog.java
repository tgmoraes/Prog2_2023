package exercicios.exerc1;

import java.util.Scanner;

public class Prog {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		Moto motinha = new Moto();
		motinha.velocidade = 0;
		motinha.gasolina   = 0;
		
		System.out.println("Digite o modelo da moto:");
		motinha.modelo = teclado.nextLine();
		
		while(true) {
			System.out.println("Digite a opcao desejada:");
			System.out.println("(0) para sair");
			System.out.println("(1) para imprimir");
			System.out.println("(2) para acelerar");
			System.out.println("(3) para frear");
			System.out.println("(4) para abastecer");
			
			opcao = teclado.nextInt();
			if(opcao==0) {
				System.out.println("Ate mais!");
				break;
			}
			
			else if (opcao==2) {
				System.out.println("Digite quanto deseja acelerar:");
				//motinha.acelerar(teclado.nextInt());
				motinha.velocidade += teclado.nextInt();
			}
			else if(opcao==1) {
				System.out.println("Modelo da moto: "+ motinha.modelo);
				System.out.println("Velocidade da moto: "+ motinha.velocidade);
				System.out.println("Gasolina da moto: "+ motinha.gasolina);
			}
			else if (opcao==3) {
				System.out.println("Digite quanto deseja frear:");
				motinha.frear(teclado.nextInt());
			}
			else if (opcao==4) {
				System.out.println("Digite quanto deseja abastecer:");
				motinha.abastecer(teclado.nextInt());
			}
			else {
				System.out.println("Opcao invalida");
			}
		}
	}
}
