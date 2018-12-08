package persistencia;

public class ConversorJSON implements IConversor {
	
	@Override
	public String converte(Convertivel objeto) {
		Object[][] matriz = objeto.getMatriz();
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (int linha = 0; linha < matriz.length; linha++) {
			sb.append("\n  \"").append(matriz[linha][0])
				.append("\": ");
			sb.append("\"").append(matriz[linha][1])
				.append("\",");
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("\n}");
		return sb.toString();
	}

	@Override
	public String getFormato() {
		return "json";
	}










}
