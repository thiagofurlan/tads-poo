package persistencia;

public class Aluno {
	
	private int matricula;
	private String nome;
	private String sobrenome;

	public Aluno(int matricula, String nome, String sobrenome) {
		this.matricula = matricula;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", sobrenome=" + sobrenome + "]";
	}
	
	

}
