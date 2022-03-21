package Exercicios;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ExercicioAulaRepeticao07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Um funcion�rio de uma empresa recebe aumento salarial anualmente. Sabe-se que:
		a) Esse funcion�rio foi contratado em 1995, com o sal�rio inicial de R$1000,00;
		b) Em 1996 recebeu um aumento de 1,5% sobre o seu sal�rio inicial;
		c) A partir de 1997 (inclusive), os aumentos salariais sempre corresponderam ao
		dobro do percentual do ano anterior.
		Fa�a um programa que determine o sal�rio atual desse funcion�rio.
		*/
		
		int ano1, ano2; 
		double salario, aumento, salarioAtual, p;
		
		
		Scanner leia = new Scanner(System.in);
		
		
		Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int anoAtual = calendar.get(Calendar.YEAR)+1;
        
        
        System.out.println("\nEntre com o ano que come�ou a trabalhar: ");
        ano1 = leia.nextInt(); 
        System.out.println("\nEntra com o seu sal�rio incial: ");
        salario = leia.nextDouble();
        System.out.println("\nEntre com o aumento: ");
        aumento = leia.nextDouble();
        		
        p = aumento/100;
        
        
        
        do
        {
   
			
        	salario+=salario*p;
			ano1++;
			NumberFormat n = NumberFormat.getCurrencyInstance();
			// vari�vel chamado n
			// get Currency Instance vai pegar a moeda do seu pa�s
			// d� para alterar a moeda "locale"
			n.setMinimumFractionDigits(2);
			// m�todo "set minimum fraction digits" fala quantas casas eu quero depois da v�rgula
			String x = n.format(salario);
		    // m�todo "format" para formatar o sal�rio em monet�rio
			System.out.println("\n\nNo ano de: "+ano1+" o sal�rio foi para: " +x);
			p=p*2;
			
			
        }
        
        while(ano1<anoAtual-1);
        
        
        

	}

}
