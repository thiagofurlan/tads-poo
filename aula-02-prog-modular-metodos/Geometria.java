class Geometria {

    public static void main(String[] args) {

    }

    static int areaRetangulo(int a, int b) {
        return a * b;
    }

    static int raio (int diametro) {
        return diametro/2;
    }

    static double volumeCilindro (int raio, int altura) {
        return 3.1415 * Math.pow(raio, 2) * altura;
    }

    static double areaCirculo (int raio) {
        return 3.1415 * Math.pow(raio, 2);
    }

    static double areaTrapezio(int B, int b, int h) {
        return ((B+b)*h)/2;
    }

    static double baskara (int a, int b, int c) {
        int array = new Int [2];
        double delta = Math.sqrt(Math.pow(b,2) - 4 * a * c);
        double x = -b + delta;
        return x;
    }
}
