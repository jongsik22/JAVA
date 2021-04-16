import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int a = sc.nextInt();
		int b;
		if(a / 50000 != 0)
		{
			b = a / 50000;
			System.out.println("오만원권 " + b + "매");
			a = a - (50000 * b);
			b = 0;
		}
		if(a / 10000 != 0) 
		{
			b = a/ 10000;
			System.out.println("만원권 " + b + "매");
			a = a - (10000 * b);
			b = 0;
		}
		if(a / 1000 != 0) 
		{
			b = a/ 1000;
			System.out.println("천원권 " + b + "매");
			a = a - (1000 * b);
			b = 0;
		}
		if(a / 500 != 0) 
		{
			b = a/ 500;
			System.out.println("오백원 " + b + "개");
			a = a - (500 * b);
			b = 0;
		}
		if(a / 100 != 0) 
		{
			b = a/ 100;
			System.out.println("백원 " + b + "개");
			a = a - (100 * b);
			b = 0;
		}
		if(a / 50 != 0) 
		{
			b = a/ 50;
			System.out.println("오십원 " + b + "개");
			a = a - (50 * b);
			b = 0;
		}
		if(a / 10 != 0) 
		{
			b = a/ 10;
			System.out.println("십원 " + b + "개");
			a = a - (10 * b);
			b = 0;
		}
		if(a / 1 != 0) 
		{
			b = a/ 1;
			System.out.println("일원 " + b + "개");
			a = a - (1 * b);
			b = 0;
		}
	}

}
