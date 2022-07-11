package corejava;

public class NestedIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 19011, b = 2871, c = 300;

		if (a < b) {
			if (b < c) {
				System.out.println("c is bigger");
			} else {
				System.out.println("b is bigger");
			}
		} else {
			if (a < c) {
				System.out.println("c is bigger");
			} else {
				System.out.println("a is bigger");
			}
		}
		System.out.println("outside of the nested if blocks...");

	}

}
