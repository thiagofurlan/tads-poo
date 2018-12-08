package persistencia;

// quanto menos métodos melhor
public interface IConversor {

	String converte(Convertivel objeto);

	String getFormato();

	
}
