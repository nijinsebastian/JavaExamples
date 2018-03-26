package Java;

import java.io.BufferedReader;
import java.util.Scanner;

public class Fact {
	public static int fact(int n) {
	
		if(n==1) {
			return n;
		}
		else
			return n*fact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int h=scan.nextInt();
	
		int x=Fact.fact(h);
		System.out.println(x);
	}

}
