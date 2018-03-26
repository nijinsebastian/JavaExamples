package Java;

/**
 * @author NIJIN
 *
 */

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark=85;
		if(mark<50) {
			System.out.println("fail");
		}
		else if(mark>=50 && mark<60)
		{
			System.out.print("D grade");	
		}
		else if(mark>=60 && mark<70)
		{
			System.out.print("C grade");	
		}
		else if(mark>=70 && mark<80)
		{
			System.out.print("B grade");	
		}
		else {
			System.out.print("A grade");
		}
			

	}

}
