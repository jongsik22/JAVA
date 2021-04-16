import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요>>>");
		int won = sc.nextInt();
		double dollar = 1100.0;
		System.out.println(won + "원은 $" + won/dollar + "입니다.");
	}

}
