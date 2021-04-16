import java.util.Scanner;

class Circle{
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) {this.x = x; this.y = y; this.radius = radius;}
	public void show() {System.out.println("(" + x + ", " + y + ") " + radius);}
	public void big() {System.out.println("가장 면적이 큰 원은 (" + x + ", " + y + ") " + radius);}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c [] = new Circle[3];
		int max = 0;
		int cnt = 0;
		for(int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			if(radius > max){
				max = radius;
				cnt = i;
			}
			c[i] = new Circle(x, y, radius);
		}
		c[cnt].big();
		sc.close();
	}

}
