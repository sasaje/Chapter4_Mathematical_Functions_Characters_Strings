/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 05/10/2020
 *
 */

public class RoundingMethods {

    public static void main(String[] args) {
        //Ceil(x) round up to nearest int - return double value
        double ceil = Math.ceil(10.2);
        System.out.println(ceil);

        //floor(x) round down to nearest int - return double value
        double floor = Math.floor(10.2);
        System.out.println(floor);

        //Rint(x) Round to its nearest int. If x is equally close to two integers, the even one is returned as a double.
        double rint = Math.rint(10.2);
        System.out.println(rint);

        //Round(x) Returns (int).Math.floor(x+0.5) if x is a float and returns (long)Math.floor(x+0.5) if x is a double.
        double round = Math.round(10.2);
        System.out.println(round);
    }
}
