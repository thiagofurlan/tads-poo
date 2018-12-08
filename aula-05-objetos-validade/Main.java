class Main {
  public static void main(String[] args) {
    /*
    considerar uma conta corrente
    com agencia e numero, um titular,
    para ser aberta precisa de um deposito
    inicial mínimo de R$ 50,00,
    custo de manutenção R$ 20,00/mês
    */

    ContaCorrente c1 = new ContaCorrente(1111, 22222, "Betito", 100);

    System.out.println(c1.agencia == 1111);
    System.out.println(c1.numero == 22222);
    System.out.println(c1.titular.equals("Betito"));
    System.out.println(c1.saldo() == 100);
    // Fail-Safe / Fail-Fast
    // ContaCorrente c2 =
    //  new ContaCorrente(1111, 22223, "Doris", 40);
    // Exceção em tempo de execução

    ContaCorrente c3 = new ContaCorrente(1111, 22224, "Felipe", 100);

    System.out.println(c3.titular.equals("Felipe"));
    System.out.println(c3.saldo()); // 50

    // depositar() é um método de comando/ação
    c3.depositar(100); // 150

    // saldo() é um método de consulta, tem retorno
    System.out.println(c3.saldo()); // 150
    System.out.println(c3.saldo() == 150); // 150

    c3.depositar(-100);

    System.out.println(c3.saldo() == 150); // 150

  }
}
