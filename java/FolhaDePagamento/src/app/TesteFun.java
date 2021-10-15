package app;

import entities.Funcionario;
import entities.Terceiro2;
import entities.Horista;

public class TesteFun {
	public static void main(String[]args) {
		
		Funcionario func1 = new Funcionario("001", "Epa");
		Terceiro2 ter1 = new Terceiro2("010", "Maria",80.00);
		
		Horista colab1 = new Horista("111","Marcos");
		
		System.out.println("Pagamento Horista: "+colab1.pagamentoHorista(4, 20.55));
		
		func1.setHoraTrabalhada(80);
		func1.setValorHora(10.00);
		
		ter1.setValorHora(40);
		ter1.setValorHora(10.00);
		
		System.out.println("Salario do funcionario "+func1.getNome()+"Reias:"+func1.calculoSalario()+"Ferias Reais: "+func1.ferias());
		System.out.println("Salario do funcionario "+ter1.getNome()+"Reias:"+ter1.calculoSalario()+"Ferias Reais: "+ter1.ferias());
				
	}
}
