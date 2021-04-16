import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개? : ");
		int n = sc.nextInt();
		int a [] = new int[n];
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			a[i] = (int)(Math.random() * 100 + 1);
			for(int j = 0; j < i; j ++) {
				if(a[j] == a[i]) {
					i--;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
			cnt++;
			if(cnt % 10 == 0) {
				System.out.println();
			}
		}
	}
}