class Evento {

	private String nome;
	private String cidade;
	private Object tipo;
	private List atividades = new List();
	private List satelites = new List();

	public static enum Tipo {
		Semana, Escola, Salao, Seminario, Mostra;
	}

	Evento(String nome, String cidade, Object tipo) {
		this.nome = nome;
		this.cidade = cidade;
		this.tipo = tipo;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCidade() {
		return this.cidade;
	}

	public Object getTipo() {
		return this.tipo;
	}

	public Atividade novaAtividade(String descricao, int vagas, Object tipo) {
		Atividade a =  new Atividade(descricao, vagas, 0, tipo);
		this.atividades.append(a);
		a.setEvento(this);
		return a;
	}

	public Atividade novaAtividade(String descricao, int vagas, int horas, Object tipo) {
		Atividade a = new Atividade(descricao, vagas, horas, tipo);
		a.setEvento(this);
		this.atividades.append(a);
		return a;
	}

	public Atividade novaAtividade(String descricao, String ministrante, int vagas, int horas, Object tipo) {
		Atividade a = new Atividade(descricao, ministrante, vagas, horas, tipo);
		a.setEvento(this);
		this.atividades.append(a);
		return a;
	}

	public Atividade novaAtividade(String descricao, String ministrante, Object tipo) {
		Atividade a = new Atividade(descricao, ministrante, tipo);
		a.setEvento(this);
		this.atividades.append(a);
		return a;
	}

	public Atividade[] getAtividades() {
		Atividade[] a = new Atividade[atividades.count()];
		for (int i = 0; i < atividades.count(); i++) {
			a[i] = (Atividade)atividades.get(i);
		}
		return a;
	}

	public EventoSatelite novoEventoSatelite(String nome, Object tipo) {
		EventoSatelite es = new EventoSatelite(nome, this, this.cidade, tipo);
		this.satelites.append(es);
		return es;
	}

	public EventoSatelite[] getEventosSatelites() {
		EventoSatelite[] es = new EventoSatelite[satelites.count()];
		for (int i = 0; i < satelites.count(); i++) {
			es[i] = (EventoSatelite)satelites.get(i);
		}
		return es;
	}


}