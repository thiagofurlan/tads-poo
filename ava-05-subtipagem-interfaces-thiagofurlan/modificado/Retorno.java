package modificado;

public class Retorno {
	
  public void recebe(IDocumento d) {
	System.out.println(d.getTipo() + " recebido, valor: " + d.getValor());
	System.out.println("Número: " + d.getValor());
  }
  
}
