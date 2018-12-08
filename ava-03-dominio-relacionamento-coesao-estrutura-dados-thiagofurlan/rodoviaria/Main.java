class Main {

	public static void main(String[] args) {
		
		Rodoviaria rod = new Rodoviaria("Rio Grande");
		// empresa
		Empresa embaixador = new Empresa("Expresso embaixador");
		Frota frotaEmbaixador = embaixador.getFrota();
		System.out.println(frotaEmbaixador.getQuantidade() == 0);
		// Onibus oni1 = frotaEmbaixador.novoOnibus(1104, 44); // nro onibus, assentos
		// // direto
		// System.out.println(frotaEmbaixador.getQuantidade() == 1);
		// // ou indireto
		// System.out.println(embaixador.getFrota().getQuantidade() == 1);
		// viagem
		// Viagem vi1 = rod.criarViagem("Pelotas", new Date(13, 10, 2018), new Time(14), oni1);
		// System.out.println(vi1.getCodigo() == 1);
		// System.out.println(vi1.getOrigem().equals("Rio Grande"));
		// System.out.println(vi1.getDestino().equals("Pelotas"));
		// System.out.println(vi1.getData().toString().equals("13/10/2018"));
		// System.out.println(vi1.getHora().toString().equals("14:00:00"));
		// System.out.println(vi1.getTotalPassagens() == 44); // qtd assentos onibus
		// System.out.println(vi1.getTotalPassagensDisponiveis() == 44); // qtd assentos disp
		// // comprando uma passagem a partir da viagem
		// Passagem pas1 = vi1.comprarPassagem(13); // nro assento
		// // codigo viagem 1 + nro pass 1 + assento 13
		// System.out.println(pas1.getCodigo().equals("000001.000001.13"));
		// System.out.println(pas1.isDisponivel() == false);
		// System.out.println(pas1.getAssento() == 13);
		// // obtendo as passagens
		// Passagem[] pass = vi1.getPassagens();
		// System.out.println(pass[0].getAssento() == 1);
		// System.out.println(pass[0].isDisponivel() == true);
		// pass[0].comprar();
		// System.out.println(pass[0].getAssento() == 1);
		// System.out.println(pass[0].isDisponivel() == false);
		// System.out.println(pass[0].getCodigo().equals("000001.000002.01"));
		// System.out.println(vi1.getTotalPassagensDisponiveis() == 42); // qtd assentos disp
		// // adicionando um onibus à frota a partir da empresa
		// embaixador.novoOnibus(1205, 48);
		// // nova rodoviária
		// Rodoviaria rod2 = new Rodoviaria("Bagé");
		// rod2.criarViagem("Jaguarão", new Date(14, 10, 2018), new Time(8, 30),
		//                  embaixador.getFrota().getOnibus(1205));
		// System.out.println(rod2.getViagem(2).getDestino().equals("Jaguarão"));
		// System.out.println(rod2.getViagem(2).comprarPassagem(9).getCodigo().equals("000002.000001.09"));
		// // comprar passagem
		// Passagem pas2 = rod2.comprarPassagem(2, 10); // comprar passagem viagem 2 assento 10
		// System.out.println(pas2.getCodigo().equals("000002.000002.10"));
		// Viagem vi2 = rod2.getViagem();
		// try {
		//   vi2.comprarPassagem(10);
		// } catch (AssentoIndisponivelException e) {
		//   System.err.println(e);
		// }
		// // passagens remanescentes
		// System.out.println(vi2.getTotalPassagens() == 48); // qtd assentos onibus
		// System.out.println(vi2.getTotalPassagensDisponiveis() == 46); // qtd assentos disp

		// // ADICIONAR CASOS DE TESTE PARA PELO MENOS 2 SITUAÇÕES EXCEPCIONAISS
		
	}

}