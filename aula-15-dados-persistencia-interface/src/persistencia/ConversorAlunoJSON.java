package persistencia;

public class ConversorAlunoJSON {

	public String converte(Aluno aluno) {
		StringBuilder sb = new StringBuilder();
		sb.append("{\n");
		sb.append("  \"matricula\": ")
			.append(aluno.getMatricula()).append(",\n");
		sb.append(" \"nome\": \"")
			.append(aluno.getNome()).append("\",\n");
		sb.append(" \"sobrenome\": \"")
			.append(aluno.getSobrenome()).append("\"\n");
		sb.append("}");
		return sb.toString();
	}

}
