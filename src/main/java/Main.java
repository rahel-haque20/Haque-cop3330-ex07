/*
* UCF COP 3330 Fall 2021 Assignment 7 Solution
* Copyright 2021 Rahel Haque
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner measure = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        String length = measure.nextLine();
        System.out.println("What is the width of the room in feet?");
        String width = measure.nextLine();

        int x = Integer.parseInt(length);
        int y = Integer.parseInt(width);

        int square_feet = x*y;
        float square_meters = (float) (square_feet*0.09290304);

        System.out.printf("The area is%n%d square feet%n%f square meters", square_feet, square_meters);
    }
}