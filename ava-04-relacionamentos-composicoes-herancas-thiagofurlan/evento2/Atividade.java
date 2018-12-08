class Atividade {

	private String descricao;
	private int vagas;
	private int horas;
	private boolean limite;
	private Object tipo;
	private Evento evento;
	private String ministrante;
	private List inscritos = new List();

	Atividade(String descricao, int vagas, Object tipo) {
		this.descricao = descricao;
		this.ministrante = "";
		this.vagas = vagas;
		this.horas = 0;
		this.limite = true;
		this.tipo = tipo;
	}

	Atividade(String descricao, int vagas, int horas, Object tipo) {
		this.descricao = descricao;
		this.ministrante = "";
		this.vagas = vagas;
		this.horas = horas;
		this.limite = true;
		this.tipo = tipo;
	}

	Atividade(String descricao, String ministrante, int vagas, int horas, Object tipo) {
		this.descricao = descricao;
		this.ministrante = ministrante;
		this.vagas = vagas;
		this.horas = horas;
		this.limite = true;
		this.tipo = tipo;
	}

	Atividade(String descricao, String ministrante, Object tipo) {
		this.descricao = descricao;
		this.ministrante = ministrante;
		this.limite = false;
		this.tipo = tipo;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public int getVagas() {
		return this.vagas;
	}

	public int getVagasRemanescentes() {
		return this.vagas;
	}

	public Object getTipo() {
		return this.tipo;
	}

	public int getHoras() {
		return this.horas;
	}

	public String getMinistrante() {
		return this.ministrante;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Evento getEvento() {
		return this.evento;
	}

	public Inscrito inscrever(String nome) throws NaoHaVagaException {
		if (this.limite == true && this.vagas == 0) {
			throw new NaoHaVagaException("Nao ha mais vagas");
		}
		Inscrito inscrito = new Inscrito(nome);
		this.inscritos.append(inscrito);
		this.vagas--;
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