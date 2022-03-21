package Exercicios;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ExercicioAulaRepeticao07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se que:
		a) Esse funcionário foi contratado em 1995, com o salário inicial de R$1000,00;
		b) Em 1996 recebeu um aumento de 1,5% sobre o seu salário inicial;
		c) A partir de 1997 (inclusive), os aumentos salariais sempre corresponderam ao
		dobro do percentual do ano anterior.
		Faça um programa que determine o salário atual desse funcionário.
		*/
		
		int ano1, ano2; 
		double salario, aumento, salarioAtual, p;
		
		
		Scanner leia = new Scanner(System.in);
		
		
		Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int anoAtual = calendar.get(Calendar.YEAR)+1;
        
        
        System.out.println("\nEntre com o ano que começou a trabalhar: ");
        ano1 = leia.nextInt(); 
        System.out.println("\nEntra com o seu salário incial: ");
        salario = leia.nextDouble();
        System.out.println("\nEntre com o aumento: ");
        aumento = leia.nextDouble();
        		
        p = aumento/100;
        
        
        
        do
        {
   
			
        	salario+=salario*p;
			ano1++;
			NumberFormat n = NumberFormat.getCurrencyInstance();
			// variável chamado n
			// get Currency Instance vai pegar a moeda do seu país
			// dá para alterar a moeda "locale"
			n.setMinimumFractionDigits(2);
			// método "set minimum fraction digits" fala quantas casas eu quero depois da vírgula
			String x = n.format(salario);
		    // método "format" para formatar o salário em monetário
			System.out.println("\n\nNo ano de: "+ano1+" o salário foi para: " +x);
			p=p*2;
			
			
        }
        
        while(ano1<anoAtual-1);
        
        
        

	}

}
