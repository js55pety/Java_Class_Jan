class Example {

    static int n = 3;

    public static void main(String[] args) {
        double result = methA(n);
        Out.print("n = ");
        int n = In.readInt();
        Out.println("result = " + result);
    }

    static double methA(int k) {
        for (int m = 0; m < k; ++m) {
            int i = m / 2;
            n += i;
        }
        return methB(k);
    }
    
    static double methB(double d) {
        return d * n;
    }
    
}
