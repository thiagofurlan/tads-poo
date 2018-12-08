class EventoSatelite {

	private String nome;
	private Object tipo;
	private String cidade;
	private Evento evento;
	private List inscritos = new List();

	EventoSatelite(String nome, Evento central, String cidade, Object tipo) {
		this.nome = nome;
		this.evento = central;
		this.cidade = cidade;
		this.tipo = tipo;
	}

	public String getCidade() {
		return this.cidade;
	}

	public Evento getEventoCentral() {
		return this.evento;
	}

	public Inscrito inscrever(String nome) {
		Inscrito inscrito = new Inscrito(nome);
		this.inscritos.append(inscrito);
		return inscrito;
	}

	public Inscrito[] getInscritos() {
		Inscrito[] insc = new Inscrito[inscritos.count()];
		for (int i = 0; i < inscritos.count(); i++) {
			insc[i] = (Inscrito)inscritos.get(i);
		}
		return insc;
	}

	public int getQuantidadeInscritos() {
		return this.inscritos.count();
	}

}