import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 99사이 정수를 입력하세요 : ");
		int n = sc.nextInt();
		int n10 = n / 10;
		int n1 = n % 10;
		if(n10 == 3 || n10 == 6 || n10 == 9) {
			if(n1 == 3 || n1 == 6 || n1 == 9) {
				System.out.print("박수짝짝");
			}
			else {
				System.out.print("박수짝");
			}
		}
		else if(n1 == 3 || n1 == 6 || n1 == 9) {
			System.out.print("박수짝");
		}
		else {
			System.out.print("아님");
		}
	}

}
