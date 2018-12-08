package persistencia;

import java.io.*;

public class PersistenciaAlunoJSON {
	
	private ConversorAlunoJSON conversor = new ConversorAlunoJSON();

	public void salva(Aluno aluno) {
		String json = conversor.converte(aluno);
		String arquivo = aluno.getMatricula() + ".json";
		PrintStream ps;
		try {
			ps = new PrintStream(arquivo);
			ps.println(json);
			ps.flush();
			ps.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
