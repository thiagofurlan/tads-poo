class MDC {
    public static void main(String[] args) {
        int a = 18;
        int b = 12;
        int mdc = 1;
        mdc = getMDC(a, b);
        System.out.println("MDC entre " + a + " e " + b + " = " + mdc);
    }

    static int getMDC(int a, int b) {
        int mdc = 1;
        for (int i = 1; i < min(a, b); i++)
            if ((a % i == 0) && (b % i == 0))
                mdc = i;
        return mdc;
    }

    static int min(int a, int b) {
        return a < b ? a : b;
    }
}
