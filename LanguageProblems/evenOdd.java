import java.util.Scanner;

class evenOdd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a no:");
		int n = sc.nextInt();
		if (n % 2 == 0)
			System.out.println("No. is even");
		
		else System.out.println("No. is odd");
		sc.close();
	}
}	