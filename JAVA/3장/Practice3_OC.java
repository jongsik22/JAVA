import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력 : ");
		Random r = new Random();
		String yn;
		while(true) {
			int cnt = 1;
			int n = r.nextInt(100);
			System.out.println("수를 결정 하였습니다. 맞추어 보세요 \n0-99");
			while(true) {
				System.out.print(cnt + ">> ");
				int i = sc.nextInt();
				if(i > n) {
					System.out.println("낮게");
					cnt++;
				}
				if(i < n) {
					System.out.println("높게");
					cnt++;
				}
				if(i == n) {
					System.out.println("맞음");
					break;
				}
			}
			System.out.print("다시 하시겠습니까? (y/n) ");
			yn = sc.next();
			if(yn.equals("y")) {
				continue;
			}
			else {
				System.out.print("종료합니다.");
				break;
			}
		}
		
	}
}
