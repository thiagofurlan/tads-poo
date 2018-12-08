class MainTV {

	public static void main(String[] args) {
		
		TV tv = new TV("LG", "TV32", 32, 720);

		System.out.println(tv.fabricante == "LG");
		System.out.println(tv.modelo == "TV32");
		System.out.println(tv.tamanho == 32);
		System.out.println(tv.resolucao == 720);

		// testando volume
		//System.out.println(tv.getVolume()); // 10
		for (int i = 0; i < 50; i++) tv.sobeVolume();
		System.out.println(tv.getVolume() == 60); // true
		tv.desceVolume();
		tv.desceVolume();
		tv.desceVolume();
		System.out.println(tv.getVolume() == 57); // true
		tv.sobeVolume();
		System.out.println(tv.getVolume() == 58); // true
		
		// testando canais
		//System.out.println(tv.getCanal()); // 11
		for (int i = 0; i < 50; i++) tv.sobeCanal(); // sobe 50 canais
		System.out.println(tv.getCanal() == 61); // true
		for (int i = 0; i < 50; i++) tv.desceCanal(); // desce 50 canais
		System.out.println(tv.getCanal() == 11); // true
		tv.sobeCanal();
		tv.sobeCanal();
		System.out.println(tv.getCanal() == 13); // true
		tv.desceCanal();
		System.out.println(tv.getCanal() == 12); // true

		// passando dos limites
		for (int i = 0; i < 80; i++) tv.sobeCanal(); // sobe 80 canais
		System.out.println(tv.getCanal() == 69);
		for (int i = 0; i < 80; i++) tv.desceCanal(); // desce 80 canais
		System.out.println(tv.getCanal() == 2);

		for (int i = 0; i < 150; i++) tv.sobeVolume(); // sobe 150 vezes
		System.out.println(tv.getVolume() == 100);
		for (int i = 0; i < 150; i++) tv.desceVolume(); // desce 150 vezes
		System.out.println(tv.getVolume() == 0); // true

		// desafios
		tv.irCanal(42);
		System.out.println(tv.getCanal() == 42);
		tv.voltarCanal();
		System.out.println(tv.getCanal() == 2);
		tv.irCanal(13);
		tv.irCanal(17);
		tv.voltarCanal();
		System.out.println(tv.getCanal() == 13);
		tv.mudo();
		System.out.println(tv.getVolume() == 0);
		tv.sobeVolume();
		tv.mudo();
		System.out.println(tv.getVolume() == 0);

		// se quiser ver uma excessao descomente esta linha
		//tv.irCanal(90);
	}

}