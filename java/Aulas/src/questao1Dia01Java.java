import java.util.Scanner;

public class questao1Dia01Java {
	public static void main(String[] args) {
		int dia=0,mes=0,ano=0,totalDia=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quantos anos voc� tem: ");
		ano= scan.nextInt();
		System.out.println("Dgite qual o m�s do seu anivers�rio: ");
		mes= scan.nextInt();
		System.out.println("Digite o dia do seu anivers�rio: ");
		dia= scan.nextInt();
		totalDia= dia+(mes*30)+(ano*365);
		
		System.out.println("Voc� tem: "+totalDia+"dias de vida!");
	}

}
