import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력 : ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double r = sc.nextDouble();
		System.out.print("점 입력 : ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		if((Math.sqrt((x - x1)*(x - x1) + (y - y1) * (y - y1)) <= r)) {
			System.out.print("점 (" + x1 + ", " + y1 + ")는 원 안에 있다.");
		}
		else {
			System.out.print("점 (" + x1 + ", " + y1 + ")는 원 밖에 있다.");
		}
	}

}
