package Exercicios;

import java.util.Scanner;

public class ExercicioAulaRepeticao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1-Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1000; x<=1999; x++)
		{
			if(x % 11 ==5) //porcento � a divis�o e o resultado � o resto, exemplo: 1006/11 o resto � 5.
			{	
			System.out.println(x);	
			}
			
		}
		

	}

}
