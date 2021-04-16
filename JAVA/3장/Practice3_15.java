import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("곱하고자 하는 두 수 입력>>");
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.print(n + "x" + m + "=" + n*m);
				sc.close();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				
			}
		}
	}

}
