package casaDia4Java;

import java.util.Scanner;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

public class exercicio1Dia04 {
	public static void main(String[] args) {
		int valor1=0,valor2=0,valor3=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		valor1= scan.nextInt();
		System.out.println("Digite o segundo valor");
		valor2= scan.nextInt();
		System.out.println("Digite o terceiro valor");
		valor3= scan.nextInt();
		if (valor1 >= valor2 && valor1 >= valor3) {
				System.out.println("O maior valor �: "+valor1);
		}
		else if(valor2 >= valor1 && valor2 >= valor3) {
			
			System.out.println("O maior valor �: "+valor2);	
			}
		else if (valor3 >= valor2 && valor3 >= valor1) {
				System.out.println("O maior valor �: "+valor3);	
			}
	}
}
