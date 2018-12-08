class Main {

    public static void main(String[] args) {

        Teatro municipal = new Teatro("Teatro Rio Grande", 400);
        System.out.println(municipal);
        municipal.cadastrarEspetaculo("O fantasma da ópera", 100.0);
        municipal.cadastrarEspetaculo("Romeu e Julieta", 90.0);
        municipal.cadastrarEspetaculo("O tempo e o vento", 150.0);

    }

}
