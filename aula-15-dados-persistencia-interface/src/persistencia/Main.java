package persistencia;

public class Main {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno(11230291, "Thiago", "Furlan");
		Aluno a2 = new Aluno(11230299, "Isaac", "Lemos");
		Aluno a3 = new Aluno(11230113, "Angel", "Pereira");
		
		ConversorAlunoJSON conversor = new ConversorAlunoJSON();
		String a1json = conversor.converte(a1);
		
		System.out.println(conversor.converte(a1));
		System.out.println(conversor.converte(a2));
		System.out.println(conversor.converte(a3));
		
		// Persistir em "disco"
		
		PersistenciaAlunoJSON p = new PersistenciaAlunoJSON();
		p.salva(a1);
		
	}

}
