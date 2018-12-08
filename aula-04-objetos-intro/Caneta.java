class Caneta {

	// atributos
	final String cor; // imutável
	private double carga;

	// construtor
	Caneta(String paramCor, double paramCarga) {
		cor = paramCor;
		carga = paramCarga;
	}

	String escrever(String s) {
		this.diminuiCarga(s.length());
		return s;	
	}

	void diminuiCarga(int tamanho) {
		this.carga -= tamanho * 0.01;
	}

	double getCarga() {
		return this.carga;
	}

}