import java.util.Scanner;

class Phone{
	String name, tel;
	public Phone(String n, String t) {name = n; tel = t;}
	String getName() {return name;}
	String getTel() {return tel;}
}

class PhoneBook{
	Phone p[];
	int num;
	Scanner sc = new Scanner(System.in);
	public PhoneBook(int n) {
		num = n;
		p = new Phone[n];
		save();
	}
	void save() {
		String name, tel;
		for(int i = 0; i < num; i++) {
			System.out.print(i + 1 + "번째 이름과 전화번호(이름과 전화번호는 빈칸없이 입력) >>");
			name = sc.next();
			tel = sc.next();
			p[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
		find();
	}
	void find() {
		while(true) {
			int cnt = 0;
			System.out.print("검색할 이름 : ");
			String name = sc.next();
			if(name.equals("그만")) {
				System.out.print("종료");
				break;
			}
			else {
				for(int i = 0; i < num; i++) {
					if((p[i].name).equals(name)) {
						System.out.println(p[i].getName() + "의 번호는 " + p[i].getTel() + " 입니다.");
						break;
					}
					cnt ++;
				}
				if(cnt == 3) {
					System.out.println(name + "이 없습니다.");
				}
			}
		}
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 >> ");
		int n = sc.nextInt();
		PhoneBook p = new PhoneBook(n);
	}

}
