class Dinheiro {

	// esconder como é armazenado (ENCAPSULAMENTO)

	private int reais;
	private int centavos;

	Dinheiro(int reais, int centavos) {
		this.reais = reais;
		this.centavos = centavos;
	}

	Dinheiro(int reais) {
		this.reais = reais;
		this.centavos = 0;	
	}

	int reais() {
		return this.reais;
	}

	int centavos() {
		return this.centavos;
	}

	@Override
	public String toString() {
		if (this.centavos < 10) return "R$ " + this.reais + ",0" + this.centavos;
		return "R$ " + this.reais + "," + this.centavos;
	}

	@Override
	public boolean equals(Object obj) {
		Dinheiro d = (Dinheiro) obj;
		return this.reais == d.reais && this.centavos == d.centavos;
	}

}