class Convert {

    public static void main(String[] args) {
        double d1 = 5;
        double d2 = 2 * meth(3 * d1);
        int fract1 = meth(2.0, 3.0);
        int fract2 = meth(2, 3);
        Out.println(fract1 == fract2 ? "gleich" : "ungleich");
    }

    static float meth(int i) {
        return 1.0 / i;
    }

    static double meth(double x, double y) {
        return x / y + 0.5;
    }

    static int meth(int x, int y) {
        return x / y + 0.5;
    }
    
}
