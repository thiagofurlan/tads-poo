package persistencia;

public class Main {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno(11230191, "Jessé", "Pereira");
		Aluno a2 = new Aluno(11230299, "Isaac", "Lemos");
		Aluno a3 = new Aluno(11230113, "Angel", "Pereira");
		System.out.println(a1); // Aluno[11...Jessé...]
		// Serializar em JSON
		ConversorAlunoJSON conversor = new ConversorAlunoJSON();
		// String JSON
		String a1json = conversor.converte(a1);
		System.out.println(a1json); // {"matricula": 11...
		System.out.println(conversor.converte(a2));
		// Persistir em "disco"
		PersistenciaAlunoJSON pers = new PersistenciaAlunoJSON();
		pers.salva(a1);
		pers.salva(a2);
		pers.salva(a3);
		pers.salva(new Aluno(11230294, "Raphael", "Trombetta"));
		
		// PERGUNTA EM ABERTO:
		// COMO FAZER UMA PERSISTÊNCIA DE QUALQUER OBJETO
		// EM QUALQUER FORMATO?
		
		ConversorJSON jsonificador = new ConversorJSON();
		String s = jsonificador.converte(a1);
		System.out.println(s);
		
		Disciplina poo = new Disciplina("POO", 
						"Programação Orientada a Objetos", 
						120);
		
		System.out.println(jsonificador.converte(poo));
		
		ConversorXML xmlificador = new ConversorXML();
		System.out.println(xmlificador.converte(a1));
		System.out.println(xmlificador.converte(poo));
		
		
		Persistencia persistidor = new Persistencia(xmlificador);
		persistidor.salva(poo);
		
		
		
		
		
		
		
	}
}
