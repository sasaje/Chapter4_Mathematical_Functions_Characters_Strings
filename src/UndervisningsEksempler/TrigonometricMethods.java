package UndervisningsEksempler;
/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 05/10/2020
 *
 */

public class TrigonometricMethods {

    public static void main(String[] args) {
        double sinRadians = Math.sin(10.0); //
        double cosRadians = Math.cos(10.0); //
        double tanRadians = Math.tan(10.0); //

        double toRadians = Math.toRadians(23.2);
        double toDegree = Math.toDegrees(23.2);

        double aSin = Math.asin(3);
        double aCos = Math.acos(3);
        double aTan = Math.atan(3);

        //Computing angles of a triangle
        double a=0;
        double b=0;
        double c=0;

        a = Math.acos((a*a-b*b-c*c)/(-2*b*c));
        b = Math.acos((b*b-a*a-c*c)/(-2*a*c));
        c = Math.acos((c*c-b*b-a*a)/(-2*a*b));
    }
}
