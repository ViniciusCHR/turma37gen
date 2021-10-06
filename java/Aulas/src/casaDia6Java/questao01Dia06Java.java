package casaDia6Java;
import java.util.Scanner;
public class questao01Dia06Java {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade
//e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
		int vetor[] = new int[5];
		int maior=0;
		
		while(true) {
			maior=0;
			for (int x=0;x<vetor.length;x++) {
				System.out.println("Digite os 5 valores das atividades");
				vetor[x] = scan.nextInt();	
				
				if (vetor[x] > maior) {
					maior = vetor[x];
				}
				
			}
		System.out.println("O maior valor é: "+maior);
		
		}
		
		


	}

}
