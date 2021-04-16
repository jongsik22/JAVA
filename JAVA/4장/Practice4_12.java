import java.util.Scanner;

class Seat{ // 하나의 좌석을 만드는 Seat클래스 생성
	String name;
	public Seat() {name = "---";}
	public Seat(String n) {name = n;}
	public void setName(String n) {name = n;}
	public String getName() {return name;}
}

class SeatManage{ // 등급별 좌석의 배열을 만드는 SeatManage 클래스 
	Seat [] S;
	Scanner sc = new Scanner(System.in);
	SeatManage(){ // 생성시 좌석 10개를 갖는 배열 생성
		S = new Seat[10]; 
		for(int i = 0; i < 10; i++) {
			S[i] = new Seat();
		}
	}
	public int getSeat(String n) { // 이름으로 좌석번호를 찾아주는 메소드
		int num = 0;
		int cnt = 0;
		for(int i = 0; i < 10; i++) {
			if((S[i].getName()).equals(n)) { // 일치하는 이름이 있을때 좌석번호 반환
				num = i;
			}
			else {
				cnt++; // 인덱스를 검색할때마다 찾는 이름이 없으면 cnt++;
				if(cnt == 10) { // cnt가 좌석의 수만큼 더해졌다 = 검색을 끝냈지만 찾지못했다 = 찾는이름이 없다.
					return -1; // -1 반환
				}
			}
		}
		return num;
	}
	public String getName(int s) {return S[s].getName();}
	public void setName(String n, int s) {S[s].setName(n);}
}
public class Reserv { // 예약을 하는 Reserv 클래스
	SeatManage [] seat = new SeatManage[3]; // S/A/B등급별 SeatManage 객체 생성
	Scanner sc = new Scanner(System.in);
	Reserv(){
		for(int i = 0; i < 3; i++) {
			seat[i] = new SeatManage();
		}
	}
	public void res() { // 1. 예약 : 예약을 진행하는 메소드
		int input;
		while(true) {
			System.out.print("좌석구분 S(1), A(2), B(3)>> ");
			input = sc.nextInt();
			if(input > 0 && input < 4) {
				break;
			}
			else { //입력받은 값이 1~3가 아닐때 오류출력
				System.out.println("1~3 다시입력");
				continue;
			}
		}
		if(input == 1) {System.out.print("S>> ");}
		if(input == 2) {System.out.print("A>> ");}
		if(input == 3) {System.out.print("B>> ");}
		for(int i = 0; i < 10; i++) { // 입력받은 등급의 예약상태 좌석 배열 출력
			System.out.print(seat[input - 1].getName(i) + ' ');
		}
		System.out.println();
		System.out.print("이름>> ");
		String n = sc.next();
		int s;
		while(true) {
			System.out.print("번호>> ");
			s = sc.nextInt() - 1;
			if(s >= 10) { // 입력받은 번호가 1~10이 아닐때 오류출력
				System.out.println("없는 번호입니다. 1~10");
				continue;
			}
			else {
				break;
			}
		}
		seat[input - 1].setName(n, s); // 입력받은 이름과 좌석번호에 set
	}
	public void show() { // 2.조회 : 현재 예약상태 출력 메소드
		System.out.print("S>> ");
		for(int i = 0; i < 10; i++) {
			System.out.print(seat[0].getName(i) + ' ');
		}
		System.out.print("\nA>> ");
		for(int i = 0; i < 10; i++) {
			System.out.print(seat[1].getName(i) + ' ');
		}
		System.out.print("\nB>> ");
		for(int i = 0; i < 10; i++) {
			System.out.print(seat[2].getName(i) + ' ');
		}
		System.out.println("\n<<<조회를 완료하였습니다.>>>");
	}
	public void cancel() { // 3. 취소 : 예약을 취소하는 메소드
		int input;
		while(true) {
			System.out.print("좌석구분 S(1), A(2), B(3)>> ");
			input = sc.nextInt();
			if(input > 0 && input <4) {
				break;
			}
			else { //입력받은 값이 1~3가 아닐때 오류출력
				System.out.println("1~3 다시입력");
			}
		}
		if(input == 1) {System.out.print("S>> ");}
		if(input == 2) {System.out.print("A>> ");}
		if(input == 3) {System.out.print("B>> ");}
		for(int i = 0; i < 10; i++) {
			System.out.print(seat[input - 1].getName(i) + ' ');
		}
		int num;
		while(true) {
			System.out.print("\n이름>> ");
			String n = sc.next();
			num = seat[input - 1].getSeat(n);
			if(num == -1) { // SeatManage 클래스의 getSeat 메소드(20번줄)에서 이름검색후 없을때 반환받은 -1
				System.out.print("없는이름 입니다");
				continue;
			}
			else {
				break;
			}
		}
		seat[input - 1].setName("---", num); // 원래있던 좌석번호에 빈좌석을 의미하는 "---" set
	}
	public void end() {
		System.out.print("예약을 종룝합니다.");
		sc.close();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Reserv r = new Reserv();
		System.out.println("명품콘서트 예약시스템 입니다.");
		while(true) {
			System.out.print("예약 : 1, 조회 : 2, 취소 : 3, 끝내기 : 4>> ");
			int input = sc.nextInt();
			if(input == 1) {r.res();}
			else if(input == 2) {r.show();}
			else if(input == 3) {r.cancel();}
			else if(input == 4) {r.end(); break;}
			else {System.out.println("번호 다시 입력");}
		}
		sc.close();
	}

}
