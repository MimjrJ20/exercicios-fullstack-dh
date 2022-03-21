package Exercicios;

import java.util.Scanner;

public class ExercicioAulaRepeticao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 5-Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.(DO...WHILE)
		*/
		
		int n, n1=0, n2, n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o número: ");
		n = leia.nextInt();
		
		do
		//executa primeiro depois testa a condição
		{
			n2 = n + n1;
			System.out.println("\nNúmero demonstrado: " + n2);
			n1--;//-- para decrementar a cada passagem
			
		}
		
		while(n2>0);//testa primeiro depois executa
		
		{
			n3 = (1 + n) * n / 2;
			System.out.println("\n\nSoma dos números: " + n3);
		}

	}

}
