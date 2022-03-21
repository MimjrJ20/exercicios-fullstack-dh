package Exercicios;

import java.util.Scanner;

public class ExercicioAulaLacosCondicionais02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float c, n, e, s, ss, sss;
		
		System.out.println("\nEntre com a horas trabalhadas:");
		n = leia.nextFloat();
		
		e = n - 50;
		s = n*10;
		ss = e*20;
		sss = s + ss;
		
				
		
		if(n<=50 && n>0)
		{
			System.out.println("\nNão houve excesso de horas trabalhadas.");
			System.out.printf("\nE o salário foi de R$: %.2f.", s);
		}	
		else if(n>50)
		{
			System.out.println("\nHouve um excesso de horas trabalhadas, que foi de: " + e + " horas.");
			System.out.printf("\nE o salário de horas normal foi de R$: %.2f.", s);
			System.out.printf("\nE o salário excedente foi de R$: %.2f.", ss);
			System.out.printf("\nE o salário total foi de R$: %.2f.", sss);
			
		}
		else
		{
			System.out.println("\nNão teve horas trabalhadas.");
		}

	}

}
