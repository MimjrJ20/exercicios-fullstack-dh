package Exercicios;

import java.util.Scanner;

public class ExercicioAulaLacosCondicionais08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int n;
		
		System.out.println("\nInsira o n�mero desejado: ");
		n = leia.nextInt();
		
		if(n>100)
		{
			System.out.printf("\nValor de %d � v�lido.", n);
		}
		else
		{
			System.out.println("\nValor 0.");
		}

	}

}
