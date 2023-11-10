package aula10nov;

import java.util.Scanner;

public class Prog {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		Moto motinha = new Moto();
		
		System.out.println("Digite o modelo da moto:");
		
		//motinha.modelo = teclado.nextLine();
		motinha.setModelo(teclado.nextLine());
				
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
				System.out.println("Quanto deseja acelerar:");
				motinha.acelerar(teclado.nextInt());
			}
			else if(opcao==1) {
				System.out.println(motinha);
			}
			else if(opcao==3) {
				System.out.println("Quanto deseja frear:");
				motinha.frear(teclado.nextInt());
			}
			else if(opcao==4) {
				System.out.println("Quanto deseja abastecer:");
				motinha.abastecer(teclado.nextInt());
			}
		}
	}
}
