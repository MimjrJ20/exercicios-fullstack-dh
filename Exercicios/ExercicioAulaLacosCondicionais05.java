package Exercicios;

import java.util.Scanner;

public class ExercicioAulaLacosCondicionais05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float i;
		
		System.out.println("\nEntre com o número do índice: ");
		i = leia.nextFloat();
		
		if(i>=0.05 && i<=0.25)
		{
			System.out.printf("\nO índice de: %.2f é aceitável.", i);
		}
			else if(i>0.3 && i<0.4)
			{
				System.out.printf("\nAs indústrias do Grupo 1 estão intimadas a suspenderem suas atividades devido o índice de %.2f.", i);
			}
			else if(i>=0.4 && i<0.5)
			{
				System.out.printf("\nAs indústrias dos Grupos 1 e 2 estão intimadas a suspenderem suas atividades devido o índice de %.2f.", i);
			}
			else if(i>=0.5)
			{
				System.out.printf("\nAs indústrias dos Grupos 1, 2 e 3 estão intimadas a suspenderem suas atividades devido o índice de %.2f.", i);
			}
			else
			{
				System.out.printf("\nTal índice de %.2f não requer ações.", i);
			}

	}

}
