package persistencia;

public class ConversorAlunoJSON {

	public String converte(Aluno aluno) {
		StringBuilder sb = new StringBuilder();
		sb.append("{\n")
		.append("  \"matricula\": ")
			.append(aluno.getMatricula()).append(",\n")
		.append("  \"nome\": \"")
			.append(aluno.getNome()).append("\",\n")
		.append("  \"sobrenome\": \"")
			.append(aluno.getSobrenome()).append("\"\n")
		.append("}");
		return sb.toString();
	}
}
/*
{
"matricula": 11230191,
"nome": "Jessé",
"sobrenome": "Pereira"
}
*/