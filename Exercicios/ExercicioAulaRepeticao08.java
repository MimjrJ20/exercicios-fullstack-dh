package Exercicios;

import java.util.Scanner;

public class ExercicioAulaRepeticao08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*– Faça um programa que leia um valor N inteiro e positivo, calcule e mostre o valor de
		E, conforme a fórmula a seguir:
		E = 1 + 1! + 1 + 2! + 1 + 3! + ... + 1/N!
		*/
		
		Scanner leia = new Scanner(System.in);
		
		int n, e, fat=1;
		
		System.out.println("\nQula número deseja calcular o fatorial? \nEntre com um número inteiro e positivo: ");
		n = leia.nextInt();
		
		
		do
		{
			fat = fat * n;
			e = 1 + fat;
			
			
			System.out.println("\nResultdado de E: " + e);
			
			n--;
			
		}
		while(n>0);
		
		

	}

}
