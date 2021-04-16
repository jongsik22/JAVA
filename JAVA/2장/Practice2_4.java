import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int mid;
		if(a > b && a < c)
		{
			mid = a;
		}
		else if(a < b && b < c)
		{
			mid = b;
		}
		else
		{
			mid = c;
		}
		
		System.out.println("중간값은 : " + mid);
	}

}
