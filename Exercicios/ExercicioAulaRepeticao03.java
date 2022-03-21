package Exercicios;

import java.util.Scanner;

public class ExercicioAulaRepeticao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*3-Solicitar a idade de várias pessoas e imprimir: 
		 * Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos. 
		 * O programa termina quando idade for =-99. (WHILE)
		 */
		
		int p, id, a=0, b=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o nº de pessoas: ");
		p = leia.nextInt();
		
		for(int i=1; i<=p; i++)
		{
			System.out.println("\nPessoa nº " + i + ":");
			System.out.println("\nDigita a idade da pessoa ou -99 para sair do programa: ");
			id = leia.nextInt();
			
			if(id == -99)
			{
				System.out.println("\nFim.");
				break;
			}
			else
			{
				if(id>0 && id<21)
				{
					a++;
				}
				if(id>0 && id>50)
				{
					b++;
				}
			
				while(id <0)//while repete o comando se true
					
				{
					System.out.println("\nPessoa nº " + i + ":");
					System.out.println("\nIdade inválida! Digita a idade da pessoa ou -99 para sair do programa: ");
					id = leia.nextInt();
					
					if(id>0 && id<21)
					{
						a++;
					}
					if(id>0 && id>50)
					{
						b++;
					}
				}
			
			}
		}
		
		System.out.println("\nSolução:");
		System.out.println("\nTotal de pessoas com menos de 21 anos: " + a);
		System.out.println("\nTotal de pessoas com mais de 50 anos: " + b);

	}
}
