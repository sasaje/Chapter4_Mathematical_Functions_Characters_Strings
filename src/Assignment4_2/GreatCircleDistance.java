package Assignment4_2;/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 06/10/2020
 *
 */

import java.util.Scanner;

public class GreatCircleDistance {
    // Great circle distance

    public static void main(String[] args) {

        //Get user to enter two coordinate set, longitude and latitudes

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 point of lon and lan (x,y) in degrees: ");
        System.out.println("It is important that you use ',' when writing decimals");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter 2 point of lon and lan (x,y) in degrees: ");
        System.out.println("It is important that you use ',' when writing decimals");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double theGreatCircleDistance = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2))
                + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1-y2)));

        System.out.println("The two coordinate set (" + x1 + " , " + y1 + ") and (" + x2 + " , " + y2 + ")");
        System.out.println("The great circle distance is: " + theGreatCircleDistance + "km");

    }
}
