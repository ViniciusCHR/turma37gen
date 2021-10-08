package app;

import java.util.Scanner;
import enteties.Cliente;

public class CadCliente {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Cliente cliente = new Cliente();
		int opcao;

		System.out.println("Digite o nome do cliente: ");
		cliente.nome = leia.next();
		System.out.println("Digite o ano de nascimento do cliente: ");
		cliente.anoNascimento = leia.nextInt();
		System.out.println("Digite o cpf do cliente: ");
		cliente.cpf = leia.next();
		System.out.println("Digite a forma de pagamento: 1-Crédito, 2-Débito, 3-Parcelado");
		opcao = leia.nextInt();

		if (opcao == 1) {
			cliente.formaPagamento = "Crédito";
		} else if (opcao == 2) {
			cliente.formaPagamento = "débito";

		} else if (opcao == 3) {
			cliente.formaPagamento = "parcelado";
		}
		System.out.println("A idade do cliente é: "+cliente.idade(cliente.anoNascimento));
		System.out.println(cliente.toString());
	}

}
