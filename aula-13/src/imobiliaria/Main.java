package imobiliaria;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    Locacao loc1 = new Casa("Rua Alfredo Huch, 475", 2, 1, 900.0);
    
    System.out.println(loc1.getTipo()); // Residencial
    System.out.println(loc1.getEndereco()); // Rua Alfredo Huch, 475
    System.out.println(loc1.getQuartos()); // 2
    System.out.println(loc1.getGaragem()); // 1 (carro)
    System.out.println(loc1.getMeses()); // 12 (meses)
    System.out.println(loc1.getValor()); // 900.0
    System.out.println(loc1.getValorTotal()); // 900.0 // não considera condomínio

    Locacao loc2 = new Apartamento("Av 24 de maio, 355", 1, 1, 400.0, 400.0);
    System.out.println(loc2.getTipo()); // Apartamento
    System.out.println(loc2.getEndereco()); // Av 24 de maio, 355
    System.out.println(loc2.getQuartos()); // 1
    System.out.println(loc2.getGaragem()); // 1 (carro)
    System.out.println(loc2.getMeses()); // 12 (meses)
    System.out.println(loc2.getValor()); // 400.0
    System.out.println(loc2.getValorCondominio()); // 400.0
    System.out.println(loc2.getValorTotal()); // 800.0

//    Locacao loc3 = new Locacao("Aquidaban, 8350", 0, 0, 1000.0, 500.0, 'C');    
//    System.out.println(loc3.getEndereco()); // Aquidaban, 8350
//    System.out.println(loc3.getMeses()); // 6 (meses)
//    System.out.println(loc3.getValor()); // 1000.0
//    // não considera condomínio, mas considera taxa na primeira parcela
//    System.out.println(loc3.getValorTotal()); // 1500.0
//
//    Imobiliaria imo = new Imobiliaria("Silva");
//    
//    imo.contratar(loc1);
//    imo.contratar(loc2);
//    imo.contratar(loc3);
//    
//    System.out.println(Arrays.toString(imo.getLocacoesAtivas()));
//    
//    Cobranca cob_10_2018 = imo.novaCobranca(2018, 10);
//    System.out.println(cob_10_2018.getValorEstimado());
//    cob_10_2018.pagar();
//    
//    // System.out.println(loc1.pagar()); // paga 1 mês em dia // 900.0
//    // System.out.println(loc2.pagar()); // paga 1 mês em dia // 800.0
//    // System.out.println(loc3.pagar()); // paga 1 mês em dia // 1500.0
//
//    System.out.println(loc1.getMeses()); // 11
//    System.out.println(loc2.getMeses()); // 11
//    System.out.println(loc3.getMeses()); // 5
//
//    Cobranca cob_11_2018 = imo.novaCobranca(2018, 11);
//    System.out.println(cob_11_2018.getValorEstimado());
//    cob_11_2018.pagar();
//    // paga com 1 dia de atraso: multa 3% + 1% ao dia para Residência
//    // se for Apartamento incide multa de 10% sobre o valor do condomínio
//    // multa 5% + 1% ao dia para comercial
//    cob_11_2018.pagar(1);
//    for (Object o: imo.getLocacoesAtivas()) {
//		Locacao locacao = (Locacao) o;
//    	System.out.println(locacao.getUltimoValorPago());
//    }
//    // System.out.println(loc1.pagar(1)); // 900 + 27 + 9 = 936.0
//    // System.out.println(loc2.pagar(1)); // 400 + 12 + 4 + 40 + 400 = 856.0
//    // System.out.println(loc3.pagar(1)); // 1000 + 50 + 10 = 1060.0
//
//    System.out.println(loc1.getMeses()); // 10
//    System.out.println(loc2.getMeses()); // 10
//    System.out.println(loc3.getMeses()); // 4
//
//    for (int i = 0; i < 10; i++) {
//    	imo.novaCobranca(2019, i + 1).pagar();
//    }
//    
//    System.out.println(loc1.getMeses()); // 0
//    
//    imo.renovar(loc1, 5.0, 0.0, 12);
//    System.out.println(loc1.getMeses()); // 12 (meses)
//    System.out.println(loc1.getValor()); // 945.0
//    System.out.println(loc1.getValorTotal()); // 945.0
//
//    System.out.println(imo);
//    
    
    
    
    

  }
}