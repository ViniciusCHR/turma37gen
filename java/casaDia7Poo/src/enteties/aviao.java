package enteties;

public class aviao {
	public String empresa;
	public int capacidade;
	public String anoFabricacao;
	public double valorMercado;
	
	public void exibirNome() {
		System.out.println("Digite o nome da Empresa: "+empresa);
	}
	public void exibirCapacidade(){
		System.out.println("Digite a capacidade do avião: "+capacidade);
	}
	public void exibirAnoFabricacao() {
		System.out.println("Digite o ano de fabricação do avião: "+anoFabricacao);
	}
	public void exibirValorMercado() {
		System.out.println("Digite o valor de mercado: "+valorMercado);
	}
}
