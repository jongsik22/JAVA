import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오 >> ");
		int n[] = new int[10];
		for(int i = 0; i < 10; i++) {
			n[i] = sc.nextInt();
		}
		System.out.print("3의 배수는 ");
		for(int j = 0; j < 10; j++) {
			if(n[j] % 3 == 0) {
				System.out.print(n[j] + " ");
			}
		}
	}

}
