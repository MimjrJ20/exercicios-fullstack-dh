package Exercicios;

import java.util.Scanner;

public class ExercicioAulaLacosCondicionais04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int n;
		
		System.out.println("\nEntre com um n�mero inteiro: ");
		n = leia.nextInt();
		
		if(n%2==0) 
		{
			if(n>=0)
			{
				System.out.println("\nEsse n�mero � par e positivo.");
			}
			else
			{
				System.out.println("\nEsse n�mero � par e negativo.");
			}
		}
		else
		{
			if(n>=0)
			{
				System.out.println("\nEsse n�mero � �mpar e positivo.");
			}
			else
			{
				System.out.println("\nEsse n�mero � �mpar e negativo.");
			}
			}

	}

}
