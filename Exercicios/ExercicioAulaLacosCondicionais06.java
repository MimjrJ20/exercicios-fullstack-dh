package Exercicios;

import java.util.Scanner;

public class ExercicioAulaLacosCondicionais06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("\nEntre com a idade: ");
		idade = leia.nextInt();
		
		if(idade>=5 && idade<=7)
		{
			System.out.printf("\nCom a idade de %d anos o nadador está na categoria INFANTIL A.", idade);
		}
			else if(idade>=8 && idade<=11)
			{
				System.out.printf("\nCom a idade de %d anos o nadador está na categoria INFANTIL B.", idade);
			}
			else if(idade>=12 && idade<=13)
			{
				System.out.printf("\nCom a idade de %d anos o nadador está na categoria JUVENIL A.", idade);
			}
			else if(idade>=14 && idade<=17)
			{
				System.out.printf("\nCom a idade de %d anos o nadador está na categoria JUVENIL B.", idade);
			}
			else
			{
				System.out.printf("\nCom a idade de %d anos o nadador está na categoria ADULTOS.", idade);
			}


	}

}
