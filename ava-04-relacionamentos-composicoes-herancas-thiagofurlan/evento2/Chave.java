import java.util.Random;

class Chave {

	private String chave;
	private String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private Random r = new Random();

	Chave() {
		this.chave = this.gen();
	}

	private String gen() {
		String s = "";
		for (int i = 0; i < 16; i++) {
			s += alfabeto.charAt(r.nextInt(26));
		}
		return s;
	}

	public String getChave() {
		return this.chave;
	}

	@Override
	public String toString() {
		return this.chave;
	}

}