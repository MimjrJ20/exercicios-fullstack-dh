package Exercicios;

import java.util.Scanner;

public class ExercicioAulaRepeticao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 4-Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. 
		 * Para tanto, a cada uma das pessoas era perguntado: c). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		 * o n�mero de pessoas calmas; 
		 * o n�mero de mulheres nervosas; 
		 * o n�mero de homens agressivos; 
		 * o n�mero de outros calmos;
		 * o n�mero de pessoas nervosas com mais de 40 anos; 
		 * o n�mero de pessoas calmas com menos de 18 anos.
		*/
		
		// n�o consegui usar WHILE
		
		int id, s, temp, max1=3, max2=100, min1=1, pc=0, mn=0, ha=0, oc=0, pn=0, pc1=0;
		

		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nConforme os dados abaixo: \n\nIdade; \n\nSexo \n1 - Feminino \n2 - Masculino \n3 - Outros\r\n"
				+ "\nTemperamento: \n1 - Calma \n2 - Nervosa \n3 - Agressiva");
	
		
		for(int i=1; i<=150; i++)
		{
			
			id = (int) Math.floor(Math.random()*(max2-min1+1)+min1);//para pegar n�meros randomicos
			
			s = (int) Math.floor(Math.random()*(max1-min1+1)+min1);//para pegar n�meros randomicos

			temp = (int) Math.floor(Math.random()*(max1-min1+1)+min1);//para pegar n�meros randomicos
			
			
			
			System.out.println("\n\nPessoa n� " + i + "-->");
			
			System.out.printf("\nDigita a idade da pessoa: %d anos.", id);
			
			System.out.printf("\nDigita a sexo da pessoa: %d", s);

			System.out.printf("\nDigita o temperamento da pessoa: %d", temp);
		
			
			if(temp == 1)
			{
					pc++;
			}
			if(s == 1 && temp == 2)
			{
					mn++;
			}
			if(s == 2 && temp == 3)
			{
					ha++;
			}
			if(s == 3 && temp == 1)
			{
					oc++;
			}
			if(temp == 2 && id >= 40)
			{
					pn++;
			}
			if(temp == 1 && id <= 18)
			{
					pc1++;
			}
		
			
		}	
		
		System.out.println("\n\n\nSolu��o:");
		System.out.println("\nTotal de pessoas calmas: " + pc);
		System.out.println("\nTotal de mulheres nervosas: " + mn);
		System.out.println("\nTotal de homens agressivos: " + ha);
		System.out.println("\nTotal de outros calmos: " + oc);
		System.out.println("\nTotal de pessoas nervosas com mais de 40 anos: " + pn);
		System.out.println("\nTotal de pessoas calmas com menos de 18 anos: " + pc1);
		

	}

}
