package persistencia;

import java.io.*;

public class PersistenciaAlunoJSON {

	private ConversorAlunoJSON conversor =
			new ConversorAlunoJSON();
	
	public void salva(Aluno aluno) {
		
		String json = conversor.converte(aluno);
		String arquivo = aluno.getMatricula() + ".json";
		PrintStream ps;
		try {
			ps = new PrintStream(arquivo);
			ps.println(json); // programa a escrita
			ps.flush(); // escrever no arquivo
			ps.close(); // libera 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	
	}

}
