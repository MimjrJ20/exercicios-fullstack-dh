package Exercicios;

import java.util.Scanner;

public class ExercicioAulaRepeticao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2-Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		int im=0, p=0, x, i;
		
		Scanner leia = new Scanner(System.in);
		
		
		for(i=1; i<=10; i++)
		{
			System.out.println("\nDigite aqui o " + i + "º número:");
			x = leia.nextInt();
			
				if(x % 2 == 0)
				{
					p++;
				}
				else
				{
					im++;
				}
				
		
			
		}
		
		System.out.println("\nQuantidade de números pares: " + p);
		System.out.println("\nQuantidade de números ímpares: " + im);
		

	}

}
