import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a string 1 :");
		String s1 = input.next();
		System.out.println("enter a string 2 :");
		String s2 = input.next();
		int length1 = s1.length();
		int length2 = s2.length();
		String l2for2 = s2.substring(length2 - 2, length2);
		String l2for1 = s1.substring(length1 - 2, length1);
		String f2for2 = s2.substring(0, 2);
		String f2for1 = s1.substring(0, 2);
		String result1 = l2for2 + s1.substring(2, length1 - 2) + f2for2;
		String result2 = l2for1 + s2.substring(2, length1 - 2) + f2for1;

		System.out.println("after change:" + result1);
		System.out.println("after change:" + result2);

	}
}
