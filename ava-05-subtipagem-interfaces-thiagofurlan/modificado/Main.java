package modificado;

public class Main {

	public static void main(String[] args) {
		
		Retorno printaEsseCPFae = new Retorno();
	    Dialogo dialogoCPF = new Dialogo(new CPF());
	    dialogoCPF.quandoOk(printaEsseCPFae);
	    dialogoCPF.mostra();
	    
	    Retorno printaOCEPaeRapaz = new Retorno();
	    Dialogo dialogoCEP = new Dialogo(new CEP());
	    dialogoCEP.quandoOk(printaOCEPaeRapaz);
	    dialogoCEP.mostra();
	    
	    Retorno prinTE = new Retorno();
	    Dialogo dialogoTE = new Dialogo(new TE());
	    dialogoTE.quandoOk(prinTE);
	    dialogoTE.mostra();
	    /*
	    Desafios:
	    * diálogo e retorno para qualquer dado numérico
	    * diálogo e retorno para qualquer dado de qualquer tipo
	    */
	    
	}

}
