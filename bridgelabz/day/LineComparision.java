package com.bridgelabz.day;
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class LineComparision 
{
	 private  Double length1;
	   private Double length2;
	    public LineComparision1 setCompareValues(){
	        LineComparision1 obj = new LineComparision1();
	        Scanner scan = new Scanner(System.in);
	        System.out.println(" enter values X & Y co-oradinates");
	        int x11 = scan.nextInt();
	        int x12 = scan.nextInt();
	        int y11 = scan.nextInt();
	        int y12 = scan.nextInt();
	        int x21 = scan.nextInt();
	        int x22 = scan.nextInt();
	        int y21 = scan.nextInt();
	        int y22 = scan.nextInt();

	        obj.setX11(x11);
	        obj.setX12(x12);
	        obj.setY11(y11);
	        obj.setY12(y12);
	        obj.setX21(x21);
	        obj.setX22(x22);
	        obj.setY21(y21);
	        obj.setY22(y22);
	    return obj;
	    }
	  
			
		
		public void geometryCalculation(LineComparision1 obj){
	        double length1 = sqrt(Math.pow((obj.getX12()- obj.getX11()),2)+Math.pow((obj.getY12()-obj.getY11()),2));
	        double length2 = sqrt(Math.pow((obj.getX22()- obj.getX21()),2)+Math.pow((obj.getY22() - obj.getY21()),2));
	        this.length1 = length1;
	        this.length2 = length2;
	    }
	    public void compareOrEqual(){

	        if (length1.compareTo(length2)>0){
	            System.out.println(" Line1 ("+length1+") is greater than ("+length2+")Line2 ");

	        }else if(length1.compareTo(length2)<0) {
	            System.out.println("Line1 ("+length1+") is less than ("+length2+") Line2");
	        }else {
	            System.out.println("Line1 ("+length1+") is equals to ("+length1+") line2");
	        }
	    }
}
