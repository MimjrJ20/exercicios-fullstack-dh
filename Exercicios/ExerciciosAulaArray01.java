package Exercicios;

public class ExerciciosAulaArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaração da array:
		String [] coresDoArcoIris = new String [7];
		
		//atribuir valores no array:
		coresDoArcoIris[0] = "vermelho";
		coresDoArcoIris[1] = "azul";
		coresDoArcoIris[2] = "roxo";
		coresDoArcoIris[3] = "rosa";
		coresDoArcoIris[4] = "verde";
		coresDoArcoIris[5] = "amarelo";
		coresDoArcoIris[6] = "branco";
		
		//percorrer o array:		
		for (int i=0;i<7;i++)
		{
			System.out.println(coresDoArcoIris[i]);
		}
	}

}
