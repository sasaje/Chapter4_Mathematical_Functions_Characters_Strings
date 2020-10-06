package Assignment4_4;/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 06/10/2020
 *
 */

import java.util.Scanner;

public class AreaOfHexagon {
    //Area of hexagon

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length of a side in the hexagon: ");
        double s = input.nextDouble();

        double area = (6*(s*s))/(4*Math.tan(Math.PI/6));
        double roundOff = Math.round(area * 100.0) / 100.0; // decimals

        System.out.println("When the side of the hexagon is " + s + ". The area is: " + roundOff);

    }


}
