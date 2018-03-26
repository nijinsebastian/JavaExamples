package Java;

import java.util.Scanner;

public class Coding {

	public static void main(String[] args) {
		
		System.out.println("Enter the size");
		Scanner scan=new Scanner(System.in);
		int k=scan.nextInt();
		for(int i=0;i<k;i++) {
			
			for(int j=0;j<k;j++) {
				if(i==j || (i+j)==(k-1)) {
				System.out.print("x");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
