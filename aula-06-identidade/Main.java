class Main {

	public static void main(String[] args) {
		
		Dinheiro d1 = new Dinheiro(3, 5);
		Dinheiro d2 = new Dinheiro(3, 5);
		System.out.println(d1.reais());
		System.out.println(d1.centavos());
		
		Naipe n = Naipe.Ouro;
		Valor v = Valor.As;
		Carta c = new Carta(v, n);

		System.out.println(c);

	}

}