package Java;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=50;
		switch(num) {
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
			
			case 30:
				System.out.println("30");
				break;
			default:
				System.out.println("not in 10,20,30");
			break;
		}
for(int i=0;;i++){
	if(i==5) {
		break;
	}
	System.out.println("lol"+i);
}
	}

}
