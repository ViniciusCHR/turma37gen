package exercicioCasaDia05Java;

import java.util.Scanner;
//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
//No final, mostre a soma dos n�meros digitados
public class questao6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=0,soma=0;
		do {

			System.out.println("Digite um numero: ");
			num= scan.nextInt();

			soma += num;

			}
			while(num != 0);

			System.out.println("Soma = "+ soma);

			}


}
