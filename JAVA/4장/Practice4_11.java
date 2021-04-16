import java.util.Scanner;

class Add{
	int a, b;
	void setValue(int a, int b) {this.a = a; this.b = b;}
	int calculate() {return a + b;}
}
class Sub{
	int a, b;
	void setValue(int a, int b) {this.a = a; this.b = b;}
	int calculate() {return a - b;}
}
class Mul{
	int a, b;
	void setValue(int a, int b) {this.a = a; this.b = b;}
	int calculate() {return a * b;}
}
class Div{
	int a, b;
	void setValue(int a, int b) {this.a = a; this.b = b;}
	int calculate() {return a / b;}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하십시오. : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = sc.next();
		if(c.equals("+")) {
			Add add = new Add();
			add.setValue(a, b);
			System.out.print(add.calculate());
		}
		else if(c.equals("-")) {
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.print(sub.calculate());
		}
		else if(c.equals("*")) {
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.print(mul.calculate());
		}
		else if(c.equals("/")) {
			Div div = new Div();
			div.setValue(a, b);
			System.out.print(div.calculate());
		}
	}

}
