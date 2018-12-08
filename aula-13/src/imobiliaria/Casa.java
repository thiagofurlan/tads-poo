package imobiliaria;

public class Casa extends Locacao {
	
	Casa(String endereco, int quartos, int garagem, double valor) {
		super(endereco, quartos, garagem, valor);
	}
	
	@Override
	public String getTipo() {
		return "Casa";
	}

}
