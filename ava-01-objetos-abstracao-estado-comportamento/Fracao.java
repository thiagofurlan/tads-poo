class Fracao {

	int numerador, denominador;

	Fracao(int n1, int n2) {
		if (n1 < 0 || n2 < 0) throw new UnsupportedOperationException("Esse método não suporta numeros negativos.\n");
		if (n2 == 0) throw new IllegalArgumentException("Divisao por zero.\n");
		this.numerador = n1;
		this.denominador = n2;
	}

	Fracao(int n1) {
		this.numerador = n1;
		this.denominador = 1;
	}

	Fracao() {
		this.numerador = 0;
		this.denominador = 1;
	}

	void mais(int n1, int n2) {
		if (this.denominador == n2) {
			this.numerador += n1;
			this.denominador = n2;
		} else {
			this.numerador = (this.denominador * n1) + (this.numerador * n2);
			this.denominador = this.denominador * n2;
		}
	}

}