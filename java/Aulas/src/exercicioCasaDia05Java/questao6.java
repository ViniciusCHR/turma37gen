package exercicioCasaDia05Java;

import java.util.Scanner;
//Crie um programa que leia um número do teclado até que encontre um número igual a zero.
//No final, mostre a soma dos números digitados
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
