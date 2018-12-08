class Dinheiro {
  // esconder como é armazenado (ENCAPSULAMENTO)
  private int reais;
  private int centavos;

  Dinheiro() {
    this.reais = 0;
    this.centavos = 0;
  }

  Dinheiro(int reais) {
    this.reais = reais;
    this.centavos = 0;
  }

  Dinheiro(int reais, int centavos) {
    this.reais = reais;
    this.centavos = centavos;
  }

  int reais() {
    return this.reais;
  }

  int centavos() {
    return this.centavos;
  }

  // menorQue, maiorQue, soma, subtrai, ehPositivo
  boolean menorQue(Dinheiro d) { // 5.45   5.75
    if (this.reais < d.reais) return true;
    if (this.reais == d.reais
      && this.centavos < d.centavos) return true;
    return false;
  }

  boolean maiorQue(Dinheiro d) {
    return ! (equals(d) || menorQue(d));
  }

  void soma(Dinheiro d) {
    this.reais += d.reais;
    this.centavos += d.centavos;
    this.reais += this.centavos / 100;
    this.centavos %= 100;
  }

  void subtrai(Dinheiro d) {
    // FIXME
    this.reais -= d.reais;
    this.centavos -= d.centavos;
  }

  boolean ehPositivo() {
    return this.reais > 0
      || (this.reais == 0 && this.centavos > 0);
  }

  @Override // annotation
  public String toString() {
    // FIXME: adicionar o zero qdo centavos < 10
    return "R$ " + this.reais + "," + this.centavos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true; // é o mesmo obj?
    // os objetos são equivalentes? mesmo valor?
    Dinheiro outroDinheiro = (Dinheiro) o;
    return this.reais == outroDinheiro.reais
      && this.centavos == outroDinheiro.centavos;
  }









}
