package application;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Digite um número inteiro: ");
		int numInt = sc.nextInt();
		
		if(numInt % 2 == 0) {
			System.out.printf("O número %d par!", numInt);
		}
		else {
			System.out.printf("O número %d não é par!", numInt);
		}
		
		sc.close();
	}

}
