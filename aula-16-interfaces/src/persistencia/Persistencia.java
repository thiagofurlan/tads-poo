package persistencia;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persistencia {

	private IConversor conversor;
	
	public Persistencia(IConversor conversor) {
		this.conversor = conversor;
	}
	
	public void salva(Persistivel objeto) {
		String form = conversor.converte(objeto);
		String arquivo = objeto.getId() 
				+ "." + conversor.getFormato();
		PrintStream ps;
		try {
			ps = new PrintStream(arquivo);
			ps.println(form); // programa a escrita
			ps.flush(); // escrever no arquivo
			ps.close(); // libera 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
