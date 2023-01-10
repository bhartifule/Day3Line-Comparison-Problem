package com.bridgelabz.day3;
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class LineComparision {
	public static void main(String[] args) {

        System.out.println("Welcome to line comparison computation program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for line 2 ");
        int x21 = sc.nextInt();
        int x22 = sc.nextInt();
        int y21 = sc.nextInt();
        int y22 = sc.nextInt();
        System.out.println("Enter values for line 1 ");
        int x11 = sc.nextInt();
        int x12 = sc.nextInt();
        int y11 = sc.nextInt();
        int y12 = sc.nextInt();
        double length1 = sqrt(Math.pow((x12-x11),2)+Math.pow((y12-y11),2));
        double length2 = sqrt(Math.pow((x22-x21),2)+Math.pow((y22-y21),2));
        System.out.println("Length of line 1 is "+length1);
        System.out.println("Length of line 2 is "+length2);
        Double dLen1 = new Double(length1);
        Double dLen2 = new Double(length2);
        if ( dLen1.equals( dLen2)){
            System.out.println("Two lines are equal ");


        } else if (dLen1.compareTo(dLen2) >0) {

            System.out.println("line 1 is greater than line 2");

        } else if{
            System.out.println( "line 2 is greater than line 1");

        }
		else {
            System.out.println( "Two lines are not equal");

        }
}}
