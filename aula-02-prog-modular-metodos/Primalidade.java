class Primalidade {
    public static void main(String[] args) {
        int n = 4;
        if (ehPrimo(n))
            System.out.println(n + " é primo!");
        else
            System.out.println(n + " NÃO é primo!");
    }

    public static boolean ehPrimo(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0) return false;
        return true;
    }
}
