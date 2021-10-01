import java.util.Scanner;

public class questao2Dia01Java {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int dia = 0, ano = 0, mes = 0;
		System.out.println("Quantos dias de vida você tem: ");
		dia = scan.nextInt();

		ano = dia / 360;
		mes = (dia % 365) / 30;
		dia = (dia % 365) % 30;

		System.out.println("Sua idade em Anos: " +ano+ " Meses: " +mes+" Dias: " +dia);
	}

}

//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias
