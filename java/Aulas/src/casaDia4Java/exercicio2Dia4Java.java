package casaDia4Java;

import java.util.Scanner;

public class exercicio2Dia4Java {
	// Faça um programa que entre com três números e coloque em ordem crescente.
	public static void main(String[] args) {
		int valor1=0, valor2=0, valor3=0, valor=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		valor1= scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2= scan.nextInt();
		System.out.println("Digite o terceiro valor: ");
		valor3= scan.nextInt();
		
		/*if (valor1 > valor2 && valor1 > valor3) {
			if (valor2 <valor1 && valor2 > valor3) {
				System.out.println("O maior valor é: "+valor1+ "O segundo maior valor é: "+valor2+ "E o menor valor é: "+valor3);
			}
		}
		else if (valor2 > valor1 && valor2 > valor3) {
			if (valor1 < valor2 && valor1 > valor3) {
				System.out.println("O maior valor é: " +valor2+ "O segundo maior valor é: " +valor1+ "E o menor valor é: " +valor3);
			}
		}
		else if (valor3 > valor1 && valor3 > valor2) {
			if (valor1 < valor3 && valor1 > valor2) {
				System.out.println("O maior valor é: " +valor3+ "O segundo maior valor é: " +valor1+ "E o menor valor é: " +valor3);
			}
		}*/
		if(valor1>valor2) {
			valor = valor1;
			valor1=valor2;
			valor2=valor;
		}
		if(valor2>valor3) {
			valor = valor2;
			valor2=valor3;
			valor3=valor;
		}
		if(valor1>valor2) {
			valor = valor1;
			valor1=valor2;
			valor2=valor;
		}
		System.out.println("ordem: "+ valor1 + " " + valor2 + " " +valor3);
	}

}
