import java.util.Scanner;

public class questao4Dia01Java {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A=0,B=0,C=0,D=0,R=0,S=0;
		System.out.println("Digite o primeiro valor");
		A= scan.nextInt();
		System.out.println("Digite o segundo valor");
		B= scan.nextInt();
		System.out.println("Digite o terceiro valor");
		C= scan.nextInt();
		R= (A+B) * (A+B);
		S= (B+C) * (B+C);
		D= (R+S)/2;
		System.out.println("O valor de D é: "+D);
	}
}
