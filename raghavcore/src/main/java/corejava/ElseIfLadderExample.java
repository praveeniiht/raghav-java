package corejava;

public class ElseIfLadderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1011, b = 291, c = 300;
		
		if( a < b)
			System.out.println("inside the first block");
		else if(a > c)
			System.out.println("inside the second block");
		else if(b > c)
			System.out.println("inside the third block");
		else
			System.out.println("end of the blocks");

	}

}
