package Exercicios;

import java.util.Scanner;

public class ExercicioAulaLacosCondicionais05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float i;
		
		System.out.println("\nEntre com o n�mero do �ndice: ");
		i = leia.nextFloat();
		
		if(i>=0.05 && i<=0.25)
		{
			System.out.printf("\nO �ndice de: %.2f � aceit�vel.", i);
		}
			else if(i>0.3 && i<0.4)
			{
				System.out.printf("\nAs ind�strias do Grupo 1 est�o intimadas a suspenderem suas atividades devido o �ndice de %.2f.", i);
			}
			else if(i>=0.4 && i<0.5)
			{
				System.out.printf("\nAs ind�strias dos Grupos 1 e 2 est�o intimadas a suspenderem suas atividades devido o �ndice de %.2f.", i);
			}
			else if(i>=0.5)
			{
				System.out.printf("\nAs ind�strias dos Grupos 1, 2 e 3 est�o intimadas a suspenderem suas atividades devido o �ndice de %.2f.", i);
			}
			else
			{
				System.out.printf("\nTal �ndice de %.2f n�o requer a��es.", i);
			}

	}

}
