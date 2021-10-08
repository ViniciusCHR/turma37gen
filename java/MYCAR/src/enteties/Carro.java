package enteties;

public class Carro {
	private String placa;
	private String modelo;
	private boolean ligado;
	private int anoFabricacao;
	private String fabricante;
	private int marcha;
	private double velocidade;
	
	public Carro(String placa, String modelo, String fabricante) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.fabricante = fabricante;
			
	}
	
	public Carro() {
		
	}
	
	//encapsulamento ou segurança de dados

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public void subirMarcha() {
		if this.ligado
	}

}
