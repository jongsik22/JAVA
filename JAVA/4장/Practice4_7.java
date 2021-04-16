import java.util.Scanner;
class Day{
	private String work;
	public Day() {work = null;}
	public void set(String w) {work = w;}
	public String get() {return work;}
	public void show() {
		if(work == null) {
			System.out.println("없습니다.");
		}
		else {
			System.out.println(work + "입니다.");
		}
	}
}

class MonthSchedule{
	int day;
	Day [] ddd;
	Scanner sc = new Scanner(System.in);
	public MonthSchedule(int d) {
		day = d; 
		ddd = new Day[day];
		for(int i = 0; i < ddd.length; i++) {
			ddd[i] = new Day();
		}
		
	}
	public void input() {
		System.out.print("날짜(1~" + day + ")?");
		int d = sc.nextInt();
		System.out.print("할 일(빈칸없이입력)?");
		String w = sc.next();
		ddd[d].set(w);
	}
	public void view() {
		System.out.print("날짜(1~" + day + ")?");
		int d = sc.nextInt();
		System.out.println(d + "일의 할일은");
		ddd[d].show();
	}
	public void finish() {System.out.print("프로그램을 종료합니다.");}
	public void run() {
		System.out.println("이번달 스케줄 관리 프로그램.");
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int n = sc.nextInt();
			if(n == 1) {
				input();
				continue;
			}
			else if(n == 2) {
				view();
				continue;
			}
			else if(n == 3) {
				finish();
				break;
			}
		}
	}
}

public class Main {

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}
