class TV {

	final String fabricante;
	final String modelo;
	final int tamanho;
	final int resolucao;

	private int volume, volumeMin, volumeMax;
	private int canal, canalAnterior, canalMin, canalMax;

	TV(String fabricante, String modelo, int tamanho, int resolucao) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.resolucao = resolucao;
		this.volume = 10;
		this.volumeMin = 0;
		this.volumeMax = 100;
		this.canalAnterior = this.canal = 11;
		this.canalMin = 2;
		this.canalMax = 69;
	}

	// comandos

	void sobeCanal() {
		this.canalAnterior = this.canal;
		if (this.canal < this.canalMax) this.canal++;
	}

	void desceCanal() {
		this.canalAnterior = this.canal;
		if (this.canal > this.canalMin) this.canal--;
	}

	void sobeVolume() {
		if (this.volume < this.volumeMax) this.volume++;
	}

	void desceVolume() {
		if (this.volume > this.volumeMin) this.volume--;
	}

	void mudo() {
		this.volume = 0;
	}

	void irCanal(int n) {
		if (n >= this.canalMin && n <= this.canalMax) {
			this.canalAnterior = this.canal;
			this.canal = n;
		} else {
			throw new IllegalArgumentException("Canal inválido, apenas " + this.canalMin + " a " + this.canalMax);
		}
	}

	// teste metodo volta 1 canal só
	void voltarCanal() {
		this.canal = this.canalAnterior;
	}

	// consultas

	int getVolume() {
		return this.volume;
	}

	int getCanal() {
		return this.canal;
	}

}