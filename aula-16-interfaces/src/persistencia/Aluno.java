package persistencia;
//cumpre a interface convertível: oferece o getMatriz
public class Aluno implements Persistivel { 
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

	@Override
	public Object[][] getMatriz() {
		Object[][] matriz = new Object[3][2];
		matriz[0][0] = "matricula";
		matriz[0][1] = this.getMatricula();
		matriz[1][0] = "nome";
		matriz[1][1] = this.getNome();
		matriz[2][0] = "sobrenome";
		matriz[2][1] = this.getSobrenome();
		return matriz;
	}

	@Override
	public Object getId() {
		return this.getMatricula();
	}	
	
	
	
	
	
	
	
	
	
	
	
}
