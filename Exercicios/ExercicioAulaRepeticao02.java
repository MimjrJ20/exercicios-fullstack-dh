package Exercicios;

import java.util.Scanner;

public class ExercicioAulaRepeticao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2-Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		int im=0, p=0, x, i;
		
		Scanner leia = new Scanner(System.in);
		
		
		for(i=1; i<=10; i++)
		{
			System.out.println("\nDigite aqui o " + i + "� n�mero:");
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
		
		System.out.println("\nQuantidade de n�meros pares: " + p);
		System.out.println("\nQuantidade de n�meros �mpares: " + im);
		

	}

}
