package persistencia;

public class ConversorXML implements IConversor {
	
	@Override
	public String converte(Convertivel objeto) {
		Object[][] matriz = objeto.getMatriz();
		StringBuilder sb = new StringBuilder();
		sb.append("<objeto>");
		for (int linha = 0; linha < matriz.length; linha++) {
			sb.append("\n  <").append(matriz[linha][0])
			  .append(">").append(matriz[linha][1])
			  .append("</").append(matriz[linha][0])
			  .append(">");
		}
		sb.append("\n</objeto>");
		return sb.toString();
	}

	@Override
	public String getFormato() {
		return "xml";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
