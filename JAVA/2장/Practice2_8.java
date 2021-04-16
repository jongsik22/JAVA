import java.util.Scanner;

public class Main {
	
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, x2, y1, y2;
		System.out.print("두 점의 좌표를 입력하세요 (x1 y1 x2 y2) : ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		if(inRect(x1,y1,100,100,200,200) == true || inRect(x2,y2,100,100,200,200) == true)
		{
			System.out.print(("충돌"));
		}
		else
		{
			System.out.print(("충돌X"));
		}
	}

}
