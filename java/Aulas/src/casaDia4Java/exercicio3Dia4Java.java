package casaDia4Java;

import java.util.Scanner;
/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
*/

public class exercicio3Dia4Java {

	public static void main(String[] args) {
		int idade = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = scan.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.println("Voc� faz parte do p�blico infantil!");
		}
		else if (idade >= 15 && idade <= 17) {
				System.out.println("Voc� faz parte do p�blico juvenil!");
		}
		else if (idade >=18 && idade <=25) {
				System.out.println("Voc� faz parte do p�blico adulto");
		}
		else {
					System.out.println("Sua idade n�o faz parte dos padr�es do programa!");
				}
	}

}
