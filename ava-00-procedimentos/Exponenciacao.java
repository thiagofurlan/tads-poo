// método potencia que entram dois inteiros e sai um inteiro
// potencia(int,int):int
class Exponenciacao {

    public static void main(String[] args) {

        int base = 3;
        int expoente = 4;
        int result = Mymath.potencia(base, expoente);
        System.out.println(result); // imprime 81
        System.out.println(result == 81); // imprime true

        // Casos de Teste:
        System.out.print("potencia(3, 2) == 9 "); // 3 ao quadrado
        System.out.println(Mymath.potencia(3, 2) == 9); // 3 ao quadrado
        System.out.print("potencia(2, 3) == 8 "); // 2 ao cubo
        System.out.println(Mymath.potencia(2, 3) == 8); // 2 ao cubo
        // Números grandes
        System.out.print("potencia(23, 6) == 148035889 ");
        System.out.println(Mymath.potencia(23, 6) == 148035889);
        System.out.print("potencia(2, 30) == 1073741824 ");
        System.out.println(Mymath.potencia(2, 30) == 1073741824);
        // Casos Especiais: bases negativas
        System.out.print("potencia(-2, 3) == -8 ");
        System.out.println(Mymath.potencia(-2, 3) == -8);
        System.out.print("potencia(-2, 4) == 16 ");
        System.out.println(Mymath.potencia(2, 4) == 16);
        // Casos não cobertos: expoente negativo
        System.out.print("potencia(2, -3) < 1 ");
        System.out.println(Mymath.potencia(2, -3) < 1);
        System.out.print("potencia(7, -2) > 1 ");
        System.out.println(Mymath.potencia(7, -2) > 1);
        // Adicione mais 2 Casos de Teste
        System.out.print("potencia(0, 0) == 1 ");
        System.out.println(Mymath.potencia(0, 0) == 1);
        System.out.print("potencia(3, 0) == 1 ");
        System.out.println(Mymath.potencia(3, 0) == 1);
        System.out.print("potencia(-2, -2) < 1 ");
        System.out.println(Mymath.potencia(-2, -2) < 1);
    }
}
