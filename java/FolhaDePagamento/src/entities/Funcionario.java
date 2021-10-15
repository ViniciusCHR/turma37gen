package entities;

public class Funcionario {
	private String matricula;
	private String nome;
	protected int horaTrabalhada;
	protected double valorHora;
	
	public Funcionario(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHoraTrabalhada() {
		return horaTrabalhada;
	}
	public void setHoraTrabalhada(int horaTrabalhada) {
		this.horaTrabalhada = horaTrabalhada;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public double calculoSalario() {
		return (this.horaTrabalhada * this.valorHora);
	}
	public double ferias() {
		return (calculoSalario() * 1.3);
	}
}
