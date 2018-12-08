class Main {

	public static void main(String[] args) {
		
		Caneta c = new Caneta("azul", 1.5);
		System.out.println(c.getCarga());
		System.out.println(c.escrever("poo"));
		System.out.println(c.getCarga());

	}

}