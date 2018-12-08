class Main {
  public static void main(String[] args) {

    String s1 = "marcio";
    String s2 = s1;
    s1 = s1.toUpperCase();
    System.out.println(s1); // MARCIO
    System.out.println(s2); // marcio

    Dinheiro quantia = new Dinheiro(1000);
    Dinheiro quantia2 = quantia;
    quantia.soma(new Dinheiro(1));
    System.out.println(quantia2);
    System.out.println(quantia); // R$ 1000,00

    ContaCorrente conta1 =
    new ContaCorrente(2222, 33333, "Telecken", quantia);

    System.out.println(conta1.saldo()); // 1000
    conta1.depositar(new Dinheiro(500));
    System.out.println(conta1.saldo()); // 1500

    ContaCorrente conta2 =
    new ContaCorrente(2222, 44444, "André", quantia);
    System.out.println(conta2.saldo()); // 1000
    conta2.depositar(new Dinheiro(1000));
    System.out.println("saldo c2 " + conta2.saldo());
    System.out.println("saldo c1 " + conta1.saldo());




  }
}
