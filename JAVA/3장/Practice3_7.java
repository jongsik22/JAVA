import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = new int[10];
		double sum = 0;
		for(int i = 0; i < 10; i++) {
			int j = (int)(Math.random() * 10 + 1);
			n[i] = j;
			System.out.print(n[i] + " ");
			sum += n[i];
		}
		System.out.print("\nÆò±ÕÀº : " + sum / 10);
	}
}
