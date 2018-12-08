class ContaCorrente {

	// imutável:
    final int agencia;
    final int numero;
    final String titular;
    // mutável:
    private int saldo = 0;


	ContaCorrente(int agencia, int numero, String titular, int depositoInicial) {
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;

		// validação:
		if (depositoInicial < 50) {
			throw new IllegalArgumentException("dep invalido <50");
		}
		this.agencia = agencia; // this aqui é ContaCorrente
		this.numero = numero;
		this.titular = titular;
		this.saldo += depositoInicial;
	}



	int saldo() {
		return this.saldo;
	}

	void depositar(int valor) {
		this.saldo += valor;
	}

}
