package Exercicios;

import java.util.Scanner;

public class ExercicioAulaLacosCondicionais07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float b, a, aa;
		
		System.out.println("\nEntre com o valor da base do triângulo: ");
		b = leia.nextFloat();
		System.out.println("\nEntre com o valor da altura do triângulo: ");
		a = leia.nextFloat();
		
		aa = b*a;
		
		if(b>0 && a>0)
		{
			System.out.printf("\nO valor da área do triângulo é de: %.1f", aa);
		}
		else
		{
			System.out.println("\nUm ou mais valores inseridos são inválidos.");
		}

	}

}
