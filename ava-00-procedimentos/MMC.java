class MMC {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 2;
        int resp = Mymath.mmc(num1, num2);

        System.out.println(resp); // imprime 10
        System.out.println(resp == 10); // imprime true

        // Casos de Teste:
        System.out.println(Mymath.mmc(10, 4) == 20);
        System.out.println(Mymath.mmc(29, 11) == 319);

        // Excepcionais NAO ESTAO IGUAIS
        System.out.println(Mymath.mmc(-2, 9) == 18);
        System.out.println(Mymath.mmc(-2, -9) == 18);
        System.out.println(Mymath.mmc(-8823, 9982) == 88071186);

        // Compostos
        System.out.println(Mymath.mmc(Mymath.mmc(2, 9), 11) == 198);
        System.out.println(Mymath.mmc(Mymath.mmc(Mymath.mmc(2, 9), 11), 17) == 3366);

        // Sobrecarga para até quatro parâmetros/argumentos
        System.out.println(Mymath.mmc(5, 8, 91) == 3640);
        System.out.println(Mymath.mmc(5, 8, 91, 101) == 367640);

        // Adicione mais 2 Casos de Teste:
        System.out.println(Mymath.mmc(5, -8, 91) == 3640);
        System.out.println(Mymath.mmc(5, -8, -91, 101) == 367640);

    }

}
