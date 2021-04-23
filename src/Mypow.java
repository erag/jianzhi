public class Mypow {
    public double Power(double base, int exponent) {
        float res=1;
        long b= exponent;
        while (b!=0){
            if((b&1)==1){
                res*=base;
            }
            base*=base;
            b>>=1;
        }
        return res;

    }
}
