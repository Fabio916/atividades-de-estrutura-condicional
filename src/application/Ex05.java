package application;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.print("Informe a sua altura: ");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if (imc < 20) {
			System.out.println("Abaixo do peso");
		}
		else if (imc < 25) {
			System.out.println("Peso normal");
		}
		else if (imc < 30) {
			System.out.println("Sobrepeso");
		}
		else if (imc < 40) {
			System.out.println("Obeso");
		}
		else {
			System.out.println("Obeso mórbido");
		}
		sc.close();
	}

}
