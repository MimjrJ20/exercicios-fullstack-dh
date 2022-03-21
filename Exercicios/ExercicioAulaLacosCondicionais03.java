package Exercicios;

import java.util.Scanner;

public class ExercicioAulaLacosCondicionais03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		double q, r1, r2, r3, r4;
		
		System.out.println("\nEntre com o primeiro número: ");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com o segundo número: ");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com o terceiro número: ");
		n3 = leia.nextFloat();
		System.out.println("\nEntre com o quarto número: ");
		n4 = leia.nextFloat();
		
		r1 = Math.sqrt(n1);
		r2 = Math.sqrt(n2);
		r3 = Math.sqrt(n3);
		r4 = Math.sqrt(n4);
		
		if(r3>=1000)
		{
			System.out.println("\nO quadrado do nº: " + n3 + " é " + r3);
			
		}
		
		else
		{
			System.out.println("\nO quadrado do nº:" + n1 + " é " + r1);
			System.out.println("\nO quadrado do nº:" + n2 + " é " + r2);
			System.out.println("\nO quadrado do nº:" + n3 + " é " + r3);
			System.out.println("\nO quadrado do nº:" + n4 + " é " + r4);
		}
	
		
		

	}

}
