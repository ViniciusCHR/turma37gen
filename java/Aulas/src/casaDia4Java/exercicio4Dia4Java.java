package casaDia4Java;

import java.util.Scanner;
//Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
//Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

public class exercicio4Dia4Java {

	public static void main(String[] args) {
		double x=0, resultado=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor qualquer: ");
		x= scan.nextDouble();
		
		if((x % 2) == 0) {
			resultado= Math.sqrt(x);
			System.out.println("O valor é par e sua raiz é: "+resultado); 
		}
		else {
			resultado= x * x;
			System.out.println("O valor é impar e " +resultado+ " é seu valor ao quadrado");
		}

	}

}
