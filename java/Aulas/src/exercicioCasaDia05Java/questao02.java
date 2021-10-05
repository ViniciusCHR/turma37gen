package exercicioCasaDia05Java;

import java.util.Scanner;

public class questao02 {

//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade = 0, contador21 = 0, contador50 = 0;

		while (idade != -99) {
			System.out.println("Digite a idade das pessoas: ");
			idade = scan.nextInt();
			if (idade < 21) {
				contador21++;
			} else if (idade > 50) {
				contador50++;
			}

		}
		System.out.println(contador21);
		System.out.println(contador50);
	}
}