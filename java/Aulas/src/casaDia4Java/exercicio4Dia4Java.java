package casaDia4Java;

import java.util.Scanner;
//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
//Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.

public class exercicio4Dia4Java {

	public static void main(String[] args) {
		double x=0, resultado=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor qualquer: ");
		x= scan.nextDouble();
		
		if((x % 2) == 0) {
			resultado= Math.sqrt(x);
			System.out.println("O valor � par e sua raiz �: "+resultado); 
		}
		else {
			resultado= x * x;
			System.out.println("O valor � impar e " +resultado+ " � seu valor ao quadrado");
		}

	}

}
