class Espetaculo {

    public final String nome;
    public final double valor;
    private final Ingresso[] ingressos;
    private int contIngresso;

    Espetaculo(String nome, double valor, int capacidade) {
        this.nome  = nome;
        this.valor = valor;
        this.ingressos = new Ingresso[capacidade];
    }

    String nome() {
        return this.nome;
    }

    boolean ingressoDisponivel() {
        return true;
    }

}
