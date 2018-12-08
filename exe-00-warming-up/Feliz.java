class Feliz {
    public static void main(String[] args) {
        int n = 91;
        int aux = n;
        int m = 0, c = 0, d = 0, u = 0, soma = 0;
        for (int i = 0; i <= 1000; i++) {
            m = n/1000;
            c = (n - (m * 1000)) / 100;
            d = (n - (m * 1000) - (c * 100)) / 10;
            u = n - (m * 1000) - (c * 100) - (d * 10);
            soma = (int)Math.pow(m, 2) + (int)Math.pow(c, 2) + (int)Math.pow(d, 2) + (int)Math.pow(u, 2);
            n = (int)soma;
            if (soma == 1) {
                System.out.println(aux + " é um número feliz.");
                break;
            }
            if (i == 1000) System.out.println("Com " + i + " iterações, " + aux + " não é um número feliz.");
        }
    }
}
