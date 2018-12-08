class Empresa {

	private String nome;
	private Frota frota;

	Empresa(String nome) {
		this.nome = nome;
		this.frota = new Frota();
	}

	public Frota getFrota() {
		return this.frota;
	}

}