import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		String name;
		while(true) {
			int cnt = 0;
			System.out.print("과목 이름 >> ");
			name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			else {
				for(int i = 0; i < course.length; i++) {
					if(course[i].equals(name)) {
						System.out.println(name + "의 점수는 " + score[i]);
						cnt++;
						break;
					}
				}
				if(cnt == 0) {
					System.out.println("없는과목");
				}
			}
		}
	}

}
