/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 06/10/2020
 *
 */

package Assignment4_1;

import java.util.Scanner;

public class GeometryAreaOfAPentagon {

    public static void main(String[] args) {

        //User input to length from center to vertex
        System.out.println("Please enter the length between the center and the vertex of the pentagon");
        Scanner input = new Scanner(System.in);
        double lengthFromCenterToVertex = input.nextDouble();

        System.out.println(lengthFromCenterToVertex);

        double r = lengthFromCenterToVertex;
        double s = 2*r*(Math.sin((Math.PI/5)));

        double area = (5*(s*s))/(4*(Math.tan(Math.PI/5)));
        double roundOff = Math.round(area * 100.0) / 100.0;

        System.out.println("When the length from the center to the vertex in the pentagon is: " + r + ".");
        System.out.println("The area of the pentagon is: " + roundOff);

    }
}
