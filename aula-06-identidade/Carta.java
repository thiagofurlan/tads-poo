class Carta {

	final Valor valor;
	final Naipe naipe;

	Carta(Valor v, Naipe n) {
		this.valor = v;
		this.naipe = n;
	}

	@Override
	public String toString() {
		return this.valor + " de " + this.naipe;
	}
	
}