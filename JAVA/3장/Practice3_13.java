
public class Main {

	public static void main(String[] args) {
		
		for(int i = 1; i < 100; i++) {
			int n10 = i / 10;
			int n1 = i % 10;
			if(i > 10 && n10 % 3 == 0 && n1 % 3 == 0 && n1 > 0) {
				System.out.println(i + " ¹Ú¼ö Â¦Â¦");
			}
			else if(n1 % 3 == 0) {
				System.out.println(i + " ¹Ú¼ö Â¦");
			}
		}

	}

}
