// esta classe utiliza os métodos da classe Mymath
// metodo abs entra um inteiro e sai um inteiro sem sinal
// abs(int):int

class Absoluto {

    public static void main(String[] args) {

        System.out.println("Absoluto de -9 = 9: " + (Mymath.absoluto(-9) == 9));
        System.out.println("Absoluto de 8 = 8: " + (Mymath.absoluto(8) == 8));
        System.out.println("Absoluto de 0 = 0: " + (Mymath.absoluto(0) == 0));

        System.out.println("Absoluto de -9 = -9: " + (Mymath.absoluto(-9) == -9));
        System.out.println("Absoluto de -8 = -8: " + (Mymath.absoluto(-8) == -8));
        System.out.println("Absoluto de 1 = -1: " + (Mymath.absoluto(1) == -1));

    }

}
