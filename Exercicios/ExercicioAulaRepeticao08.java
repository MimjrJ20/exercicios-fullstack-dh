package Exercicios;

import java.util.Scanner;

public class ExercicioAulaRepeticao08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*� Fa�a um programa que leia um valor N inteiro e positivo, calcule e mostre o valor de
		E, conforme a f�rmula a seguir:
		E = 1 + 1! + 1 + 2! + 1 + 3! + ... + 1/N!
		*/
		
		Scanner leia = new Scanner(System.in);
		
		int n, e, fat=1;
		
		System.out.println("\nQula n�mero deseja calcular o fatorial? \nEntre com um n�mero inteiro e positivo: ");
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
