package application;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código referente ao tipo da diária (S), (D) OU (T): ");
		char tipoHospedagem = sc.next().toUpperCase().charAt(0);
		
		System.out.print("Digite a quantidade de diárias: ");
		int qtdiarias = sc.nextInt();
		
		double valorTotal = 0;
		if (tipoHospedagem == 'S') {
			valorTotal = qtdiarias * 255.50;
		}
		else if (tipoHospedagem == 'D') {
			valorTotal = qtdiarias * 305.50;
		}
		else if (tipoHospedagem == 'T') {
			valorTotal = qtdiarias * 360.50;
		}
		else {
			System.out.println("Tipo de diária inválido");
		}
		
		System.out.printf("Valor total das diárias: %.2f", valorTotal);
		
		
		sc.close();
	}

}
