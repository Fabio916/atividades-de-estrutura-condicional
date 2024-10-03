package application;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a média: ");
		float media = sc.nextFloat();
		
		System.out.print("Digite o percentual de frequência: ");
		double frequencia = sc.nextDouble();
		
		if (frequencia < 75 && media < 6) {
			System.out.println("Reprovado por nota e falta.");
		}
		else if(frequencia < 75 && media >=6) {
			System.out.println("reprovado por falta.");
		}
		else if(frequencia >= 75 && media < 6) {
			System.out.println("reprovado");
		}
		else {
			System.out.println("Aprovdo.");
		}
		
		sc.close();
	}

}
