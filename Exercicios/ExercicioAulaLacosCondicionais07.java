package Exercicios;

import java.util.Scanner;

public class ExercicioAulaLacosCondicionais07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float b, a, aa;
		
		System.out.println("\nEntre com o valor da base do tri�ngulo: ");
		b = leia.nextFloat();
		System.out.println("\nEntre com o valor da altura do tri�ngulo: ");
		a = leia.nextFloat();
		
		aa = b*a;
		
		if(b>0 && a>0)
		{
			System.out.printf("\nO valor da �rea do tri�ngulo � de: %.1f", aa);
		}
		else
		{
			System.out.println("\nUm ou mais valores inseridos s�o inv�lidos.");
		}

	}

}
