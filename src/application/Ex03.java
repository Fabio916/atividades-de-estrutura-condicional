package application;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		float n2 = sc.nextFloat();
		
		float avg = (n1 + n2) / 2;
		
		if (avg >= 6.0) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
		}
		
		sc.close();
	}

}
