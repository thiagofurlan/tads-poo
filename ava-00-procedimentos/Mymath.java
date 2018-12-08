class Mymath {

    static int potencia(int a, int b) {
        int p = a;
        if (b < 0) {
            for (int i = 1; i < b; i++)
                p *= a;
            return 1/p;
        }
        if (b > 0) {
            for (int i = 1; i < b; i++)
                p *= a;
            return p;
        }
        if (b == 0) return 1;
        return 0;
    }

    static int absoluto(int a) {
        int n = a;
        if (n < 0) return n*(-1);
        return n;
    }

    static int resto(int a, int b) {
        int quociente = a/b;
        int resto = a - b * quociente;
        return resto;
    }

    static int mmc(int a, int b) {
        a = absoluto(a);
        b = absoluto(b);
        return (a*b)/mdc(a, b);
    }

    static int mmc(int a, int b, int c) {
        a = absoluto(a);
        b = absoluto(b);
        c = absoluto(c);
        return (a*b*c)/mdc(a, b, c);
    }

    static int mmc(int a, int b, int c, int d) {
        a = absoluto(a);
        b = absoluto(b);
        c = absoluto(c);
        d = absoluto(d);
        return (a*b*c*d)/mdc(a, b, c, d);
    }

    static int mdc(int a, int b) {
        int mdc = 1;
        for (int i = 1; i <= a; i++)
            if (resto(a, i) == 0 && resto(b, i) == 0)
                mdc = i;
        return mdc;
    }

    static int mdc(int a, int b, int c) {
        int mdc = 1;
        for (int i = 1; i <= a; i++)
            if (resto(a, i) == 0 && resto(b, i) == 0 && resto(c, i) == 0)
                mdc = i;
        return mdc;
    }

    static int mdc(int a, int b, int c, int d) {
        int mdc = 1;
        for (int i = 1; i <= a; i++)
            if (resto(a, i) == 0 && resto(b, i) == 0 && resto(c, i) == 0 && resto(d, i) == 0)
                mdc = i;
        return mdc;
    }

}
