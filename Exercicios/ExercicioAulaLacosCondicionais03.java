package Exercicios;

import java.util.Scanner;

public class ExercicioAulaLacosCondicionais03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		double q, r1, r2, r3, r4;
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com o segundo n�mero: ");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com o terceiro n�mero: ");
		n3 = leia.nextFloat();
		System.out.println("\nEntre com o quarto n�mero: ");
		n4 = leia.nextFloat();
		
		r1 = Math.sqrt(n1);
		r2 = Math.sqrt(n2);
		r3 = Math.sqrt(n3);
		r4 = Math.sqrt(n4);
		
		if(r3>=1000)
		{
			System.out.println("\nO quadrado do n�: " + n3 + " � " + r3);
			
		}
		
		else
		{
			System.out.println("\nO quadrado do n�:" + n1 + " � " + r1);
			System.out.println("\nO quadrado do n�:" + n2 + " � " + r2);
			System.out.println("\nO quadrado do n�:" + n3 + " � " + r3);
			System.out.println("\nO quadrado do n�:" + n4 + " � " + r4);
		}
	
		
		

	}

}
