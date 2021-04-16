import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2자리 정수 입력 : ");
		int a = sc.nextInt();
		if(a / 10 == a % 10)
		{
			System.out.print("10의 자리와 1의 자리가 같습니다");
		}
		else
		{
			System.out.print("10의 자리오 1의 자리가 다릅니다");
		}
		
	}

}
