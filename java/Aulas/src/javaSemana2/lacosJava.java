package javaSemana2;

import java.util.Scanner;

public class lacosJava {
	/*AUXILIO EMERGENCIAL = 600
	CHEFAS DE FAMILIA = DOBRO
			POR FILHO GANHA +50
			RECEBE OUTRO AUXILIO NÃO PODE RECEBER EMERGENCIAL
			NOME DA PESSOA
			SE ELA É CHEFA DE FAMILIA
			A QTDE DE FILHOS
			E SE PEGOU OUTRO AUXILIO
			MOSTRA O AUXILIO FINAL QUE A MESMA VAI RECEBER OU NÃO
			USAR O TRATAMENTO CONFORME A PESSOA SE DEFINE /O/A/E*/

		public static void main(String[] args) {
			double auxilio=600, valorFiho=50;
			int filhos=0;
			char sexo;
			String nome;
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite seu nome: ");
			nome= scan.nextLine();
			System.out.println("Em relação a seu sexo, como você se define: A/E/O ");
			sexo= scan.Char();
			System.out.println("Você já recebeu outro auxílio? ");
		}
}
