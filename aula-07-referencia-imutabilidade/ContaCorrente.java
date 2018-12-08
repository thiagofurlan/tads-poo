class ContaCorrente {
  static Dinheiro valorMinimoDeposito = new Dinheiro(50) ;
  static Dinheiro taxaManutencao = new Dinheiro(20);

  final int agencia;
  final int numero;
  final String titular;

  private Dinheiro saldo = new Dinheiro(0);
  private String historico = "";

  ContaCorrente(int agencia, int numero, String titular) {
    this(agencia, numero, titular, valorMinimoDeposito);
  }

  ContaCorrente(int agencia, int numero,
                String titular, Dinheiro depositoInicial) {

    if (depositoInicial.menorQue(valorMinimoDeposito)) {
      throw new IllegalArgumentException("dep invalido <" + valorMinimoDeposito);
    }

    this.agencia = agencia;
    this.numero = numero;
    this.titular = titular;
    // this.depositar(depositoInicial);
    this.saldo = depositoInicial;
  }

  Dinheiro saldo() {
    return this.saldo;
  }

  void depositar(Dinheiro valor) {
    if ( ! valor.ehPositivo()) {
      throw new IllegalArgumentException("deve ser +");
    }
    this.saldo.soma(valor);
    this.historico += "deposito de " + valor + " reais\n";
  }

  void sacar(Dinheiro valor) {
    if ( ! valor.ehPositivo()) {
      throw new IllegalArgumentException("deve ser +");
    }
    if (valor.maiorQue(this.saldo)) {
      throw new IllegalArgumentException("saldo insuficiente");
    }
    this.saldo.subtrai(valor);
    this.historico += "saque de " + valor + " reais\n";
  }

  void cicloMensal() {
    this.saldo.subtrai(taxaManutencao);
    this.historico += "taxa manut " + taxaManutencao + " reais";
  }

  String historico() {
    return this.historico;
  }






}
