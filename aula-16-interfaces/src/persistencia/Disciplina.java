package persistencia;

public class Disciplina implements Persistivel {

	private String sigla;
	private String nome;
	private int cargaHoraria;

	public Disciplina(String sigla, String nome, int cargaHoraria) {
		super();
		this.sigla = sigla;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}

	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	@Override
	public String toString() {
		return "Disciplina [sigla=" + sigla + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + "]";
	}

	@Override
	public Object[][] getMatriz() {
		Object[][] matriz = new Object[3][2];
		matriz[0][0] = "sigla";
		matriz[0][1] = this.getSigla();
		matriz[1][0] = "nome";
		matriz[1][1] = this.getNome();
		matriz[2][0] = "cargaHoraria";
		matriz[2][1] = this.getCargaHoraria();
 		return matriz;
	}

	@Override
	public Object getId() {
		return this.getSigla();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
