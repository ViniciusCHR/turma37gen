package entities;

public class Terceiro2 extends Funcionario{
	private double adicional;

	public Terceiro2(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}	

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override
	public double calculoSalario() {
		 //return (super.getHoraTrabalhada() * super.getValorHora()) + this.adicional;
		return (this.horaTrabalhada * this.valorHora) + adicional;
	}

	@Override
	public double ferias() {
		return (calculoSalario() * 1.3);
	}
	
}
