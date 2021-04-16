import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오 : ");
		int won = sc.nextInt();
		int cnt;
		for(int i = 0; i < unit.length; i++) {
			cnt = won / unit[i];
			if(cnt != 0) {
				System.out.println(unit[i] + "원 짜리 " + cnt + "개");
				won = won % unit[i];
			}
		}
	}
}
