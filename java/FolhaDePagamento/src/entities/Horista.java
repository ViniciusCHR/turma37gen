package entities;

public class Horista {
	private String cpf;
	private String nome;
	private double valorHora;
	private int horaTrabalhada;

	public Horista(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;

	}

	public double pagamentoHorista(int horaTrabalhada, double valorHora) {
		return valorHora * horaTrabalhada;
	}

	public String getNome() {
		return nome;
	}
}