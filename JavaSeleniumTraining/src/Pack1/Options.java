package Pack1;

import Java.ProtectedStuff;
import Pack.*;


public class Options extends ProtectedStuff{
	protected void shows() {
		System.out.println("Lol");
	}
	
	public void msg() {
		System.out.println("Nijin Allows");
		Rupee r=new Rupee();
		r.k=11;
		r.Nijin();
		System.out.println("Nijin Allows");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Options protectt=new Options();
		ProtectedStuff p=new ProtectedStuff();
		protectt.sep="nijin";
		protectt.shows();
		Allowss c=new Allowss();
		Sales sales=new Sales();
		c.msg();
		sales.msg();
		c.lol();

	}
	
	public class Rupee{
		private int k=10;
		
	
		private Rupee() {
			
		}
		private void Nijin() {
			System.out.println("Nijin Allows");
		}
		
	}

}
