package reforco;

public class Vendedor extends Pessoa {
	public String loja;

	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}

	public void oqueFaz() {
		System.out.println("Este (a) vendedor(a) atende pelo nome: " + getNome() + " atua na loja: " + getLoja());
	}

}
