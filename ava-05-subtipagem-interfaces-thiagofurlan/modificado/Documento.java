package modificado;

public abstract class Documento implements IDocumento {
	
	private String tipo = "";
	private String valor = "";
	private int tamanho = 8;
	
	Documento(String tipo, int tamanho) {
		this.tipo = tipo;
		this.tamanho = tamanho;
	}
	
	public String getTexto() {
		return "Informe o " + this.tipo;
	}
	
	public String getValor() {
		return this.valor;
	}
	
	public void setValor(String v) {
		this.valor = v;
	}

	public int getTamanho() {
		return this.tamanho;
	}

	public String getSizeError() {
		return this.tipo + " deve ter " + this.tamanho + " números";
	}

	public String getNumberError() {
		return this.tipo + " deve ter apenas números";
	}

	public String getTipo() {
		return this.tipo;
	}

}
