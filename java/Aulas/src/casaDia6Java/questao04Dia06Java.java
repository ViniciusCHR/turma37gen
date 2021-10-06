package casaDia6Java;

import java.util.Scanner;

//Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida,
//exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, 
//diagonal principal

public class questao04Dia06Java {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int l = 0;
		int c = 0;
		int soma = 0;
		int somaT = 0;

		System.out.println("Matriz[3][3]\n");

		for (l = 0; l < 3; l++) {

			for (c = 0; c < 3; c++) {

				System.out.printf("Digite o elemento da Matriz[%d][%d]: ", l + 1, c + 1);
				matriz[l][c] = scan.nextInt();

			}
		}

		for (l = 0; l < matriz.length; l++) {
			for (c = 0; c < matriz[l].length; c++) {
				
				somaT += matriz[l][c];
			}
		}
		System.out.printf("\n");
		System.out.printf("A soma de todos os valores da matriz é: %d", somaT);
		soma = matriz[0][0] + matriz[1][1] + matriz[2][2];
		System.out.printf("\n");
		System.out.printf("A soma da diagonal principa da matriz é: %d", soma);
	}
}
