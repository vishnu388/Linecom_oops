package comp;

import java.util.Scanner;

public class comp {
	public static void main(String[] args) {
		int x1,y1,x2,y2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 value :");
			x1=sc.nextInt();
		System.out.println("Enter x2 value :");
			x2=sc.nextInt();
		System.out.println("Enter y1 value :");
			y1=sc.nextInt();
		System.out.println("Enter y2 value :");
		 	y2=sc.nextInt();
		 	
		 	
Double line=Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)));
System.out.println("length of line is:" +line);
		
		
			
		
	}
}
