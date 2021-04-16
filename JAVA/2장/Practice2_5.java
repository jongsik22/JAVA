import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개를 입력하세요 : ");
		int a[] = new int[3];
		for(int i  = 0; i < 3 ; i++) {
			a[i] = sc.nextInt();
		}
		if(a[0] + a[1] > a[2] && a[0] + a[2] > a[1] && a[1] + a[2] > a[0]) {
			System.out.print("삼각형이 됩니다.");
		}
		else {
			System.out.print("삼각형 안댐");
		}
		
	}

}
