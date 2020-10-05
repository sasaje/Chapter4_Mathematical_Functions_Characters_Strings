/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 05/10/2020
 *
 */

public class ExponentMethods {

    public static void main(String[] args) {
        //exp(x) , returns a raised to power of x (e^2)
        double expX = Math.exp(10.1);
        System.out.println(expX);

        // log(x) Returns the natural logarithm of x (ln(x) = log e(x)).,
        double logX = Math.log(10.1);
        System.out.println(logX);

        // log(x) Returns the base 10 logarithm of x (log 10 (x)).
        double log10 = Math.log10(10.1);
        System.out.println(log10);

        // pow(a,b) Returns a raised to the power for b (a^b)
        double powAB = Math.pow(2,3);
        System.out.println(powAB);

        // sqrt(x) Returns the squarre root of x for x >=0.
        double sqrtX = Math.sqrt(10.1);
        System.out.println(sqrtX);

    }
}
