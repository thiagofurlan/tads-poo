class MDC {
    public static void main(String[] args) {
        int n1 = 150;
        int n2 = 568;
        int mdc = 1;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                mdc = i;
            }
        }
        System.out.println(mdc);
    }
}
