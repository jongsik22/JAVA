import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("정수를 입력하시오 : ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}