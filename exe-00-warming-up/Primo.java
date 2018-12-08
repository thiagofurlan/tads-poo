class Primo {
    public static void main(String[] args) {
        int n = 14;
        boolean primo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        System.out.println("Número " + n + " é primo? " + primo);
    }
}
