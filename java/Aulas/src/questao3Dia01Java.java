import java.util.Scanner;

public class questao3Dia01Java {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int horas = 0, minutos = 0, segundos = 0, seg = 0;
		System.out.println("Digite a duração do evento em  segundos: ");
		segundos = scan.nextInt();
		horas = (segundos / 3600);
		minutos = ((segundos % 3600) / 60);
		seg = ((segundos % 3600) % 60);
		System.out.println("O evento durou: " + horas + " horas, " + minutos + " minutis e " + seg + " segundos.");
	}
}