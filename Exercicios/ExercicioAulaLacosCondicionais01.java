package Exercicios;

import java.util.Scanner;

public class ExercicioAulaLacosCondicionais01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float p, e, m;
	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o peso do tomate comprado: ");
		p = leia.nextFloat();
		
		e = p - 50;
		m = e * 4;
				
		if(p<=50 && p>0)
		{
			System.out.println("\nNão houve excesso de peso (sem multa).");
		}	
		else if(p>50)
		{
			System.out.println("\nHouve um excesso de peso na compra de tomate, que foi de: " + e + " kilos.");
			System.out.printf("\nE a multa foi de R$: %.2f.", m);
			
		}
		else
		{
			System.out.println("\nNão teve compra de tomate.");
		}
			
		

	}

}
