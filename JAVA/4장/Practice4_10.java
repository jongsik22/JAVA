import java.util.Scanner;

class Dictionary{
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {
		
		int n = 0;
		int cnt = 0;
		for(int i = 0; i < kor.length; i++) {
			if(kor[i].equals(word)) {
				n = i;
			}
			else {
				cnt++;
			}
		}
		String s;
		if(cnt == 5) {
			s = word + " 은 없습니다.";
		}
		else {
			s = word + " 은 " + eng[n]; 
		}
		
		return s;
	}
}


public class Main {

	public static void main(String[] args) {
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("한글 단어 : ");
			String word = sc.next();
			if(word.equals("그만")) {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println(Dictionary.kor2Eng(word));
			}
		}
	}

}
