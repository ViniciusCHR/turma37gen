package casaDia4Java;

import java.util.Scanner;
/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
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
			System.out.println("Você faz parte do público infantil!");
		}
		else if (idade >= 15 && idade <= 17) {
				System.out.println("Você faz parte do público juvenil!");
		}
		else if (idade >=18 && idade <=25) {
				System.out.println("Você faz parte do público adulto");
		}
		else {
					System.out.println("Sua idade não faz parte dos padrões do programa!");
				}
	}

}
