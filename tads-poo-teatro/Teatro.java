class Teatro {

    final String nome;
    final int capacidade;
    private final Espetaculo[] espetaculos = new Espetaculo[1000];
    private int contEspetaculo = 0;

    Teatro(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    Espetaculo cadastrarEspetaculo(String nome, double valor) {
        Espetaculo e = new Espetaculo(nome, valor, this.capacidade);
        this.espetaculos[contEspetaculo++] = e;
        return e;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
