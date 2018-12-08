class Feliz {

    public static void main(String[] args) {
        int n = 45, i = 1;
        for (i = 1; i <= 1000; i++) {
            int m = n / 1000;
            int c = (n - m*1000) / 100;
            int d = (n - m*1000 - c*100) / 10;
            int u = n - m*1000 - c*100 - d*0;
            n = pow(m,2) + pow(c,2) + pow(d,2) + pow(u,2);
            if (n == 1) break;
        }
        System.out.println(i == 1000 ? "Infeliz" : "Feliz");
    }

    static int pow (int a, int b) {
        int p = a;
        for (int i = 1; i < b; i++) {
            p *= a;
        }
        return p;
    }
}
