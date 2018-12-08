class Inscrito {

	private String nome;
	private boolean concluido = false;
	private Chave chave;

	Inscrito(String nome) {
		Chave c = new Chave();
		this.nome = nome;
		this.chave = new Chave();
	}

	public String getNome() {
		return this.nome;
	}

	public Boolean isConcluido() {
		return this.concluido;
	}

	public void confirmarPresenca() {
		this.concluido = true;
	}

	public Chave getChave() {
		return this.chave;
	}

	@Override
	public String toString() {
		return this.getNome();
	}

}